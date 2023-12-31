package com.example.openbootcamp_spring.patterns.creational.PrototypePattern;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("azul", 10);

        Shape circle2 = circle.copy();
        circle2.setColor("rojo");

        Circle circle3 = (Circle) circle.copy();
        System.out.println(circle3);
    }

}
