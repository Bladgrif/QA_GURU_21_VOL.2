package com.demoqa.elements;

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

    @Step("Открываем страницу")
    public void openPage() {
        open("/text-box");
    }

    @Step("Вводим имя и фамилию пользователя")
    public void SetUserName(String value) {
        userNameInput.setValue(value);
    }

    @Step("Вводим текущий адрес пользователя")
    public void SetCurrentAddress(String value) {
        currentAddressInput.setValue(value);
    }

    @Step("Вводим второй адрес пользователя")
    public void SetPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
    }

    @Step("Вводим почту пользователя")
    public void SetUserEmail(String value) {
        userEmailInput.setValue(value);

    }

    @Step("Нажимаем Enter")
    public void pressButton() {
        submit.click();
    }

    @Step("Проверяем заполнение имени и фамилии")
    public void checkResultName(String value) {
        resultName.shouldHave(text(value));
    }

    @Step("Проверяем заполнение почты")
    public void checkResultEmail(String value) {
        resultEmail.shouldHave(text(value));
    }

    @Step("Проверяем заполнение адреса")
    public void checkResultCurrentAddress(String value) {
        resultCurrentAddress.shouldHave(text(value));
    }

    @Step("Проверяем заполнение адреса")
    public void checkResultPermanentAddress(String value) {
        resultPermanentAddress.shouldHave(text(value));
    }
}
