package Pasteleria;

public class PastelBoda extends Pastel {

    int niveles = 0;

    public PastelBoda() {

        super("almendra");
    }

    public void setNiveles(int numNiveles) {

        this.niveles = numNiveles;
    }

    public int getNiveles() {

        return niveles;
    }
}
