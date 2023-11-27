package com.wildberies.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class WildberriesTestPage {

    SelenideElement catalogNavbarLink =$("button .nav-element__burger-line");
//    SelenideElement catalogNavbarLink = $(".nav-element__burger");
    ElementsCollection menuBurger = $$(".menu-burger__main-list");
    SelenideElement catalogTitle = $(".catalog-title");
    SelenideElement currencyDropdown = $(".simple-menu__currency");

    public WildberriesTestPage openPage() {
        open("https://www.wildberries.ru/");
        return this;
    }

    public WildberriesTestPage openCatalogNavbarLink() {
        catalogNavbarLink.click();
        return this;
    }
    public WildberriesTestPage openMenuBurger(String value) {
        menuBurger.findBy(text(value)).click();
        return this;
    }
    public WildberriesTestPage checkCatalogTitle(String value) {
        catalogTitle.$(byText(value)).click();
        return this;
    }

    public WildberriesTestPage waitUntilCurrencyDropdownLoads() {
        currencyDropdown.should(Condition.appear, Duration.ofSeconds(10));
        return this;
    }

}
