package org.example.CW5.view;

import org.example.CW5.controller.UserController;
import org.example.CW5.model.User;

import java.util.List;
import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ur data");
        userController.saveNewUser(scanner.nextInt(), scanner.nextLine(), scanner.nextInt());
        User user1 = new User(1, "Sergey", 19);
        User user2 = new User(2, "Misha", 25);
        userController.addUserToRepo(user1);
        userController.addUserToRepo(user2);
        userController.getUser(user1);
        userController.deleteUser(user1);
        userController.getUser(user2);

    }
}
