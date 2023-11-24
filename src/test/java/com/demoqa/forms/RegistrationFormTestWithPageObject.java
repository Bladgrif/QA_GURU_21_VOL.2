package com.demoqa.forms;

import com.demoqa.base.TestBase;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormTestWithPageObject extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void sucessfullRegistrationFormTest() {
        registrationFormPage.openPage()
                .removeBanners()
                .SetFirstName("Roman")
                .SetLastName("Grigorev")
                .SetUserEmail("Grigorev@mail.ru")
                .SetUserNumber("0123456789")
                .SetCurrentAddress("Russia street")
                .SetGenterWrapper("Female")
                .SetSubjectsInput("Accounting")
                .SetHobbiesWrapper("Sports")
                .SetUploadPicture("imj/Scr.png")
                .SetState("NCR")
                .SetCity("Delhi")
                .SetDateOfBirthInput("06", "May", "2007")
                .SetSubmit()
                .firstCheck();

        registrationFormPage.checkFinalResultStudentName("Roman Grigorev")
                .checkFinalResultStudentEmail("Grigorev@mail.ru")
                .checkFinalResultGender("Female")
                .checkFinalResultMobile("0123456789")
                .checkFinalResultDateOfBirth("Date of Birth 06 May,2007")
                .checkFinalResultSubjects("Accounting")
                .checkFinalResultHobbies("Sports")
                .checkFinalResultPicture("Scr.png")
                .checkFinalResultAddress("Russia street")
                .checkFinalResultStateAndCity("NCR Delhi");
    }
}
