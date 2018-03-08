package com.training.homework.controller;

import com.training.homework.entity.User;
import com.training.homework.enums.Group;
import com.training.homework.model.Model;
import com.training.homework.view.TextConstants;
import com.training.homework.view.View;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class UserRegistrationController {

    private Model model;
    private View view;
    private UtilController utilController;

    private static final String BUNDLE_NAME = "regex";
    private static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale(""));

    UserRegistrationController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void addUser() {
        model.addUser(createUser());
    }

    private User createUser() {
        utilController = new UtilController(model, view);

        User user = new User();

        user.setName(fillUserName());
        user.setMiddleName(fillUserMiddleName());
        user.setNickName(fillUserNickname());
        user.setComment(fillUserComment());
        user.setGroup(fillUserGroup());
        user.setHomePhone(fillUserHomePhone());
        user.setMobilePhone(fillUserMobilePhone());
        user.setAdditionalMobilePhone(fillUserAdditionalMobilePhone());
        user.setEmail(fillUserEmail());
        user.setSkype(fillUserSkype());
        user.setFullAddress(fillUserAddress());
        user.setAddingDate(fillUserAddingDate());
        user.setLastChangingDate(fillUserLastChangingDate());

        System.out.println(user.toString());
        return user;
    }


    private String fillUserName() {
        view.printComplexValueInput(TextConstants.NAME);
        String firstName = getStringInputValue(TextConstants.FIRST_NAME, bundle.getString(RegexConstants.NAME_REGEX));
        String lastName = getStringInputValue(TextConstants.LAST_NAME, bundle.getString(RegexConstants.NAME_REGEX));
        return lastName + TextConstants.WHITE_SPACE + firstName.charAt(0) + TextConstants.DOT;
    }

    private String fillUserMiddleName() {
        return getStringInputUnnecessaryValue(TextConstants.MIDDLE_NAME, bundle.getString(RegexConstants.NAME_REGEX));
    }

    private String fillUserNickname() {
        return getStringInputValue(TextConstants.NICKNAME, bundle.getString(RegexConstants.NICKNAME_REGEX));
    }

    private String fillUserComment() {
        return getStringInputUnnecessaryValue(TextConstants.COMMENT, bundle.getString(RegexConstants.COMMENT_REGEX));
    }

    private Group fillUserGroup() {
        return utilController.inputGroupValue();
    }

    private String fillUserHomePhone() {
        return getStringInputValue(TextConstants.HOME_PHONE, bundle.getString(RegexConstants.HOME_PHONE_REGEX));
    }

    private String fillUserMobilePhone() {
        return getStringInputValue(TextConstants.MOBILE_PHONE, bundle.getString(RegexConstants.MOBILE_PHONE_REGEX));
    }

    private String fillUserAdditionalMobilePhone() {
        return getStringInputUnnecessaryValue(TextConstants.ADDITIONAL_MOBILE_PHONE, bundle.getString(RegexConstants.MOBILE_PHONE_REGEX));
    }

    private String fillUserEmail() {
        return getStringInputValue(TextConstants.EMAIL, bundle.getString(RegexConstants.EMAIL_REGEX));
    }

    private String fillUserSkype() {
        return getStringInputValue(TextConstants.SKYPE, bundle.getString(RegexConstants.SKYPE_REGEX));
    }

    private String fillUserAddress() {
        view.printComplexValueInput(TextConstants.ADDRESS);
        String postalCode = getStringInputValue(TextConstants.POST_INDEX, bundle.getString(RegexConstants.POSTAL_CODE_REGEX));
        String city = getStringInputValue(TextConstants.CITY, bundle.getString(RegexConstants.CITY_REGEX));
        String street = getStringInputValue(TextConstants.STREET, bundle.getString(RegexConstants.STREET_REGEX));
        Integer houseNumber = getIntInputValue(TextConstants.HOUSE_NUMBER, bundle.getString(RegexConstants.HOUSE_NUMBER));
        Integer flatNumber = getIntInputValue(TextConstants.FLAT_NUMBER, bundle.getString(RegexConstants.FLAT_NUMBER));
        return postalCode + TextConstants.WHITE_SPACE + city +
                TextConstants.WHITE_SPACE + street + TextConstants.WHITE_SPACE +
                houseNumber + TextConstants.WHITE_SPACE + flatNumber;
    }

    private Date fillUserAddingDate() {
        return new Date();
    }

    private Date fillUserLastChangingDate() {
        return new Date();
    }

    private String getStringInputValue(String field, String regex) {
        return utilController.inputStringValue(field, regex);
    }

    private Integer getIntInputValue(String field, String regex) {
        return utilController.inputIntValue(field, regex);
    }

    private String getStringInputUnnecessaryValue(String field, String regex) {
        return utilController.inputUnnecessaryStringValue(field, regex);
    }

    private Integer getIntInputUnnecessaryValue(String field, String regex) {
        return utilController.inputUnnecessaryIntValue(field, regex);
    }
}
