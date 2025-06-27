package com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons;

public class AndroidButton implements Button{
    @Override
    public void paint() {
        System.out.println("Hello, I am Android Button");
    }
}
