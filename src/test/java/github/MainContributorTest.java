package github;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class MainContributorTest {

    @Test
    @DisplayName("Наведение мыши")
    void andreiSolntsevShouldBeTheMainContributor() {
        // открыть страницу репозитория selenide
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(withText("Contributors"))
                .closest(".BorderGrid-row").$("ul li").hover();
        
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
