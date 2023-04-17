package org.example.HW5.service;

import org.example.HW5.model.User;
import org.example.HW5.repository.UserRepo;

import java.io.FileNotFoundException;

public class UserService {
    UserRepo userRepo = new UserRepo();

    public void addNewUser(User user){
        userRepo.addNewUser(user);
    }
    public void deleteUser(int userID) throws FileNotFoundException {
        userRepo.deleteUser(userID);
    }
    public void addBalanceToUser (int userID, double balance) throws FileNotFoundException {
        userRepo.addBalanceToUser(userID,balance);
    }
}
