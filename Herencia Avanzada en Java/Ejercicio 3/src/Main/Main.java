package Main;

import Tipos.Auto;
import Tipos.Camion;

public class Main{
    public static void main(String[] args) {
        Auto auto = new Auto("Toyota", "Yaris");
        System.out.println("\nInformación Auto:");
        auto.mostrarInfo();
        Camion camion = new Camion(null, "Volvo FH");
        System.out.println("\nInformación Camión:");
        camion.mostrarInfo();
    }
}
