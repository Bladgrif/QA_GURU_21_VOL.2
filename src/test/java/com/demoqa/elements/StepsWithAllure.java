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

    @Step("��������� ��������")
    public void openPage() {
        open("/text-box");
    }

    @Step("������ ��� � ������� ������������")
    public void SetUserName(String value) {
        userNameInput.setValue(value);
    }

    @Step("������ ������� ����� ������������")
    public void SetCurrentAddress(String value) {
        currentAddressInput.setValue(value);
    }

    @Step("������ ������ ����� ������������")
    public void SetPermanentAddress(String value) {
        permanentAddressInput.setValue(value);
    }

    @Step("������ ����� ������������")
    public void SetUserEmail(String value) {
        userEmailInput.setValue(value);

    }

    @Step("�������� Enter")
    public void pressButton() {
        submit.click();
    }

    @Step("��������� ���������� ����� � �������")
    public void checkResultName(String value) {
        resultName.shouldHave(text(value));
    }

    @Step("��������� ���������� �����")
    public void checkResultEmail(String value) {
        resultEmail.shouldHave(text(value));
    }

    @Step("��������� ���������� ������")
    public void checkResultCurrentAddress(String value) {
        resultCurrentAddress.shouldHave(text(value));
    }

    @Step("��������� ���������� ������")
    public void checkResultPermanentAddress(String value) {
        resultPermanentAddress.shouldHave(text(value));
    }
}
