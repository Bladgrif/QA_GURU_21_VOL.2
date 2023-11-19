package com.github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class hoverBySolntcevTest {

    @BeforeAll
    static void beforeAll() {
        baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void findAssertions() {
        open("/selenide/selenide");
        $("[href='https://github.com/asolntsev']").$("[alt='@asolntsev']").hover();
        $("#site-details-dialog").sibling(0).$(byText("asolntsev")).shouldHave(text("asolntsev"));
    }
}
