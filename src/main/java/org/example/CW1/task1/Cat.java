package org.example.CW1.task1;

public class Cat extends CatMover implements CatInterface{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void saySomthing() {
        System.out.println("MEOW");
    }

    @Override
    public void sayWithInterface() {
        System.out.println("meow2");
    }

    public void setAge(int age) {
        this.age = age;



    }
}
