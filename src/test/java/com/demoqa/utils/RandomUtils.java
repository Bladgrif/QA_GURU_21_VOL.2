package com.demoqa.utils;

import com.github.javafaker.Faker;

import javax.xml.stream.FactoryConfigurationError;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RandomUtils {
    Faker fakerEn = new Faker(new Locale("en"));
    Date Birthday = fakerEn.date().birthday(18, 80);
    String[] gender_list = {"Female", "Male", "Other"},
            subject_list = {"English", "Chemistry", "Computer Science", "Commerce", "Economics", "Social Studies",
                    "Arts", "History", "Maths", "Accounting", "Physics", "Biology", "Hindi", "Civics"},
            hobby_list = {"Sports", "Reading", "Music"},
            picture_list = {"Cat.png", "Dog.png", "Mouse.png"},
            state_list = {"NCR", "Uttar Pradesh", "Haryana", "Rajasthan"},
            ncrCity = {"Delhi", "Gurgaon", "Noida"},
            uttarPradeshCity = {"Agra", "Lucknow", "Merrut"},
            haryanaCity = {"Karnal", "Panipat"},
            rajasthanCity = {"Jaipur", "Jaiselmer"};

    public String getFirstName() {
        return fakerEn.name().firstName();
    }

    public String getLastName() {
        return fakerEn.name().lastName();
    }

    public String getUserEmail() {
        return fakerEn.internet().emailAddress();
    }

    public String getUserNumber() {
        return fakerEn.numerify("##########");
    }

    public String getCurrentAddress() {
        return fakerEn.address().fullAddress();
    }

    public String getGender() {
        return fakerEn.options().option(gender_list);
    }

    public String getSubject() {
        return fakerEn.options().option(subject_list);
    }

    public String getHobby() {
        return fakerEn.options().option(hobby_list);
    }

    public String getPicture() {
        return fakerEn.options().option(picture_list);
    }

    public String getState() {
        return fakerEn.options().option(state_list);
    }

    public String getCity(String state) {
        switch (state) {
            case "NCR": {
                return new Faker().options().option(ncrCity);
            }
            case "Uttar Pradesh": {
                return new Faker().options().option(uttarPradeshCity);
            }
            case "Haryana": {
                return new Faker().options().option(haryanaCity);
            }
            case "Rajasthan": {
                return new Faker().options().option(rajasthanCity);
            }
        }
        return null;
    }

    public String getBirthdayDay() {
        return (new SimpleDateFormat("dd", Locale.ENGLISH)).format(Birthday);
    }

    public String getBirthdayMonth() {
        return (new SimpleDateFormat("MMMM", Locale.ENGLISH)).format(Birthday);
    }

    public String getBirthdayYear() {
        return (new SimpleDateFormat("y", Locale.ENGLISH)).format(Birthday);
    }


}
