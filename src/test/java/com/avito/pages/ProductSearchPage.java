package com.avito.pages;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProductSearchPage {

    SelenideElement fieldSearch = $("[data-marker='search-form'] [data-marker='search-form/suggest']");

    public ProductSearchPage openPage() {
        open("https://www.avito.ru/");
        return this;
    }

    public ProductSearchPage setFieldSearch(String value) {
        fieldSearch.setValue(value).pressEnter();;
        return this;
    }

    public ProductSearchPage checkElementsFromCollection (String value) {
        value = ".*" + value + ".*";
//        String value = ".*iPhone.*";
        List<String> texts = $$("[data-marker='catalog-serp'] [itemprop='name']").texts();
        for (String text : texts) {
            assert (text).matches(value);
        }
        return this;
    }
}
