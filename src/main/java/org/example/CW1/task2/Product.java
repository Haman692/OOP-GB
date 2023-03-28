package org.example.CW1.task2;

public class Product {
    private String name;

    private double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return"" + name + " price = " + cost ;
    }
}
