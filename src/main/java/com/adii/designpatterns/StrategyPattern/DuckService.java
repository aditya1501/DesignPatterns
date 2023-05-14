package com.adii.designpatterns.StrategyPattern;

import com.adii.designpatterns.StrategyPattern.duck.Duck;
import com.adii.designpatterns.StrategyPattern.impl.display.ArtificialDisplayImpl;
import com.adii.designpatterns.StrategyPattern.impl.fly.ArtificialFlyImpl;
import com.adii.designpatterns.StrategyPattern.impl.quack.ArtificialQuackImpl;


public class DuckService {
    public void createDuck(){
        ArtificialDisplayImpl artificialDisplay = new ArtificialDisplayImpl();
        ArtificialFlyImpl artificialFly = new ArtificialFlyImpl();
        ArtificialQuackImpl artificialQuack = new ArtificialQuackImpl();

        Duck duck = new Duck(artificialFly,artificialDisplay,artificialQuack);
        duck.viewDuck();

    }
}
