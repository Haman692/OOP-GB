package ru.gb.oseminar;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Teacher teacher1 = new Teacher("name1", "name2", "name", date, countMaxID);
        Teacher teacher2 = new Teacher("name1", "name1", "name", date, countMaxID);
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));
    }
}
