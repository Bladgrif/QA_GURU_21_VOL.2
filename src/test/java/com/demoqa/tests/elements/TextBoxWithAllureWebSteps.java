package com.demoqa.tests.elements;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.base.TestBase;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TextBoxWithAllureWebSteps extends TestBase {

    private static final String UserName = "Roman Grigorev";
    private static final String UserEmail = "Roman@gmail.com";
    private static final String CurrentAddress = "Cheboksary";
    private static final String PermanentAddress = "Cheboksary-2";

    @Test
    @Feature("Form TextBox")
    @Story("Elements")
    @Owner("roman_grigoriev")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Filling out the TextBox form with websteps and checking ")
    void fileFormTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        StepsWithAllure stepsWithAllure = new StepsWithAllure();

        stepsWithAllure.openPage();
        stepsWithAllure.SetUserName(UserName);
        stepsWithAllure.SetUserEmail(UserEmail);
        stepsWithAllure.SetCurrentAddress(CurrentAddress);
        stepsWithAllure.SetPermanentAddress(PermanentAddress);
        stepsWithAllure.pressButton();

        stepsWithAllure.checkResultName(UserName);
        stepsWithAllure.checkResultEmail(UserEmail);
        stepsWithAllure.checkResultCurrentAddress(CurrentAddress);
        stepsWithAllure.checkResultPermanentAddress(PermanentAddress);
    }
}
