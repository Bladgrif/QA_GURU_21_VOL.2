package com.avito.tests;

import com.avito.base.TestBase;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class CheckCarsCategoryAndSubcategory extends TestBase {
    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Checking the 'Cars' category and its subcategories from the catalog")
    void checkCategoryCarsAndSubcategoryFromMainPage() {
        open("https://www.avito.ru/");
//        $("[data-marker='more-popup/reference']").$(byText("Все категории")).click();
        $("#a").parent().parent().parent().$(byText("Все категории")).click();

        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Транспорт")).hover();
        $("[data-name='Транспорт']").shouldHave(text("Транспорт"));
        $("[data-name='Транспорт']").parent().sibling(0).$("[data-name='Автомобили']").shouldHave(text("Автомобили"));
        $("[data-name='Транспорт']").parent().sibling(0).$("[data-name='Мотоциклы и мототехника']").shouldHave(text("Мотоциклы и мототехника"));
        $("[data-name='Транспорт']").parent().sibling(0).$("[data-name='Грузовики и спецтехника']").shouldHave(text("Грузовики и спецтехника"));
        $("[data-name='Транспорт']").parent().sibling(0).$("[data-name='Водный транспорт']").shouldHave(text("Водный транспорт"));
        $("[data-name='Транспорт']").parent().sibling(0).$("[data-name='Запчасти и аксессуары']").shouldHave(text("Запчасти и аксессуары"));
    }
}
