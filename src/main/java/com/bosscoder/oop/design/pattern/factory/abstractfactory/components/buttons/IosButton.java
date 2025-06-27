package com.bosscoder.oop.design.pattern.factory.abstractfactory.components.buttons;

public class IosButton implements Button{
    @Override
    public void paint() {
        System.out.println("Hello, I am IOS Button");
    }
}
