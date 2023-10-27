package com.example.openbootcamp_advancedjava.Args;

public class Main {

    public static void main(String []args){

        for (String arg: args){
            System.out.println("Argumento es: "+arg);
        }

        for (int i=0; i < args.length; i++){
            System.out.println("Argumento recibido: "+ args[i] + " está en la posición " + i);
        }

    }

}
