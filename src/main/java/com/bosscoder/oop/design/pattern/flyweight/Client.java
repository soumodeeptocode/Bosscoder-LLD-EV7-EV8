package com.bosscoder.oop.design.pattern.flyweight;

public class Client {

    public static void main(String[] args) {
        Forest forest = new Forest();

        forest.plantTree(1,2, "OAK", "Green", "smooth");
        forest.plantTree(2,1, "BANYAN", "Green", "Rough");

        forest.plant();
    }
}
