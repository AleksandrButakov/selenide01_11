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
        softAssertion.openPage();
        // проверим страницу
        softAssertion.checkPage(titlePage);

        //System.out.println($("#js-repo-pjax-container").$("a.url").getText());
    }


}
