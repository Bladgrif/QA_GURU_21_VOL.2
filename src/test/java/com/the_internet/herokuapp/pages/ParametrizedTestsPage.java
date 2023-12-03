package com.the_internet.herokuapp.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Find;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ParametrizedTestsPage {

    SelenideElement nameOfCategory = $("ul"),
            nameOfPage = $("#content h3"),
            descriptionOfPage = $("#content p");

    public ParametrizedTestsPage openPage() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        open("https://the-internet.herokuapp.com/");
        return this;
    }

    public ParametrizedTestsPage openCategory(String value) {
        nameOfCategory.find(byText(value)).click();
        return this;
    }

    public ParametrizedTestsPage checkNameOfPage(String value) {
        nameOfPage.shouldHave(text(value));
        return this;
    }

    public ParametrizedTestsPage checkDescriptionOfPage(String value) {
        descriptionOfPage.shouldHave(text(value));
        return this;
    }
}
