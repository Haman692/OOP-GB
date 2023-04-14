package ru.gb.oseminar.service;

import ru.gb.oseminar.data.Teacher;

import java.time.LocalDate;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teachers;

    public TeacherService(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxID = 0L;
        for (Teacher teacher: teachers){
            if (teacher.getTeacherId() > countMaxID){
                countMaxID = teacher.getTeacherId();
            }
        }
        countMaxID++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxID);
        teachers.add(teacher);
    }
}
