package com.avito.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckSomeCategoryAndSubcategoryPage {
    SelenideElement mainButtonAllCategories = $("#a").parent().parent().parent().$(byText("Все категории")),
            buttonFromCatalog = $(".new-rubricator-content-leftcontent-_hhyV"),
            textButtonFromCatalogTransport = $("[data-name='Транспорт']"),
            textButtonFromCatalogRealty = $("[data-name='Недвижимость']"),
            textButtonFromCatalogJob = $("[data-name='Работа']");


    String[] TransportList = {"Мотоциклы и мототехника", "Грузовики и спецтехника", "Водный транспорт", "Запчасти и аксессуары"},
            JobList = {"Ищу работу", "Ищу сотрудника"},
            RealtyList = {"Купить жильё", "Снять посуточно", "Снять долгосрочно", "Коммерческая недвижимость", "Другие категории"};

    public CheckSomeCategoryAndSubcategoryPage openPage() {
        open("https://www.avito.ru/");
        return this;
    }

    public CheckSomeCategoryAndSubcategoryPage mainButtonAllCategoriesClick() {
        mainButtonAllCategories.click();
        return this;
    }

    public CheckSomeCategoryAndSubcategoryPage buttonTransportFromCatalogHover(String category) {
        buttonFromCatalog.$(byText(category)).hover();
        ;
        return this;
    }

    public CheckSomeCategoryAndSubcategoryPage checkMainTextAfterButtonFromCatalogHover(String category) {
        switch (category) {
            case ("Транспорт"):
                textButtonFromCatalogTransport.shouldHave(text(category));
                break;
            case ("Работа"):
                textButtonFromCatalogJob.shouldHave(text(category));
                break;
            case ("Недвижимость"):
                textButtonFromCatalogRealty.shouldHave(text(category));
                break;
        }
        return this;
    }

    public CheckSomeCategoryAndSubcategoryPage checkSubcategorysTextAfterButtonFromCatalogHover(String category) {
        switch (category) {
            case ("Транспорт"):
                checkCategoriesLists(category, TransportList);
                break;
            case ("Работа"):
                checkCategoriesLists(category, JobList);
                break;
            case ("Недвижимость"):
                checkCategoriesLists(category, RealtyList);
                break;
        }
        return this;
    }

    public CheckSomeCategoryAndSubcategoryPage checkCategoriesLists(String mainCategory, String[] List) {
        String badMoment2 = "[data-name='" + mainCategory + "']";
        for (String category : List) {
            String badMoment = "[data-name='" + category + "']";
            SelenideElement textCategoriesFromCatalog = $(badMoment2).parent().sibling(0);
            textCategoriesFromCatalog.$(badMoment).shouldHave(text(category));
        }
        return this;
    }

}
