package org.example.HW1;
import java.util.Comparator;

public class CoffeeComparator implements Comparator<Coffee> {

    @Override
    public int compare(Coffee o1, Coffee o2) {
        return o1.getTemperature().compareTo(o2.getTemperature());
    }
}
