package com.demoqa.elements;

import com.demoqa.base.TestBase;
import com.demoqa.pages.TextBoxPage;
import com.demoqa.utils.RandomUtils;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBox extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fileFormTest() {
        textBoxPage.openPage()
                .SetUserName("Roman Grigorev")
                .SetUserEmail("Roman@gmail.com")
                .SetCurrentAddress("Cheboksary")
                .SetPermanentAddress("Cheboksary-2")
                .pressButton();

        textBoxPage.checkResultName("Roman Grigorev")
                .checkResultEmail("Roman@gmail.com")
                .checkResultCurrentAddress("Cheboksary")
                .checkResultPermanentAddress("Cheboksary-2");

    }

//    @Test
//    void fileFormTestWithFaker() {
//        String userName = randomUtils.getRandomName();
//        textBoxPage.openPage()
//                .SetUserName(userName)
//                .SetUserEmail("Roman@gmail.com")
//                .SetCurrentAddress("Cheboksary")
//                .SetPermanentAddress("Cheboksary-2")
//                .pressButton();
//
//        textBoxPage.checkResultName(userName)
//                .checkResultEmail("Roman@gmail.com")
//                .checkResultCurrentAddress("Cheboksary")
//                .checkResultPermanentAddress("Cheboksary-2");
//
//    }
}
