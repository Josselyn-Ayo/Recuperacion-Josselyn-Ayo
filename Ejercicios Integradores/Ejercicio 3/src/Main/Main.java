package Main;

import subTransporte.Patineta;
import subTransporte.Taxi;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.registrarRuta("Av. Quito");
        taxi.registrarRuta("Av. Quito", "08:00");
        taxi.iniciarViaje();
        System.out.println("Distancia Taxi: " + taxi.calcularDistancia(50, 0.5) + " km");

        Patineta patineta = new Patineta();
        patineta.registrarRuta("Parque Central");
        patineta.iniciarViaje();
        System.out.println("Distancia Patineta: " + patineta.calcularDistancia(10, 0.5) + " km");

        taxi.registrarRuta("", "08:00");
    }
}
