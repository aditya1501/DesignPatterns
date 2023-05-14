package com.adii.designpatterns.StrategyPattern.duck;

import com.adii.designpatterns.StrategyPattern.impl.Display;
import com.adii.designpatterns.StrategyPattern.impl.Fly;
import com.adii.designpatterns.StrategyPattern.impl.Quack;

public class Duck {
    Fly fly;
    Display display;
    Quack quack;

    public Duck(Fly fly, Display display, Quack quack) {
        this.fly = fly;
        this.display = display;
        this.quack = quack;
    }
    public Duck(){
    }

    public void viewDuck(){
        fly.fly();
        display.display();
        quack.quack();
    }
}
