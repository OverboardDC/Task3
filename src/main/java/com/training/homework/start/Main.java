package com.training.homework.start;

import com.training.homework.controller.MainController;
import com.training.homework.model.Model;
import com.training.homework.view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        MainController controller = new MainController(model, view);
        controller.processUser();
    }
}
