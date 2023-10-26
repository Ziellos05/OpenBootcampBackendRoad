package com.example.openbootcamp_spring.patterns.creational.FactoryMethodPatern;

public class EmpleadoFactory {

    /**
     * Devuelve un empleado del tipo solicitado
     * @return
     */
    public Empleado getEmpleado(EmpleadoType type){

        // opcion 3
        switch (type) {
            case MECANICO:
                return new Mecanico();
            // ejemplo de como conectar con la fachada
            // return SmartPhoneFacade.startSmartPhone();
            case PROGRAMADOR:

                return new Programador();

            default:
                throw new IllegalArgumentException("Tipo empleado no existe " + type);
        }

    }

}