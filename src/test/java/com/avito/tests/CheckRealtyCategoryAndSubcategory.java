package com.avito.tests;

import com.avito.base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckRealtyCategoryAndSubcategory extends TestBase {

    @Test
    @DisplayName("Checking the 'Realty' category and its subcategories from the catalog")
    void checkCategoryRealtyAndSubcategoryFromMainPage() {
        open("https://www.avito.ru/");
//        $("[data-marker='more-popup/reference']").$(byText("Все категории")).click();
        $("#a").parent().parent().parent().$(byText("Все категории")).click();

        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Недвижимость")).hover();
        $("[data-name='Недвижимость']").shouldHave(text("Недвижимость"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Купить жильё']").shouldHave(text("Купить жильё"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять посуточно']").shouldHave(text("Снять посуточно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять долгосрочно']").shouldHave(text("Снять долгосрочно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять долгосрочно']").shouldHave(text("Снять долгосрочно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Коммерческая недвижимость']").shouldHave(text("Коммерческая недвижимость"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Другие категории']").shouldHave(text("Другие категории"));

    }
}
