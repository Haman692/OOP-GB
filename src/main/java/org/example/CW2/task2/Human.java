package org.example.CW2.task2;

public class Human extends Actor{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setTakeOrder() {
        makeOrder = true;
    }

    @Override
    public void setMakeOrder() {
        takeOrder = true;
    }
}
