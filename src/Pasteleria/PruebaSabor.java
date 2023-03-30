package Pasteleria;

public class PruebaSabor {

    public static void main(String[] args) {

        Pastel pastel = new Pastel();
        pastel.setPrecio(400);
        System.out.println("Sabor de pastel básico: " + pastel.getSabor());
        System.out.println("Costo de pastel básico: $ " + pastel.getPrecio());

        PastelCumple pastelCumple = new PastelCumple();
        pastelCumple.setVelas(6);
        pastelCumple.setPrecio(655.50);
        System.out.println("Sabor de pastel de cumpleaños: " + pastelCumple.getSabor());
        System.out.println("Cantidad de velas incluidas en el pastel: " + pastelCumple.getVelas());
        System.out.println("Costo de pastel de cumpleaños: $ " + pastelCumple.getPrecio());

        PastelBoda pastelBoda = new PastelBoda();
        pastelBoda.setSabor("tiramisú");
        pastelBoda.setNiveles(4);
        pastelBoda.setPrecio(1500.50);
        System.out.println("Sabor de pastel de bodas: " + pastelBoda.getSabor());
        System.out.println("Niveles que conforman el pastel: " + pastelBoda.getNiveles());
        System.out.println("Costo de pastel de boda: $ " + pastelBoda.getPrecio());
    }
}
