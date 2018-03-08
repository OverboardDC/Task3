package com.training.homework.view;

import com.training.homework.enums.Group;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    private static final String BUNDLE_NAME = "messages";
    private static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME, new Locale(""));


    public void printGreeting() {
        printMessage(bundle.getString(TextConstants.GREETING));
    }

    public void printInputValue(String field) {
        printMessage(getInputMessage(field));
    }

    public void printComplexValueInput(String field){
        printMessage(concatenateString(bundle.getString(TextConstants.FILL_COMPLEX_FIELD), TextConstants.WHITE_SPACE,
                bundle.getString(field), TextConstants.COLON));
    }

    public void printUnnecessaryInputValue(String field) {
        printComplexMessage(getInputMessage(field), TextConstants.WHITE_SPACE, TextConstants.LEFT_BRACKET,
                bundle.getString(TextConstants.UNNECESSARY), TextConstants.RIGHT_BRACKET);
    }

    private String getInputMessage(String field) {
        return concatenateString(bundle.getString(TextConstants.FILL_FIELD), TextConstants.COLON, TextConstants.WHITE_SPACE, bundle.getString(field));
    }

    public void printWrongFieldInput(String field) {
        printComplexMessage(bundle.getString(TextConstants.WRONG_INPUT), TextConstants.COLON, TextConstants.WHITE_SPACE, bundle.getString(field));
    }

    public void printGroups() {
        printInputValue(TextConstants.GROUP);
        for (int i = 0; i < Group.values().length; i++) {
            printComplexMessage(Integer.toString(i + 1), TextConstants.WHITE_SPACE,
                    Group.values()[i].toString());
        }
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printComplexMessage(String... strings) {
        printMessage(concatenateString(strings));
    }

    private String concatenateString(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : strings) {
            stringBuilder.append(str);
        }
        return new String(stringBuilder);
    }
}
