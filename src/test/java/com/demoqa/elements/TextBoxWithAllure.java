package com.demoqa.elements;

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
    @Feature("Форма TextBox")
    @Story("Elements")
    @Owner("roman_grigoriev")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Filling out the TextBox form and checking")
    void fileFormTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> {
            textBoxPage.openPage();
        });
        step("Заполняем поля", () -> {
            textBoxPage.SetUserName("Roman Grigorev")
                    .SetUserEmail("Roman@gmail.com")
                    .SetCurrentAddress("Cheboksary")
                    .SetPermanentAddress("Cheboksary-2")
                    .pressButton();
        });
        step("Проверяем заполенные поля", () -> {
            textBoxPage.checkResultName("Roman Grigorev")
                    .checkResultEmail("Roman@gmail.com")
                    .checkResultCurrentAddress("Cheboksary")
                    .checkResultPermanentAddress("Cheboksary-2");
        });
    }


}
