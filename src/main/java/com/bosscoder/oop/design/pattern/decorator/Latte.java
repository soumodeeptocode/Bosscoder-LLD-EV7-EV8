package com.bosscoder.oop.design.pattern.decorator;

public class Latte implements Coffee{
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double getCost() {
        return 185.40;
    }
}
