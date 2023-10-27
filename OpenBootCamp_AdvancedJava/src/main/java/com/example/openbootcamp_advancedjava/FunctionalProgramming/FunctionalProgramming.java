package com.example.openbootcamp_advancedjava.FunctionalProgramming;

import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {

        List<Integer> numeros = List.of(11, 8, 9, 15, 39, 1, 4, 83);

        // Declarativo

        int contador = 0;

        for (int numero: numeros) {
            if(numero > 10){
                contador ++;
            }
        }

        System.out.println(contador);

        // Imperativo

        Long resultado = numeros.stream().filter(num -> num > 10).count();
        System.out.println(resultado);

    }

}
