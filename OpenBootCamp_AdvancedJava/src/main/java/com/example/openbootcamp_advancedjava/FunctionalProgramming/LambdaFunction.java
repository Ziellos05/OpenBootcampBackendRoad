package com.example.openbootcamp_advancedjava.FunctionalProgramming;

// Clase principal
public class LambdaFunction {

    // Se declara la interface
    // Anotacion para declara la interface
    @FunctionalInterface
    interface operacion {
        // el metodo abstracto
        public double suma(double x, double y);
    }

    public static void main(String[] args) {
        // Expresion lambda
        operacion l = (x, y) -> x + y;
        System.out.println(l.suma(8, 30));
    }
}