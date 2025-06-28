package com.bosscoder.oop.design.pattern.decorator.decor;

import com.bosscoder.oop.design.pattern.decorator.Coffee;

public class AbstractDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public AbstractDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }
}
