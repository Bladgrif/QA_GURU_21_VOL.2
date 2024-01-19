package com.demoqa.tests.elements;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.demoqa.base.TestBase;
import com.demoqa.pages.TextBoxPage;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TextBoxWithAllure extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    @Feature("Form TextBox")
    @Story("Elements")
    @Owner("roman_grigoriev")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Filling out the TextBox form and checking")
    void fileFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Opening the main page", () -> {
            textBoxPage.openPage();
        });
        step("Filling in the fields", () -> {
            textBoxPage.SetUserName("Roman Grigorev")
                    .SetUserEmail("Roman@gmail.com")
                    .SetCurrentAddress("Cheboksary")
                    .SetPermanentAddress("Cheboksary-2")
                    .pressButton();
        });
        step("We check the completed fields", () -> {
            textBoxPage.checkResultName("Roman Grigorev")
                    .checkResultEmail("Roman@gmail.com")
                    .checkResultCurrentAddress("Cheboksary")
                    .checkResultPermanentAddress("Cheboksary-2");
        });
    }


}
