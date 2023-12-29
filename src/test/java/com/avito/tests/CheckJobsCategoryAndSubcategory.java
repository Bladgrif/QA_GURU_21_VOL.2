package com.avito.tests;

import com.avito.base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckJobsCategoryAndSubcategory extends TestBase {
    @Test
    @DisplayName("Checking the 'Jobs' category and its subcategories from the catalog")
    void checkCategoryJobsAndSubcategoryFromMainPage() {
        open("https://www.avito.ru/");
//        $("[data-marker='more-popup/reference']").$(byText("Все категории")).click();
        $("#a").parent().parent().parent().$(byText("Все категории")).click();

        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Работа")).hover();
        $("strong[data-name='Работа']").shouldHave(text("Работа"));
        $("[data-name='Работа']").parent().sibling(0).$("[data-name='Ищу работу']").shouldHave(text("Ищу работу"));
        $("[data-name='Работа']").parent().sibling(0).$("strong[data-name='Ищу сотрудника']").shouldHave(text("Ищу сотрудника"));
    }
}
