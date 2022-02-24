package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.SoftAssertion;

import static com.codeborne.selenide.Condition.text;
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
        // откроем страницу Selenide в Github
        softAssertion.openPage();

        // проверим что открылась нужная страница
        softAssertion.checkPage(titlePage);

        // перейти в раздел Wiki проекта
        softAssertion.openWikiPage();

        // убедиться что в списке страниц (Pages) есть страница SoftAssertions
        softAssertion.checkSoftAssertionPage();

        // откроем страницу SoftAssertions, проверим что внутри есть пример кода для JUnit5


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