package com.training.homework.controller;

import com.training.homework.enums.Group;
import com.training.homework.model.Model;
import com.training.homework.view.TextConstants;
import com.training.homework.view.View;

import java.util.Scanner;

public class UtilController {

    private Model model;
    private View view;
    private Scanner scanner;

    UtilController(Model model, View view) {
        this.model = model;
        this.view = view;
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public String inputStringValue(String field, String regex) {
        return inputValue(field, regex);
    }

    public Integer inputIntValue(String field, String regex) {
        String res = inputValue(field, regex);
        return Integer.valueOf(res);
    }

    public Integer inputUnnecessaryIntValue(String field, String regex) {
        String res = inputUnnecessaryValue(field, regex);
        return !res.equals("") ? Integer.valueOf(res) : null;
    }


    public String inputUnnecessaryStringValue(String field, String regex) {
        String res = inputUnnecessaryValue(field, regex);
        return !res.equals("") ? res : null;
    }


    public Group inputGroupValue() {
        view.printGroups();
        Integer res;
        while (true) {
            while (!scanner.hasNextInt()) {
                view.printWrongFieldInput(TextConstants.GROUP);
                scanner.next();
            }

            if ((res = Integer.parseInt(scanner.nextLine())) <= 0 || res > Group.values().length) {
                view.printWrongFieldInput(TextConstants.GROUP);
                continue;
            }
            break;
        }

        return Group.values()[res - 1];
    }

    private String inputValue(String field, String regex) {
        String res;
        view.printInputValue(field);
        while (!(scanner.hasNext() && (res = scanner.nextLine()).matches(regex))) {
            view.printWrongFieldInput(field);
        }
        return res;
    }

    private String inputUnnecessaryValue(String field, String regex) {
        String res;
        view.printUnnecessaryInputValue(field);
        while (true) {

            if (!(res = scanner.nextLine()).matches(regex) && !res.equals("")) {
                view.printWrongFieldInput(field);
                continue;
            }
            break;
        }
        return res;
    }
}
