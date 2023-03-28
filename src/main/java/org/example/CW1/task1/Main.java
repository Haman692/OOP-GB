package org.example.CW1.task1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Bars");
        System.out.println(cat.getName());
        cat.saySomthing();
        cat.sayWithInterface();
        BengalCat cat1 = new BengalCat();
        cat1.saySomthing();
    }
}