package com.bosscoder.oop.design.pattern.decorator.decor;

import com.bosscoder.oop.design.pattern.decorator.Coffee;

public class IcecreamDecorator extends AbstractDecorator {

    public IcecreamDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() +  ", Vanilla Icecream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 150;
    }
}
