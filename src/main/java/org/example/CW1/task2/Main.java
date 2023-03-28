package org.example.CW1.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("water", 100.0));
        machine.addProduct(new Product("chocalate", 90.0));



        ArrayList list = machine.getProductByName("water");
        System.out.println(list);

        ArrayList list1 = machine.getProductByPrice(100.0);
        System.out.println(list1);
    }
}
