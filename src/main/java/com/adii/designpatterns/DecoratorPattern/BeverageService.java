package com.adii.designpatterns.DecoratorPattern;

import com.adii.designpatterns.DecoratorPattern.AddOn.impl.Carmel;
import com.adii.designpatterns.DecoratorPattern.Beverage.BeverageAbstract;
import com.adii.designpatterns.DecoratorPattern.Beverage.impl.Espresso;

public class BeverageService {
    public static void main(String[] args) {
        BeverageAbstract beverageAbstract = new Carmel(new Espresso());
        System.out.println(beverageAbstract.cost());
    }
}
