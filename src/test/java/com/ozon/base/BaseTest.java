package com.ozon.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeAll() {
//        Configuration.baseUrl = "https://www.ozon.ru/";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
}
