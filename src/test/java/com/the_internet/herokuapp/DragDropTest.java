package com.the_internet.herokuapp;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragDropTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1980x1080";
    }

    @Test
    void switchByDragAndDropTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        SelenideElement sourceElement = $("#column-a");
        SelenideElement targetElement = $("#column-b");
        sourceElement.dragAndDropTo(targetElement);
        targetElement.shouldHave(text("A"));
        sourceElement.shouldHave(text("B"));
    }
}