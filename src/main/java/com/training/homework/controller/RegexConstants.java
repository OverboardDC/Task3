package com.training.homework.controller;

public interface RegexConstants {

    String NAME_REGEX = "[^`][a-zA-Z`]+";
    String NICKNAME_REGEX = "[a-zA-Z0-9]{2,20}+";
    String COMMENT_REGEX = "[a-zA-Z0-9`\\s.,?!\"\';:*\\(\\)\\{\\}\\[\\]]{6,120}+";
    String HOME_PHONE_REGEX="(([0-9]{3})?[0-9]{7}+)";
    String MOBILE_PHONE_REGEX = "((([+]{1}[0-9]{2})?[0-9]{3})[0-9]{7}+)";
    String EMAIL_REGEX="[a-zA-z0-9]+[@][a-z]+[.][a-z]+";
    String SKYPE_REGEX="[a-zA-z0-9]+";

    String POSTAL_CODE_REGEX ="[0-9]{5}+";
    String CITY_REGEX = "[a-zA-Z]+";
    String STREET_REGEX = "[a-zA-Z]+";
    String HOUSE_NUMBER = "[0-9]{1,3}+";
    String FLAT_NUMBER = "[0-9]{1,3}+";


}
