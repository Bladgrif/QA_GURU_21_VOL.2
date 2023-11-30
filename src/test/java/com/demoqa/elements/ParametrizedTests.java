package com.demoqa.elements;

import com.demoqa.base.TestBase;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTests extends TestBase{
    TextBoxPage textBoxPage = new TextBoxPage();

    @ValueSource(strings = {
            "Text Box",
            "Check Box"
    })
    @ParameterizedTest
    void fileFormTest(String directory) {
        textBoxPage.openPageParametrized()
                .openCategory(directory)
                .checkCategory(directory);


//
//        textBoxPage.checkResultName("Roman Grigorev")
//                .checkResultEmail("Roman@gmail.com")
//                .checkResultCurrentAddress("Cheboksary")
//                .checkResultPermanentAddress("Cheboksary-2");

    }
}
