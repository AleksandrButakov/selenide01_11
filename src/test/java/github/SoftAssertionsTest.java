package github;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.SoftAssertionPage;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {

    SoftAssertionPage softAssertion = new SoftAssertionPage();
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
    }

}