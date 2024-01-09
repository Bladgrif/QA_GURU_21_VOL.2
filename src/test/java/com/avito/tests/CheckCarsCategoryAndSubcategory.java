package com.avito.tests;

import com.avito.base.TestBase;
import com.avito.pages.CheckSomeCategoryAndSubcategoryPages;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class CheckCarsCategoryAndSubcategory extends TestBase {

    CheckSomeCategoryAndSubcategoryPages checkSomeCategoryAndSubcategoryPages = new CheckSomeCategoryAndSubcategoryPages();
    String category = "Транспорт";

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Checking the 'Cars' category and its subcategories from the catalog")
    void checkCategoryCarsAndSubcategoryFromMainPage() {

        checkSomeCategoryAndSubcategoryPages.openPage()
                .mainButtonAllCategoriesClick()
                .buttonTransportFromCatalogHover(category)
                .checkMainTextAfterButtonFromCatalogHover(category)
                .checkSubcategorysTextAfterButtonFromCatalogHover(category);
    }
}
