package ru.gb.oseminar;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.data.UserComparator;

import java.time.LocalDate;

// Созданно несльколько пакедж. где каждый класс отвеает за свою зону ответственносит. Это S в SOLID
// ВМодули верхнего уровня не зависят от нижних и так далее. в нашем слочае Data>service>contoroller>view. Это D в SOLID

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Teacher teacher1 = new Teacher("name1", "name2", "name", date, 7L);
        Teacher teacher2 = new Teacher("name1", "name1", "name", date, 7L);
        UserComparator<Teacher> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1,teacher2));
    }
}
