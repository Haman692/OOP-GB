package org.example.HW1;

public class Coffee extends HotDrink {

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private int temperature;
    public Coffee(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return super.toString() + " temperature= " + temperature;
    }
}
