package org.example.CW2.task3;

import org.example.CW2.task2.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Market mac = new Market();
        mac.acceptToMarket(human);
        mac.takeInQueue(human);
        mac.takeOrders();
        mac.giveOrders();
        mac.releaseFromQueue();
        mac.releaseFromMarket(human);
    }
}
