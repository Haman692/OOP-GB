package org.example.CW3.task1;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                shelter.addAnimal(new Cat(i * 2, i * 3, "name" + i));
            } else {
                shelter.addAnimal(new Dog(i * 2, i * 3, "name" + i));
            }
        }
        shelter.print();
        shelter.sort(new AnimalComparator());
        System.out.println("---");
        shelter.print();
    }
}
