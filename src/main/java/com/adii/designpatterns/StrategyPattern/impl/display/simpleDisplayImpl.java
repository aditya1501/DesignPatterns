package com.adii.designpatterns.StrategyPattern.impl.display;

import com.adii.designpatterns.StrategyPattern.impl.Display;

public class simpleDisplayImpl implements Display {
    @Override
    public void display() {
        System.out.println("This is simple display");
    }
}
