package org.example.CW2.task3;

import org.example.CW2.task2.Human;

import java.util.*;

public class Market implements MarketBehavior, QueueBehavior{
    List<Human> list = new ArrayList<>();
    Queue<Human> actorList = new LinkedList<>();
    @Override
    public void acceptToMarket(Human actor) {
        list.add(actor);
        System.out.println(actor + "add");
    }

    @Override
    public void releaseFromMarket(Human actor) {
        list.remove(actor);
        System.out.println(actor + "remove");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Human actor) {
        actorList.add(actor);
        System.out.println("Queue add" + actor);
    }

    @Override
    public void takeOrders(){
        actorList.peek().setTakeOrder();
        System.out.println("Take Order");
    }

    @Override
    public void giveOrders() {
        actorList.peek().setMakeOrder();
        System.out.println("Make Order");
    }

    @Override
    public void releaseFromQueue() {
        actorList.poll();
        System.out.println("bay");
    }
}
