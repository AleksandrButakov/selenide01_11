package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class MainContributorTest {

    @Test
    @DisplayName("Hovering the mouse over an object")
    void andreiSolntsevShouldBeTheMainContributor() {
        Configuration.browserSize="800x600";
        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(withText("Contributors"))
                .closest(".BorderGrid-row").$("ul li").hover();

        // filterBy находит коллекцию, поэтому берем первый элемент в ней first()
        $$(".Popover-message").filterBy(visible).first().shouldHave(text("Andrei Solntsev"));
        // findBy находит первый элемент, поэтому first() не нужен
        // $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

        /*
        try {
            sleep(5000);
            //$$("").get(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         */

    }

}
