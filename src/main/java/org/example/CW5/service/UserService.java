package org.example.CW5.service;

import org.example.CW5.model.User;
import org.example.CW5.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }

    public void deleteUser(User user){
        userRepo.deleteFromRepo(user);
    }

    public User getUser(User user){
        return userRepo.getUserFromRepo(user);
    }

    public void addUserToRepo(User user){
        userRepo.addToList(user);
    }



}
