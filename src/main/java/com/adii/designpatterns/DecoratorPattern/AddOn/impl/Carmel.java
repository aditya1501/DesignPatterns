package com.adii.designpatterns.DecoratorPattern.AddOn.impl;

import com.adii.designpatterns.DecoratorPattern.AddOn.AddOnAbstract;
import com.adii.designpatterns.DecoratorPattern.Beverage.BeverageAbstract;

public class Carmel extends AddOnAbstract {
    /**
     * @return
     */

    BeverageAbstract beverageAbstract;
    public Carmel(BeverageAbstract b){
        this.beverageAbstract = b;
    }
    @Override
    public int cost() {
        return this.beverageAbstract.cost() + 2;
    }
}
