package com.example.openbootcamp_spring.patterns.creational.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

public class Offer {

    List<Double> prices = new ArrayList<>();

    Calculator calculator = Calculator.getCalculator();

    public double calculateTotalOffer(){

        // algoritmo que utiliza la calculadora
        // calculator


        return 0d;
    }

}