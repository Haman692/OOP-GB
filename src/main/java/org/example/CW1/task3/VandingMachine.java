package org.example.CW1.task3;

import java.util.ArrayList;

public interface VandingMachine {
    public ArrayList getProductByName(String searchName);
    public ArrayList getProductByPrice(Double searchPrice);
}
