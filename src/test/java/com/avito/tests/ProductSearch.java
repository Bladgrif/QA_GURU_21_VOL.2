package com.avito.tests;

import com.avito.base.TestBase;
import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProductSearch extends TestBase {
    int num = 0;

    @Test
    void ProductSearchMainPage() {
        open("https://www.avito.ru/");
        $("[data-marker='search-form'] [data-marker='search-form/suggest']").setValue("iphone").pressEnter();
//        $$("[data-marker='catalog-serp'] [itemprop='name']").shouldHave(CollectionCondition.containExactTextsCaseSensitive("iPhone"));
        List<String> texts = $$("[data-marker='catalog-serp'] [itemprop='name']").texts();
        for (String text : texts) {
            System.out.println(num + " - " + text);
            assert (text).matches(".*iPhone.*");
            System.out.println("Checking on IPhone is sucesfull");
            num++;
        }

    }
}
