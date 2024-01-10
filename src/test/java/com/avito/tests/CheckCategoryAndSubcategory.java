package com.avito.tests;

import com.avito.base.TestBase;
import com.avito.pages.CheckSomeCategoryAndSubcategoryPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class CheckCategoryAndSubcategory extends TestBase {

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

        checkSomeCategoryAndSubcategoryPage.openPage()
                .mainButtonAllCategoriesClick()
                .buttonTransportFromCatalogHover(category)
                .checkMainTextAfterButtonFromCatalogHover(category)
                .checkSubcategorysTextAfterButtonFromCatalogHover(category);
    }
}
