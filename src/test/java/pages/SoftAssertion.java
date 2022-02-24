package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertion {
    // locators
    private SelenideElement
            titlePage = $("#js-repo-pjax-container").$("a.url"),
            tabWiki = $("#wiki-tab"),
            // linkSoftAssertion = $(".markdown-body").$("ul").$("li").$("a.internal");
            linkSoftAssertion = $(".markdown-body").$(byText("Soft assertions"));

    // открытие страницы
    public SoftAssertion openPage() {
        open("/selenide/selenide");
        return this;
    }

    // проверка открытия страницы selenide
    public SoftAssertion checkPage(String value) {
        titlePage.shouldHave(text("selenide"));
        return this;
    }

    // клик по вкладке Wiki
    public SoftAssertion openWikiPage() {
        tabWiki.click();
        return this;
    }

    // проверка наличия ссылки на Soft assertion
    public SoftAssertion checkSoftAssertionPage() {

        //linkSoftAssertion.click();
        sleep(1000);
        //linkSoftAssertion.click();
        System.out.println("Атрибут href: " + linkSoftAssertion.getAttribute("href"));
        System.out.println("Атрибут href: " + linkSoftAssertion.getText());
        return this;
    }

}
