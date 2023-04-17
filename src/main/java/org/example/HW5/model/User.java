package org.example.HW5.model;

public class User {
    private int userID;
    private String name;
    private double balance;

    public User(int userID, String name, double balance) {
        this.userID = userID;
        this.name = name;
        this.balance = balance;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID = " + userID +
                ", name = '" + name + '\'' +
                ", balance = " + balance +
                " }" + "\n";
    }
}
