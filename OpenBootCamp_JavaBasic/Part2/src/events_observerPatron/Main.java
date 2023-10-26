package events_observerPatron;

import java.util.ArrayList;


    interface Mensajero {
        void hanSaludado();
    }

    class Emisor {
        private ArrayList<Mensajero> receptores = new ArrayList<>();

        public void agregaReceptor(Mensajero receptor) { receptores.add(receptor); }

        public void saluda(){
            System.out.println("Hola!");

            for (Mensajero al : receptores) {
                al.hanSaludado();
            }
        }
    }

    class Receptor implements  Mensajero {
        @Override
        public void hanSaludado() {
            System.out.println("Devolviendo el hola desde el receptor");
        }
    }



public class Main {
    public static void main (String []args){
        Emisor emisor = new Emisor();
        Receptor receptor = new Receptor();

        emisor.agregaReceptor(receptor);
        emisor.agregaReceptor(receptor);

        emisor.saluda();
    }
}