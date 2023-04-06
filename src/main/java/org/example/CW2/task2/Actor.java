package org.example.CW2.task2;

public abstract class Actor implements ActorBehavior {
    protected String name;
    protected boolean makeOrder;


    protected boolean takeOrder;
    @Override
    public boolean isMakeOrder(){
        return makeOrder;
    }
    @Override
    public boolean isTakeOrder() {
        return takeOrder;
    }
    public abstract String getName();
}
