package subTransporte;

import Transporte.Transporte;

public class Patineta extends Transporte {

    @Override
    public void iniciarViaje() {
        System.out.println("Patineta activada");
    }

    @Override
    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }
}

