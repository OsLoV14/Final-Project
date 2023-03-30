package Pasteleria;

public class Pastel {

    private String sabor;
    private double precio;

    public Pastel() {

        this.sabor = "vainilla";
    }

    public Pastel(String sabor) {

        this.sabor = sabor;
    }

    public void setSabor(String sabor) {

        this.sabor = sabor;
    }

    public String getSabor() {

        return sabor;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }

    public double getPrecio() {

        return precio;
    }
}
