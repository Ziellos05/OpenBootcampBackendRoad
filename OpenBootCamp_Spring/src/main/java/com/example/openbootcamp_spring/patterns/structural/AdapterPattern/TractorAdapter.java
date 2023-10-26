package com.example.openbootcamp_spring.patterns.structural.AdapterPattern;

public class TractorAdapter implements Movable{

    private Tractor tractor = new Tractor();

    @Override
    public void speedUp(double quantity) {
        if (this.tractor.getSpeed() + quantity < 15) {
            this.tractor.changeMode(1);
        } else {
            this.tractor.changeMode(2);
        }

    }

}
