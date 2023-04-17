package org.example.HW5.view;

import org.example.HW5.controler.UserController;

import java.io.FileNotFoundException;

public class UserView {
    public static void main(String[] args) throws FileNotFoundException {
        UserController userController = new UserController();

        userController.addBalanceToUser(1,50.0);
    }
}
