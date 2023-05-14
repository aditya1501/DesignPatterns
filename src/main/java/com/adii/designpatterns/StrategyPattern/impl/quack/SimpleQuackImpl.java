package com.adii.designpatterns.StrategyPattern.impl.quack;

import com.adii.designpatterns.StrategyPattern.impl.Quack;

public class SimpleQuackImpl implements Quack {
    @Override
    public void quack() {
        System.out.println("This is simple quack");
    }
}
