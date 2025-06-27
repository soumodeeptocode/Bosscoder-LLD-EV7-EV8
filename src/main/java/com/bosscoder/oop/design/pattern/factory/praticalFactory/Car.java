package com.bosscoder.oop.design.pattern.factory.praticalFactory;

public class Car implements Vehicle{
    @Override
    public void build() {
        System.out.println("Building a Car !");
    }
}
