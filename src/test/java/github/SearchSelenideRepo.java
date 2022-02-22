package github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;

public class SearchSelenideRepo {

    @Test
    @DisplayName("Checking the presence of text on the page")
    void shouldFindSelenideInGithub() {
        // открыть страницу GitHub
        open("https://github.com");
        // ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        // нажимаем на линк от первого результата поиска
        //$$("ul.repo-list li").first().$("a").click();
        $("ul.repo-list").$("li").$("a").click();
        // check: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));

        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

// ARRANGE
// ACT
// ACT
// ACT
// ASSERT