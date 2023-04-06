package org.example.CW2.task3;

import org.example.CW2.task2.Human;

public interface MarketBehavior {
    void acceptToMarket(Human actor);
    void  releaseFromMarket(Human actor);
    void update();
}
