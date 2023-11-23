package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.elements.CalendarComponents;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {
    CalendarComponents calendarComponents = new CalendarComponents();
    SelenideElement firstName =  $("#firstName"),
                    lastName =  $("#lastName"),
                    userEmail =  $("#userEmail"),
                    userNumber =  $("#userNumber"),
                    currentAddress =  $("#currentAddress"),
                    genterWrapper =  $("#genterWrapper"),
                    subjectsInput =  $("#subjectsInput"),
                    hobbiesWrapper =  $("#hobbiesWrapper"),
                    uploadPicture =  $("#uploadPicture"),
                    state =  $("#state"),
                    stateCity =  $("#stateCity-wrapper"),
                    city =  $("#city");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
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
        s
        return this;
    }
}
