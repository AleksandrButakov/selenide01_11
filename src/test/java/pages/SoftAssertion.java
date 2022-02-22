package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertion {
    // locators
    private SelenideElement
            titlePage = $("#js-repo-pjax-container").$("a.url");

    //$("#js-repo-pjax-container").$("a.url").shouldHave(text("selenide"));



    // actions
    public SoftAssertion openPage() {
        open("/selenide/selenide");
        return this;
    }

    public SoftAssertion checkPage(String value) {
        titlePage.shouldHave(text("selenide"));
        return this;
    }

}
