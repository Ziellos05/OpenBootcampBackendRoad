package org.openbootcamp;

import classes.Coche;
import classes.Persona;
import classes.Sum;
import classes.Trabajador;
import classes.Cliente;

public class Main {

    public static Sum sum = new Sum();
    public static Coche coche = new Coche();

    public static Persona persona = new Persona();
    public static Cliente cliente = new Cliente();
    public static Trabajador trabajador = new Trabajador();

    public static void main(String[] args) {

        System.out.println("Aquí utilizo distintas clases y métodos");

        System.out.println(sum.sum(1, 2, 3));

        coche.sumPuertas(1);

        System.out.println(coche.getPuertas());

        persona.setTelefono(3167178288L);
        System.out.println(persona.getTelefono());
        persona.setEdad(25);
        System.out.println(persona.getEdad());
        persona.setNombre("El Pepe Deconstruido");
        System.out.println(persona.getNombre());

        cliente.setCredito(1233123.12312312);
        System.out.println(cliente.getCredito());

        trabajador.setSalario(1233123.12312312);
        System.out.println(trabajador.getSalario());

    }
}