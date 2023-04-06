package org.example.CW2.task1;

public interface DefaultInterface {
    void printBankAccount();
    default void getUserName(){
        System.out.println("default behaviour");
    }
}
