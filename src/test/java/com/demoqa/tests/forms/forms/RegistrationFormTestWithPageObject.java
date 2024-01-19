package com.demoqa.tests.forms.forms;

import com.demoqa.base.TestBase;
import com.demoqa.pages.RegistrationFormPage;
import com.demoqa.pages.RegistrationResultPage;
import org.junit.jupiter.api.Test;

public class RegistrationFormTestWithPageObject extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();

    @Test
    void sucessfullRegistrationFormTest() {
        registrationFormPage.openPage()
                .removeBanners()
                .SetFirstName("Roman")
                .SetLastName("Grigorev")
                .SetUserEmail("Grigorev@mail.ru")
                .SetUserNumber("0123456789")
                .SetCurrentAddress("Russia street")
                .SetGenderWrapper("Female")
                .SetSubjectsInput("Accounting")
                .SetHobbiesWrapper("Sports")
                .SetUploadPicture("Cat.png")
                .SetState("NCR")
                .SetCity("Delhi")
                .SetDateOfBirthInput("06", "May", "2007")
                .SetSubmit()
                .checkThatTheSiteHasOpened();

        registrationResultPage.checkFinalResultStudentName("Roman Grigorev")
                .checkFinalResultStudentEmail("Grigorev@mail.ru")
                .checkFinalResultGender("Female")
                .checkFinalResultMobile("0123456789")
                .checkFinalResultDateOfBirth("Date of Birth 06 May,2007")
                .checkFinalResultSubjects("Accounting")
                .checkFinalResultHobbies("Sports")
                .checkFinalResultPicture("Cat.png")
                .checkFinalResultAddress("Russia street")
                .checkFinalResultStateAndCity("NCR Delhi");
    }
}
