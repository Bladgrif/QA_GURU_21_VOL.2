package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.elements.CalendarComponents;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    CalendarComponents calendarComponents = new CalendarComponents();
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber"),
            currentAddressInput = $("#currentAddress"),
            genderWrapperInput = $("#genterWrapper"),
            subjectsInputInput = $("#subjectsInput"),
            hobbiesWrapperInput = $("#hobbiesWrapper"),
            uploadPictureInput = $("#uploadPicture"),
            stateInput = $("#state"),
            stateCityInput = $("#stateCity-wrapper"),
            cityInput = $("#city"),
            dateOfBirthInput = $("#dateOfBirthInput"),
            submit = $("#submit"),
            modalContent = $(".modal-content"),
            wordsOfGratitude = $("#example-modal-sizes-title-lg");


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
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage SetLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationFormPage SetUserEmail(String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationFormPage SetUserNumber(String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationFormPage SetCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationFormPage SetGenderWrapper(String value) {
        genderWrapperInput.find(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetSubjectsInput(String value) {
        subjectsInputInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationFormPage SetHobbiesWrapper(String value) {
        hobbiesWrapperInput.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetUploadPicture(String value) {
        uploadPictureInput.uploadFromClasspath(value);
        return this;
    }

    public RegistrationFormPage SetState(String value) {
        stateInput.click();
        stateCityInput.$(byText(value)).click();
        return this;
    }

    public RegistrationFormPage SetCity(String value) {
        cityInput.click();
        stateCityInput.$(byText(value)).click();
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

    public RegistrationFormPage checkThatTheSiteHasOpened() {
        modalContent.should(appear);
        wordsOfGratitude.shouldBe(text("Thanks for submitting the form"));
        return this;
    }

}
