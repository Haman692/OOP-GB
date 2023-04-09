package org.example.CW3.task1;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return -o1.getAge().compareTo(o2.getAge());
    }
}
