package com.bosscoder.oop.design.pattern.decorator;

import com.bosscoder.oop.design.pattern.decorator.decor.ChocolateSyrupDecorator;
import com.bosscoder.oop.design.pattern.decorator.decor.IcecreamDecorator;

public class Client {
    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();
        System.out.println(cappuccino.getDescription() + " : " + cappuccino.getCost());

        cappuccino = new IcecreamDecorator(cappuccino);
        System.out.println(cappuccino.getDescription() + " : " + cappuccino.getCost());

        cappuccino = new ChocolateSyrupDecorator(cappuccino);
        System.out.println(cappuccino.getDescription() + " : " + cappuccino.getCost());

        Coffee latte = new Latte();

        latte = new ChocolateSyrupDecorator(new IcecreamDecorator(latte));
        System.out.println(latte.getDescription() + " : " + latte.getCost());
    }
}
