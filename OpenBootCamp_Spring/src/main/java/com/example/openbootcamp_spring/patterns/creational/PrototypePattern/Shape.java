package com.example.openbootcamp_spring.patterns.creational.PrototypePattern;

public abstract class Shape {

    // atributos
    private String color;

    // constructores

    protected Shape(String color) {
        super();
        this.color = color;
    }

    // getter y setter
    public String getColor() {
        return color;
    }



    public void setColor(String color) {
        this.color = color;
    }

    // metodo para clonar
    public abstract Shape copy();

}