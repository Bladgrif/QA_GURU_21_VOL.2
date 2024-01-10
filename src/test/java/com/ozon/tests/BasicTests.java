package com.ozon.tests;

import com.ozon.base.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class BasicTests extends BaseTest {

    @Test
    void name() {
        open("https://www.wildberries.ru/");
        $("input#searchInput").setValue("iPhone");
        $("button#applySearchBtn").shouldBe(visible).click();
        List<String> texts = $$("article .product-card__name").texts();
        for (String text : texts) {
            assert (text).matches(".*iPhone.*");
        }
        sleep(4000);

    }
}
