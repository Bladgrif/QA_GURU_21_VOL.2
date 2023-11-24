package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.elements.CalendarComponents;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    CalendarComponents calendarComponents = new CalendarComponents();
    SelenideElement firstName = $("#firstName"),
            lastName = $("#lastName"),
            userEmail = $("#userEmail"),
            userNumber = $("#userNumber"),
            currentAddress = $("#currentAddress"),
            genterWrapper = $("#genterWrapper"),
            subjectsInput = $("#subjectsInput"),
            hobbiesWrapper = $("#hobbiesWrapper"),
            uploadPicture = $("#uploadPicture"),
            state = $("#state"),
            stateCity = $("#stateCity-wrapper"),
            city = $("#city"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            submit = $("#submit"),
            modalContent = $(".modal-content"),
            wordsOfGratitude = $("#example-modal-sizes-title-lg"),
            finalResult = $(".table-responsive");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        return this;
    }
    public RegistrationFormPage removeBanners() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    public RegistrationFormPage SetFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public RegistrationFormPage SetLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public RegistrationFormPage SetUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationFormPage SetUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistrationFormPage SetCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public RegistrationFormPage SetGenterWrapper(String value) {
        genterWrapper.find(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage SetHobbiesWrapper(String value) {
        hobbiesWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetUploadPicture(String value) {
        uploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationFormPage SetState(String value) {
        state.click();
        stateCity.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetCity(String value) {
        city.click();
        stateCity.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetDateOfBirthInput(String day, String month, String Year) {
        dateOfBirthInput.click();
        calendarComponents.setCalendarComponents(day, month, Year);
        return this;
    }

    public RegistrationFormPage SetSubmit() {
        submit.click();
        return this;
    }

    public RegistrationFormPage firstCheck() {
        modalContent.should(appear);
        wordsOfGratitude.shouldBe(text("Thanks for submitting the form"));
        return this;
    }

    public RegistrationFormPage checkFinalResultStudentName(String value) {
        finalResult.$(byText("Student Name")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultStudentEmail(String value) {
        finalResult.$(byText("Student Email")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultGender(String value) {
        finalResult.$(byText("Gender")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultMobile(String value) {
        finalResult.$(byText("Mobile")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultDateOfBirth(String value) {
        finalResult.$(byText("Date of Birth")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultSubjects(String value) {
        finalResult.$(byText("Subjects")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultHobbies(String value) {
        finalResult.$(byText("Hobbies")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultPicture(String value) {
        finalResult.$(byText("Picture")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultAddress(String value) {
        finalResult.$(byText("Address")).parent().shouldHave(text(value));
        return this;
    }

    public RegistrationFormPage checkFinalResultStateAndCity(String value) {
        finalResult.$(byText("State and City")).parent().shouldHave(text(value));
        return this;
    }
}
