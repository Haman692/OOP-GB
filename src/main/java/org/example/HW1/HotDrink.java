package org.example.HW1;

import java.util.List;

public abstract class HotDrink {
    protected String name;
    protected Integer volume;
    private List<Coffee> coffee;

    public List<Coffee> getCoffee() {
        return coffee;
    }

    public HotDrink(String name, Integer volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return name + ", volume = " + volume;
    }
}
