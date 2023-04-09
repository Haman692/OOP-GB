package org.example.HW1;

import java.util.List;

public class Coffee extends HotDrink {
    protected Integer temperature;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Coffee(String name, Integer volume, Integer temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return super.toString() + " temperature= " + temperature;
    }

}
