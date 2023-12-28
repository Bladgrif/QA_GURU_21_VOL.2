package com.avito.tests;

import com.avito.base.TestBase;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FilteringSearch extends TestBase {
    @Test
    void FilteringSearchResults() {
        open("https://www.avito.ru/");
        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Электроника")).hover();
        $("[data-name='Телефоны']").parent().sibling(0).$("[data-name='Телефоны']").click();
        sleep(2000);
    }
}
