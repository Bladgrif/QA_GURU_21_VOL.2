package com.demoqa.forms;

import com.demoqa.base.TestBase;
import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationFormTestWithPageObject extends TestBase {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    void sucessfullRegistrationFormTest() {
        registrationFormPage.openPage()
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
                .SetDateOfBirthInput("6","May","2007");

        //Заполнение простых полей
//        $("#firstName").setValue("Roman");
//        $("#lastName").setValue("Grigorev");
//        $("#userEmail").setValue("Grigorev@mail.ru");
//        $("#userNumber").setValue("0123456789");
//        $("#currentAddress").setValue("Russia street");
//        $("#genterWrapper").find(byText("Female")).click(); //good
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("2007");
        $("[aria-label='Choose Sunday, May 6th, 2007']").click();

//        $("#subjectsInput").setValue("Accounting").pressEnter();
//        $("#hobbiesWrapper").$(byText("Sports")).click();
//        $("#uploadPicture").uploadFromClasspath("imj/Scr.png");
//        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
//        $("#city").click();
//        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();


        $(".modal-content").should(appear);
        $("#example-modal-sizes-title-lg").shouldBe(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Roman Grigorev"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("Grigorev@mail.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Female"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("0123456789"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("Date of Birth 06 May,2007"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Accounting"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Sports"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("Scr.png"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Russia street"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
    }
}
