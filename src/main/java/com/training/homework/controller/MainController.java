package com.training.homework.controller;

import com.training.homework.model.Model;
import com.training.homework.view.View;

/**
 * The main controller of the program, responses for
 * adding a new user entity to array list inside model class.
 *
 * @author  Eugene Kushpii
 * @version 1.0
 */
public class MainController {

    private Model model;
    private View view;

    public MainController(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser(){
        UserRegistrationController userRegistrationController = new UserRegistrationController(model,view);
        view.printGreeting();
        userRegistrationController.addUser();
    }
}
