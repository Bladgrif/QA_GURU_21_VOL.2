package com.avito.tests;

import com.avito.base.TestBase;
import com.codeborne.selenide.CollectionCondition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class ProductSearch extends TestBase {
    @Test
    void ProductSearchByKeyword() {
        open("https://www.avito.ru/");
        $("[data-marker='search-form'] [data-marker='search-form/suggest']").setValue("iphone").pressEnter();
        List<String> texts = $$("[data-marker='catalog-serp'] [itemprop='name']").texts();
        for (String text : texts) {
            assert (text).matches(".*iPhone.*");
        }
    }
}
