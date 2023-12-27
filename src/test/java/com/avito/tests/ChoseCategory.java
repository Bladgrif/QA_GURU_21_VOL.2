package com.avito.tests;

import com.avito.base.TestBase;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ChoseCategory extends TestBase {

    @Test
    @DisplayName("Checking the availability of all categories in the Product Catalog")
    void checkCategotyAndSubcategory() {
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


        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Недвижимость")).hover();
        $("[data-name='Недвижимость']").shouldHave(text("Недвижимость"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Купить жильё']").shouldHave(text("Купить жильё"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять посуточно']").shouldHave(text("Снять посуточно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять долгосрочно']").shouldHave(text("Снять долгосрочно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Снять долгосрочно']").shouldHave(text("Снять долгосрочно"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Коммерческая недвижимость']").shouldHave(text("Коммерческая недвижимость"));
        $("[data-name='Недвижимость']").parent().sibling(0).$("[data-name='Другие категории']").shouldHave(text("Другие категории"));

        $(".new-rubricator-content-leftcontent-_hhyV").$(byText("Работа")).hover();
        $("strong[data-name='Работа']").shouldHave(text("Работа"));
        $("[data-name='Работа']").parent().sibling(0).$("[data-name='Ищу работу']").shouldHave(text("Ищу работу"));
        $("[data-name='Работа']").parent().sibling(0).$("strong[data-name='Ищу сотрудника']").shouldHave(text("Ищу сотрудника"));
    }
}
