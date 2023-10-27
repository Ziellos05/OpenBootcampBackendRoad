package com.example.openbootcamp_advancedjava.Recusion;

public class Recursion {

    // Este método returna la suma de todos los números hasta el cero desde un entero, utilizando recursividad

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}
