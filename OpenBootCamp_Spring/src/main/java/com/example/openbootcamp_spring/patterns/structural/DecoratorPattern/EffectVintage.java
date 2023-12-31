package com.example.openbootcamp_spring.patterns.structural.DecoratorPattern;

public class EffectVintage extends PhotoDecorator{

    public EffectVintage(Photo photo) {
        super(photo);
    }

    @Override
    public String show() {
        // decorar la foto
        this.photo.setBrightness(90);
        this.photo.setContrast(20);
        this.photo.setBlur(5);
        return this.photo.show() + " + Vintage";
    }

    @Override
    public double cost() {
        return this.photo.cost() + 15;
    }

}
