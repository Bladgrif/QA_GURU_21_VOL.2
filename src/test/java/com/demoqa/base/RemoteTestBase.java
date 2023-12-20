package com.demoqa.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Configuration.baseUrl;

public class RemoteTestBase {
    @BeforeAll
    static void beforeAll() {
//        String remoteDriverUrl = System.getProperty("remoteDriverUrl");
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
//        Configuration.remote = "https://user1:1234@" + System.getProperty("remoteDriverUrl") + "/wd/hub";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
//        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
//    @AfterEach
//    void addAttachments() {
//        Attach.screenshotAs("Last screenshot");
//        Attach.pageSource();
//        Attach.browserConsoleLogs();
//        Attach.addVideo();
//
//        closeWebDriver();
//    }

}