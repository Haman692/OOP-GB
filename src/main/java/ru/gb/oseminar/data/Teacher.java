package ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Comparator;

// У нас есть основной функционал User. из кторого мы жуе создаем студентов и учителей. Нам не приходиться изменять текуший. что бы создать новых Это O в SOLID
// так же блогодоря этому мы можем подстовлять подклассы юзера для исполения его функций. ЭТО L в SOLID

public class Teacher extends User{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long countMaxID) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
}
