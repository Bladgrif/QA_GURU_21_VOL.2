package com.avito;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class avitoCom {
    @BeforeAll
    static void beforeAll() {
//        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void name() {
        open("https://www.avito.ru/");
        $("[data-marker='more-popup/reference']").$(byText("Все категории")).click();

        sleep(4000);
    }
}
