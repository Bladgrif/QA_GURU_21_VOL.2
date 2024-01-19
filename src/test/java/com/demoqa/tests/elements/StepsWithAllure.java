package com.demoqa.tests.elements;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.TextBoxPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StepsWithAllure {

    SelenideElement userNameInput = $("#userName"),
            userEmailInput = $("#userEmail"),
            currentAddressInput = $("#currentAddress"),
            permanentAddressInput = $("#permanentAddress"),
            submit = $("#submit"),
            resultName = $("#output #name"),
            resultEmail = $("#output #email"),
            resultCurrentAddress = $("#output #currentAddress"),
            resultPermanentAddress = $("#output #permanentAddress");

    @Step("Open page")
    public void openPage() {
        open("/text-box");
    }

    @Step("Enter the user's first and last name")
    public void SetUserName(String value) {
        userNameInput.setValue(value);
    }

    @Step("Enter the user's current address")
    public void SetCurrentAddress(String value) {
        currentAddressInput.setValue(value);
    }

    @Step("Enter the second user's address")
    public void SetPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
    }

    @Step("Entering the user's email")
    public void SetUserEmail(String value) {
        userEmailInput.setValue(value);

    }

    @Step("Press Enter")
    public void pressButton() {
        submit.click();
    }

    @Step("We check the filling in of the first and last name")
    public void checkResultName(String value) {
        resultName.shouldHave(text(value));
    }

    @Step("Checking the filling of the mail")
    public void checkResultEmail(String value) {
        resultEmail.shouldHave(text(value));
    }

    @Step("Checking the address filling")
    public void checkResultCurrentAddress(String value) {
        resultCurrentAddress.shouldHave(text(value));
    }

    @Step("Checking the address filling")
    public void checkResultPermanentAddress(String value) {
        resultPermanentAddress.shouldHave(text(value));
    }
}
