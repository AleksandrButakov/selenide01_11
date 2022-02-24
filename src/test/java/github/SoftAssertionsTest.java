package github;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.SoftAssertion;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {

    SoftAssertion softAssertion = new SoftAssertion();
    String titlePage = "selenide";

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://github.com";
        browserPosition = "0x0";
        browserSize = "1920x1080";
    }

    @AfterAll
    static void afterAll() {
        closeWebDriver();
    }

    @Test
    void setSoftAssertion() {

        softAssertion
                .openPage()                             // откроем страницу Selenide в Github
                .checkPage(titlePage)                   // проверим что открылась нужная страница
                .openWikiPage()                         // перейти в раздел Wiki проекта
                .checkSoftAssertionPage()  // убедиться что в списке есть страница SoftAssertions
                .clickSoftAssertion()      // откроем SoftAssertions, проверим что есть код JUnit5
                .checkCodeJunit5();

        // 3. (опциональное) Запрограммируем Drag&Drop с помощью Selenide.actions()


        // Откройем https://the-internet.herokuapp.com/drag_and_drop


        // перенесем прямоугольник А на место В


        // проверим что прямоугольники действительно поменялись


        /* P.S. В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
         * (раньше не работала из-за ошибки в ChromeDriver, но может быть уже починили? :-)).
         * Если работает - сообщите в группе курса.
         */


    }

}