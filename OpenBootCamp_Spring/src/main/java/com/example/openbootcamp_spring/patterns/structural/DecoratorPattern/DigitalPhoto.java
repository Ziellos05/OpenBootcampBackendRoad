package com.example.openbootcamp_spring.patterns.structural.DecoratorPattern;

public class DigitalPhoto extends Photo{

    @Override
    public String show() {
        return "Normal photo without edit";
    }

    @Override
    public double cost() {
        return 15;
    }


}