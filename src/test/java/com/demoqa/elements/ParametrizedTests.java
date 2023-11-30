package com.demoqa.elements;

import com.demoqa.base.TestBase;
import com.demoqa.pages.TextBoxPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();

    @ParameterizedTest(name = "the user should see the {0} centered")
    @ValueSource(strings = {
            "Text Box",
            "Check Box"
    })
    void checkingSubtitleDirectoryMatchesDirectory(String directory) {
        textBoxPage.openPageParametrized()
                .openCategory(directory)
                .checkCategory(directory);
    }

//    @ParameterizedTest
//    void name() {
//    }

    @ParameterizedTest(name = "the user should see the {1} after clicking on the {0}")
    @CsvFileSource(resources = "/checkingSubtitleDirectoryMatchesDirectoryAfterClick.csv")
    void checkingSubtitleDirectoryMatchesDirectoryAfterClick (String category, String word) {
        textBoxPage.openPageParametrized()
                .openCategory(category)
                .checkUserForm(word);
        }


}

