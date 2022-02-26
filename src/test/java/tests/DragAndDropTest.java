package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.DragAndDropPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://the-internet.herokuapp.com";
        browserPosition = "0x0";
        browserSize = "1920x1080";
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    @DisplayName("DrapAndDrop programming with selenide")
    void programmingDrapAndDrop() {

        // Откройем https://the-internet.herokuapp.com/drag_and_drop
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage
                // перенесем прямоугольник А на место В
                .dragRectangleAToB()
                // проверим что прямоугольники действительно поменялись
                .checkingCompletionReplacement();
    }

}
