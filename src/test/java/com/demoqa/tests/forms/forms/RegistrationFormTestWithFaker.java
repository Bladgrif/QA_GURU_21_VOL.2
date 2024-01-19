package com.demoqa.tests.forms.forms;

import com.demoqa.base.TestBase;
import com.demoqa.pages.RegistrationFormPage;
import com.demoqa.pages.RegistrationResultPage;
import com.demoqa.utils.Variables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationFormTestWithFaker extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    Variables variables = new Variables();

    @Test
    @DisplayName("Successful registration by clicking the button in the authorization form - with data generation")
    void sucessfullRegistrationFormTest() {
        registrationFormPage.openPage()
                .removeBanners()
                .SetFirstName(variables.firstName)
                .SetLastName(variables.lastName)
                .SetUserEmail(variables.userEmail)
                .SetUserNumber(variables.userNumber)
                .SetCurrentAddress(variables.currentAddress)
                .SetGenderWrapper(variables.gender)
                .SetSubjectsInput(variables.subject)
                .SetHobbiesWrapper(variables.hobby)
                .SetUploadPicture(variables.picture)
                .SetState(variables.state)
                .SetCity(variables.city)
                .SetDateOfBirthInput(variables.birthdayDay, variables.birthdayMonth, variables.birthdayYear)
                .SetSubmit()
                .checkThatTheSiteHasOpened();

        registrationResultPage.checkFinalResultStudentName(variables.fullName)
                .checkFinalResultStudentEmail(variables.userEmail)
                .checkFinalResultGender(variables.gender)
                .checkFinalResultMobile(variables.userNumber)
                .checkFinalResultDateOfBirth(variables.userBirthday)
                .checkFinalResultSubjects(variables.subject)
                .checkFinalResultHobbies(variables.hobby)
                .checkFinalResultPicture(variables.picture)
                .checkFinalResultAddress(variables.currentAddress)
                .checkFinalResultStateAndCity(variables.stateCity);
    }
}
