package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropPage {

    // locators
    private SelenideElement
            columnA = $("#column-a"),
            columnB = $("#column-b");

    // actions
    public void openDragAndDropPage() {
        open("/drag_and_drop");
        columnA.$("header").shouldHave(text("A"));
    }

    public DragAndDropPage dragRectangleAToB() {
        columnA.dragAndDropTo(columnB);
        return this;
    }

    public void checkingCompletionReplacement() {
        columnA.$("header").shouldHave(text("B"));
        columnB.$("header").shouldHave(text("A"));
    }

}