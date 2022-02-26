package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionPage {

    // locators
    private SelenideElement
            titlePage = $("#js-repo-pjax-container").$("a.url"),
            tabWiki = $("#wiki-tab"),
            linkSoftAssertion = $(".markdown-body").$(byText("Soft assertions")),
            junit5Text = $(byAttribute("start", "3"));

    // открытие страницы
    public SoftAssertionPage openPage() {
        open("/selenide/selenide");
        return this;
    }

    // проверка открытия страницы selenide
    public SoftAssertionPage checkPage(String value) {
        titlePage.shouldHave(text(value));
        return this;
    }

    // клик по вкладке Wiki
    public SoftAssertionPage openWikiPage() {
        tabWiki.click();
        return this;
    }

    // проверка наличия ссылки на Soft assertion
    public SoftAssertionPage checkSoftAssertionPage() {
        linkSoftAssertion.shouldHave(text("Soft assertion"));
        return this;
    }

    // клик по ссылке Soft assertion
    public SoftAssertionPage clickSoftAssertion() {
        linkSoftAssertion.click();
        return this;
    }

    // проверка наличия кода JUnit5
    public SoftAssertionPage checkCodeJunit5() {
        junit5Text.shouldHave(text("JUnit5"));
        return this;
    }

}