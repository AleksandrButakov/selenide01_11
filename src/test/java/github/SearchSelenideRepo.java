package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class SearchSelenideRepo {

    @Test
    void shouldFindSelenideInGithub() {
        // открыть страницу GitHub
        open("https://github.com");
        // ввести в поле поиска selenide и нажать Enter
        $("[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        // нажимаем на линк от первого результата поиска

        // check: в заголовке встречается selenide/selenide

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
