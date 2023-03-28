package org.example.CW1.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        VendingMachineCofeAndTee machine = new VendingMachineCofeAndTee();
        machine.addProduct(new ProdCoffe("coffe1", 100.0));
        machine.addProduct(new ProdCoffe("coffe2", 90.0));
        machine.addProduct(new ProdTee("Tee1", 150));



        ArrayList list = machine.getProductByName("coffe");
        System.out.println(list);

        ArrayList list1 = machine.getProductByPrice(100.0);
        System.out.println(list1);
    }
}
