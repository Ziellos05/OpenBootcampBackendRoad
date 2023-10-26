package com.example.openbootcamp_spring.patterns.structural.FacadePAttern.PiecesLibrary;

public class NFCSensor implements Sensor {

    @Override
    public void start() {
        System.out.println("Inicializando NFC");

    }

    @Override
    public void stop() {
        System.out.println("Desactivando NFC");
    }



}