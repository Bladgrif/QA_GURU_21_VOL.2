package com.avito.tests;

import com.avito.base.TestBase;
import com.avito.pages.FilteringSearchPage;
import com.avito.pages.ProductSearchPage;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

@Tag("home")
@Feature("Check Category on main page")
@Owner("Roman Grigorev")

public class ProductSearch extends TestBase {
    ProductSearchPage productSearchPage = new ProductSearchPage();
    String model = "iPhone";

    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("In the search bar, enter the phone model, check the search results")
    void ProductSearchByKeyword() {
        productSearchPage.openPage()
                .setFieldSearch(model)
                .checkElementsFromCollection(model);
    }
}
