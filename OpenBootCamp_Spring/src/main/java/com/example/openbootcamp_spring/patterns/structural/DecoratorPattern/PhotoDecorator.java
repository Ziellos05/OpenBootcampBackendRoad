package com.example.openbootcamp_spring.patterns.structural.DecoratorPattern;

public abstract class PhotoDecorator extends Photo {

    protected Photo photo;

    protected PhotoDecorator(Photo photo) {
        super();
        this.photo = photo;
    }




}
