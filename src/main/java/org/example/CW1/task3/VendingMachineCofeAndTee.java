package org.example.CW1.task3;

import org.example.CW1.task2.VendingMachine;

import java.util.ArrayList;

public class VendingMachineCofeAndTee implements VandingMachine{
    private ArrayList<Product> list;
    public VendingMachineCofeAndTee(){
        list = new ArrayList<Product>();
    }

    public void addProduct(Product newItem){
        list.add(newItem);
    }

    public ArrayList getProductByName(String searchName){
        ArrayList<Product> result = new ArrayList<Product>();
        for(Product item: list){
            if(item.getName().contains(searchName)){
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProductByPrice(Double searchPrice){
        ArrayList<Product> result = new ArrayList<Product>();
        for(Product item: list){
            if(item.getCost().equals(searchPrice)){
                result.add(item);
            }
        }
        return result;
    }
}
