package com.avito.tests;

import com.avito.base.TestBase;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class FilteringSearch extends TestBase {
    @Test
    void FilteringSearchResults() {
        open("https://www.avito.ru/");
        $("#a").parent().parent().parent().$(byText("Все категории")).click();

        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Электроника")).hover();
        $("[data-name='Электроника']").parent().sibling(0).$("[data-name='Мобильные телефоны']").click();
        $("[placeholder='Производитель']").setValue("Apple");
        $("[data-placement='bottom-start']").$(byText("Apple")).click();
        $("button[data-marker='search-filters/submit-button']").click();
        List<String> texts = $$("[data-marker='catalog-serp'] [itemprop='name']").texts();
        for (String text : texts) {
            assert (text).matches(".*iPhone.*");
        }
        sleep(2000);
    }
}
