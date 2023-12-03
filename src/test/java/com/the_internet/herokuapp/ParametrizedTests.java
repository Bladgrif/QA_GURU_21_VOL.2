package com.the_internet.herokuapp;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.the_internet.herokuapp.pages.ParametrizedTestsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.*;

public class ParametrizedTests {

    ParametrizedTestsPage parametrizedTestsPage = new ParametrizedTestsPage();

    @ParameterizedTest(name = "After switching to a {0}, its name is displayed at the top")
    @ValueSource(strings = {
            "Broken Images",
            "Add/Remove Elements"
    })
    void CheckingNameAfterSwitching(String category) {
        parametrizedTestsPage.openPage()
                .openCategory(category)
                .checkNameOfPage(category);
    }

    @ParameterizedTest(name = "After switching to a {0}, its description is displayed at the page")
    @CsvFileSource(resources = "/DescriptionInputCategory.csv")
    void CheckingDescriptionAfterSwitching(String category, String description) {
        parametrizedTestsPage.openPage()
                .openCategory(category)
                .checkDescriptionOfPage(description);
    }
}
