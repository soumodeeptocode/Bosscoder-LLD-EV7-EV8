package com.bosscoder.oop.design.pattern.factory.abstractfactory.components.dropdown;

public class IOSDropDown implements Dropdown{
    @Override
    public void paint() {
        System.out.println("Hello, I am IOS Dropdown");
    }
}
