package com.demoqa.forms;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class practice_form {
    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void sucessfullRegistrationFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Roman");
        $("#lastName").setValue("Grigorev");
        $("#userEmail").setValue("Grigorev@mail.ru");

        $("#genterWrapper").find(byText("Female")).click(); //good
//        $("#gender-radio-3").parent().click(); //good

        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
//        $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__year-select").selectOption("2007");
        $("[aria-label='Choose Sunday, May 6th, 2007']").click();
        $("#subjectsInput").setValue("Accounting").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#uploadPicture").uploadFromClasspath("src/test/resources/1.png");
        $("#currentAddress").setValue("Russia street");


        sleep(10000);
    }
}
