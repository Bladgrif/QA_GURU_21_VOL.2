package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    SelenideElement userName = $("#userName"),
     userEmail = $("#userEmail"),
     currentAddress = $("#currentAddress"),
     permanentAddress = $("#permanentAddress"),
     submit = $("#submit"),
     resultName = $("#output #name"),
     resultEmail = $("#output #email"),
     resultCurrentAddress = $("#output #currentAddress"),
     resultPermanentAddress = $("#output #permanentAddress");

    public TextBoxPage openPage() {
        open("/text-box");
        return this;
    }
    public TextBoxPage SetUserName(String value) {
        userName.setValue(value);
        return this;
    }
    public TextBoxPage SetCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }
    public TextBoxPage SetPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }
    public TextBoxPage SetUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }
    public TextBoxPage pressButton() {
        submit.click();
        return this;
    }

    public TextBoxPage checkResultName(String value) {
        resultName.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkResultEmail(String value) {
        resultEmail.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkResultCurrentAddress(String value) {
        resultCurrentAddress.shouldHave(text(value));
        return this;
    }
    public TextBoxPage checkResultPermanentAddress(String value) {
        resultPermanentAddress.shouldHave(text(value));
        return this;
    }

}
