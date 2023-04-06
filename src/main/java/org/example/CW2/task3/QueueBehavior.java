package org.example.CW2.task3;

import org.example.CW2.task2.Human;

public interface QueueBehavior{
    void takeInQueue (Human actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
