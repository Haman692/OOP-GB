package org.example.HW1;

import java.util.ArrayList;

public class CoffeeDrinkMachine implements VendingMachine {
    ArrayList<Coffee> coffeeList = new ArrayList<Coffee>();

    public void addCoffee(Coffee product) {
        coffeeList.add(product);
    }

    @Override
    public void getProduct(String name, int volume, int temperature) {
        ArrayList<Coffee> list = new ArrayList<>();
        for (Coffee c : coffeeList) {
            if (c.getName().contains(name) &&
                    c.getVolume() == volume &&
                    c.getTemperature() == temperature) {
                list.add(c);
            }
        }
        if (list.size() > 0) {
            System.out.println(list);
        } else {
            System.out.println("No such coffee");
        }
    }
}
