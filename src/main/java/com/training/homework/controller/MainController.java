package com.training.homework.controller;

import com.training.homework.model.Model;
import com.training.homework.view.View;

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
