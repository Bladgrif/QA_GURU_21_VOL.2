package com.demoqa.pages.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {

    SelenideElement monthSelect = $(".react-datepicker__month-select"),
            yearSelect = $(".react-datepicker__year-select");
    public void setCalendarComponents(String day, String month, String Year) {
        monthSelect.selectOption(month);
        yearSelect.selectOption(Year);
        $(".react-datepicker__day--0" + day +
                ":not(.react-datepicker__day--outside-month").click();
    }
}
