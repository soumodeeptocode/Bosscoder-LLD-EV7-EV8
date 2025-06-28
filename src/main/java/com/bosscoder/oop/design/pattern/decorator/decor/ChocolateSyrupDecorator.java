package com.bosscoder.oop.design.pattern.decorator.decor;

import com.bosscoder.oop.design.pattern.decorator.Coffee;

public class ChocolateSyrupDecorator extends AbstractDecorator {

   public ChocolateSyrupDecorator(Coffee coffee) {
       super(coffee);
   }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Chocolate Syrup";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 100;
    }
}
