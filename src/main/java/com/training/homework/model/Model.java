package com.training.homework.model;

import com.training.homework.entity.User;

import java.util.ArrayList;

/**
 * The model class responsible for business logic.
 *
 * @author  Eugene Kushpii
 * @version 1.0
 */
public class Model {

    private ArrayList<User> users;

    public Model() {
        if(users == null){
            users = new ArrayList<>();
        }
    }

    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
