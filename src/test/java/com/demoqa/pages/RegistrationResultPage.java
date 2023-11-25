package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultPage {
    SelenideElement finalResult = $(".table-responsive");

    public RegistrationResultPage checkFinalResultStudentName(String value) {
        finalResult.$(byText("Student Name")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultStudentEmail(String value) {
        finalResult.$(byText("Student Email")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultGender(String value) {
        finalResult.$(byText("Gender")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultMobile(String value) {
        finalResult.$(byText("Mobile")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultDateOfBirth(String value) {
        finalResult.$(byText("Date of Birth")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultSubjects(String value) {
        finalResult.$(byText("Subjects")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultHobbies(String value) {
        finalResult.$(byText("Hobbies")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultPicture(String value) {
        finalResult.$(byText("Picture")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultAddress(String value) {
        finalResult.$(byText("Address")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationResultPage checkFinalResultStateAndCity(String value) {
        finalResult.$(byText("State and City")).parent().shouldHave(text(value));
        return this;
    }
}
