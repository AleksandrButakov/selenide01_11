package github;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DifferenceSelectorTest {

    String h1SpaceClass, h1DotClass;

    @BeforeEach
    void beforeEach() {
        baseUrl = "https://github.com";
        browserPosition = "0x0";
        browserSize = "1920x1080";
    }

    @AfterEach
    void afterEach() {
        closeWebDriver();
    }

    @Test
    @DisplayName("The difference of selectors is $(\"h1 div\") and $(\"h1\").$(\"div\")")
    void differenceSelector() {
        /* Задание:
         * Есть ли разница между $("h1 div"); и $("h1").$("div"); - может ли привести к тому что, поиск
         * найдёт разные элементы?
         */

        open("/selenide/selenide");

        /* селектор "h1 .anchor" находит элемент h1 с классом anchor в одном из его детей
         * таким образом несмотря на одинарный знак $ находим второй по порядку элемент 1: h1
         * $$("h1")
            (2) [h1.d-flex.flex-wrap.flex-items-center.wb-break-word.f3.text-normal, h1]
            0: h1.d-flex.flex-wrap.flex-items-center.wb-break-word.f3.text-normal
            1: h1
            length: 2
            [[Prototype]]: Array(0)
         */

        // $("h1 div");
        h1SpaceClass = $("h1 .anchor").attr("href");
        // и выводим значение его атрибута href в консоль
        System.out.println("$(\"h1 div\") find: " + h1SpaceClass);

        // $("h1").$("div");
        try {
            // при таком поиске находим сначала тег h1 c индексом 0 (0: h1.d-flex.fle....) и далее ищем
            // класс anchor. Так как в нулевом теге нет такого класса получим в нашем случае исключение,
            // в реальной ситуации "упавший тест"
            h1DotClass = $("h1").$(".anchor").attr("href");
            System.out.println("$(\"h1\").$(\"div\") find: " + h1SpaceClass);
        } catch (com.codeborne.selenide.ex.ElementNotFound e) {
            System.out.println("Element not found :-(");
        }
    }

}
