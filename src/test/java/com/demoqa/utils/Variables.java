package com.demoqa.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class Variables {
    RandomUtils randomUtils = new RandomUtils();
    public String firstName = randomUtils.getFirstName(),
            lastName = randomUtils.getLastName(),
            fullName = firstName + " " + lastName,
            userEmail = randomUtils.getUserEmail(),
            userNumber = randomUtils.getUserNumber(),
            currentAddress = randomUtils.getCurrentAddress(),
            gender = randomUtils.getGender(),
            subject = randomUtils.getSubject(),
            hobby = randomUtils.getHobby(),
            picture = randomUtils.getPicture(),
            state = randomUtils.getState(),
            city = randomUtils.getCity(state),
            stateCity = state + " " + city,
            birthdayDay = randomUtils.getBirthdayDay(),
            birthdayMonth = randomUtils.getBirthdayMonth(),
            birthdayYear = randomUtils.getBirthdayYear(),
            userBirthday = String.format("Date of Birth %s %s,%s", birthdayDay,birthdayMonth,birthdayYear);

}
