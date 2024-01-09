package com.avito.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchPages {
    SelenideElement buttonAllCategories = $("#a").parent().parent().parent().$(byText("Все категории"));
    SelenideElement buttonElectronics = $(".new-rubricator-content-leftcontent-_hhyV");
    SelenideElement fieldMobilePhone = $("[data-name='Электроника']").parent().sibling(0).$("[data-name='Мобильные телефоны']");
    SelenideElement fieldManufacturer = $("[placeholder='Производитель']");
    SelenideElement filedfromManufacturer = $("[data-placement='bottom-start']");
    SelenideElement buttonSearch = $("button[data-marker='search-filters/submit-button']");

    public SearchPages openPage() {
        open("https://www.avito.ru/");
        return this;
    }

    public SearchPages buttonAllCategoriesClick () {
        buttonAllCategories.click();
        return this;
    }

    public SearchPages buttonElectronicsHover (String value) {
        buttonElectronics.$(byText(value)).hover();;
        return this;
    }

    public SearchPages fieldMobilePhoneClick () {
        fieldMobilePhone.click();
        return this;
    }

    public SearchPages fieldManufacturerSet (String value) {
        fieldManufacturer.setValue(value);
        return this;
    }
    public SearchPages filedfromManufacturerClick (String value) {
        filedfromManufacturer.$(byText(value)).click();
        return this;
    }

    public SearchPages buttonSearchClick () {
        buttonSearch.click();
        return this;
    }
    public SearchPages checkElementsFromCollection (String value) {
        value = ".*" + value + ".*";
//        String value = ".*iPhone.*";
        List<String> texts = $$("[data-marker='catalog-serp'] [itemprop='name']").texts();
        for (String text : texts) {
            assert (text).matches(value);
        }
        return this;
    }

}
