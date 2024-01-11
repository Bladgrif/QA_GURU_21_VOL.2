package com.wildberies.tests;

import com.wildberies.pages.WildberriesTestPage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static com.codeborne.selenide.Selenide.sleep;

public class WildberriesTestBase extends TestBase {
    WildberriesTestPage wildberriesTestPage = new WildberriesTestPage();

    @ValueSource(strings = {
            "Мужчинам",
            "Женщинам"
    })

    @ParameterizedTest
    void checkingSubtitleDirectoryMatchesDirectory(String directory) {
        wildberriesTestPage.openPage()
                .waitUntilCurrencyDropdownLoads()
                .openCatalogNavbarLink()
                .openMenuBurger(directory)
                .checkCatalogTitle(directory);
        sleep(5000);
    }
}
