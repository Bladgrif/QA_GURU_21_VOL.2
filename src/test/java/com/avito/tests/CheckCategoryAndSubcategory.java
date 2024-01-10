package com.avito.tests;

import com.avito.base.RemoteTestBase;
import com.avito.base.TestBase;
import com.avito.pages.CheckSomeCategoryAndSubcategoryPage;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("remote_avito")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class CheckCategoryAndSubcategory extends RemoteTestBase {

    CheckSomeCategoryAndSubcategoryPage checkSomeCategoryAndSubcategoryPage = new CheckSomeCategoryAndSubcategoryPage();

    @ParameterizedTest(name = "Checking the category {0} and its subcategories in the catalog")
    @ValueSource(strings = {
            "Транспорт",
            "Работа",
            "Недвижимость"
    })
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Checking the category and its subcategories from the catalog")
    void checkCategoryCarsAndSubcategoryFromMainPage(String category) {
        SelenideLogger.addListener("allure", new AllureSelenide());

        checkSomeCategoryAndSubcategoryPage.openPage()
                .mainButtonAllCategoriesShouldBeVisible()
                .mainButtonAllCategoriesClick()
                .buttonFromCatalogHover(category)
                .checkMainTextAfterButtonFromCatalogHover(category)
                .checkSubcategorysTextAfterButtonFromCatalogHover(category);
    }
}
