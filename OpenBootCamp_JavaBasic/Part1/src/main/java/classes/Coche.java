package classes;

public class Coche {

    public int getPuertas() {
        return puertas;
    }

    private int puertas = 0;

    public void sumPuertas(int puertasNuevas) {
        this.puertas = this.puertas+puertasNuevas;
    }

}
