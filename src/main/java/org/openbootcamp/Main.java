package org.openbootcamp;

import classes.Coche;
import classes.Sum;

public class Main {

    public static Sum sum = new Sum();
    public static Coche coche = new Coche();

    public static void main(String[] args) {

        System.out.println("Aquí utilizo distintas clases y métodos");

        System.out.println(sum.sum(1, 2, 3));

        coche.sumPuertas(1);

        System.out.println(coche.getPuertas());

    }
}