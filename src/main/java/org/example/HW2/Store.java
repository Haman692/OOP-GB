package org.example.HW2;

import org.example.HW2.*;

import java.util.*;

import static org.example.HW2.Data.choice;
import static org.example.HW2.Data.suitableOptions;
import static org.example.HW2.Data.*;

public class Store {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<Laptop>();
        laptops.add(new MSI());
        laptops.add(new Ilbrus());
        laptops.add(new AppleMacBookPro());
        laptops.add(new MSITitan());
        Map<String, String> allSorted = choice();
        System.out.println("Сортировка по:");
        for (var entry:allSorted.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        List<Laptop> sortList = suitableOptions(laptops, allSorted);
        if(sortList.size() == 0){
            System.out.println("Не подходящих вариантов");
        }
        for (Laptop laptop : sortList) {
            System.out.println("Подходящие варианты: " + laptop.getClass().getSimpleName());
        }
    }

}