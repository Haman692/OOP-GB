package org.example.CW3.task1;

public class Cat extends Animal{
    @Override
    public String toString() {
        return "Cat" + this.getName() + " " +  this.getWeight();
    }

    public Cat(Integer age, Integer weight, String name) {
        super(age, weight, name);
    }
}
