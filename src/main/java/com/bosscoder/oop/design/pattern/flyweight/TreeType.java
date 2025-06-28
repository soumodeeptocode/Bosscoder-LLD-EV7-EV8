package com.bosscoder.oop.design.pattern.flyweight;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void plant(int x, int y) {
        System.out.println("Planting " + name + " at " + x + ", " + y);
    }
}
