package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationFormPage {

    SelenideElement firstName =  $("#firstName"),
                    lastName =  $("#lastName"),
                    userEmail =  $("#userEmail"),
                    userNumber =  $("#userNumber"),
                    currentAddress =  $("#currentAddress"),
                    genterWrapper =  $("#genterWrapper");

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
}
