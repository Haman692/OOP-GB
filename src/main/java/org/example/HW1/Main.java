package org.example.HW1;

public class Main {
    public static void main(String[] args) {
        CoffeeDrinkMachine espressoMachine1 = new CoffeeDrinkMachine();
        espressoMachine1.addCoffee(new Coffee("Espresso", 100, 90));
        espressoMachine1.addCoffee(new Coffee("Lungo", 180, 88));
        espressoMachine1.addCoffee(new Coffee("Americano", 400, 94));

        CoffeeDrinkMachine espressoMachine2 = new CoffeeDrinkMachine();
        espressoMachine2.addCoffee(new Coffee("Cappuccino", 200, 70));
        espressoMachine2.addCoffee(new Coffee("Latte", 400, 70));
        espressoMachine2.addCoffee(new Coffee("Mocha", 400, 40));

        espressoMachine1.getProduct("Lungo", 180,88);
        espressoMachine1.getProduct("Americano", 100 , 100);

        espressoMachine2.getProduct("Cappuccino", 200, 70);
        espressoMachine2.getProduct("Cappuccino", 400, 70);
    }
}
