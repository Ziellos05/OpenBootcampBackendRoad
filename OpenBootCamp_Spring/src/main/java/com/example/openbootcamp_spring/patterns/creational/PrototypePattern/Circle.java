package com.example.openbootcamp_spring.patterns.creational.PrototypePattern;

public class Circle extends Shape{


    int radius;

    protected Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Shape copy() {
        return new Circle(this.getColor(), this.radius);
    }

}