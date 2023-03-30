package Pasteleria;

public class PastelCumple extends Pastel {

    private int numVelas = 0;

    public PastelCumple() {

        super("chocolate");
    }

    public void setVelas(int velas) {

        this.numVelas = velas;
    }

    public int getVelas() {

        return numVelas;
    }
}
