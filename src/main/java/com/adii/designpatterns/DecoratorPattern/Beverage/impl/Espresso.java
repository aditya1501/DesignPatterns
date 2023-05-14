package com.adii.designpatterns.DecoratorPattern.Beverage.impl;

import com.adii.designpatterns.DecoratorPattern.Beverage.BeverageAbstract;

public class Espresso extends BeverageAbstract {
    @Override
    public int cost() {
        return 1;
    }
}
