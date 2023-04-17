package org.example.CW5.controller;

import org.example.CW5.model.User;
import org.example.CW5.service.UserService;

public class UserController {
    private UserService userService = new UserService();

    public void saveNewUser(int id, String name, int age) {
        userService.saveUser(new User(id, name, age));
    }
    public void deleteUser(User user){
        userService.deleteUser(user);
    }
    public User getUser(User user){
        return userService.getUser(user);
    }

    public void  addUserToRepo(User user){
        userService.addUserToRepo(user);
    }

}
