package org.example.HW5.controler;

import org.example.HW5.service.UserService;
import org.example.HW5.model.User;

import java.io.FileNotFoundException;

public class UserController {
    UserService userService = new UserService();

    public void addNewUser(int id, String name, double balance) {
        userService.addNewUser(new User(id, name, balance));
    }

    public void deleteUser(int userID) throws FileNotFoundException {
        userService.deleteUser(userID);
    }

    public void addBalanceToUser(int userID, double balance) throws FileNotFoundException {
        userService.addBalanceToUser(userID, balance);
    }
}