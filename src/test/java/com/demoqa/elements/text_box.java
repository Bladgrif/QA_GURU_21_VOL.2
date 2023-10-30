package com.demoqa.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class text_box {

    @BeforeEach
    void setUp() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";

    }

    @Test
    void fileFormTest() {
        open("/text-box");
        $("#userName").setValue("Roman Grigorev");
        $("#userEmail").setValue("Roman@gmail.com");
        $("#currentAddress").setValue("Cheboksary");
        $("#permanentAddress").setValue("Cheboksary-2");
        $("#submit").click();

        $("#output #name").shouldHave(text("Roman Grigorev"));
        $("#output #email").shouldHave(text("Roman@gmail.com"));
        $("#output #currentAddress").shouldHave(text("Cheboksary"));
        $("#output #permanentAddress").shouldHave(text("Cheboksary-2"));
    }
}
