package com.adii.designpatterns.StrategyPattern.impl.fly;

import com.adii.designpatterns.StrategyPattern.impl.Fly;

public class ArtificialFlyImpl implements Fly {
    @Override
    public void fly() {
        System.out.println("This is artificial fly");
    }
}
