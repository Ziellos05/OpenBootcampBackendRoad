package com.example.openbootcamp_advancedjava.ErrorsHandling;

public class StackTraceElement {

    public static void main(String[] args){
        a();
    }

    public static void a(){
        b();
    }

    public static void b(){
        try {
            int valor = 5/0;
        } catch (Exception e){
            System.out.println("Esto es una división por cero");

            for (java.lang.StackTraceElement valor: e.getStackTrace()){
                System.out.println("Linea: "+valor.getLineNumber());
            }
        }
    }

}
