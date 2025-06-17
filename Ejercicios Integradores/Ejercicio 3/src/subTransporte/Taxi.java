package subTransporte;

import Transporte.Transporte;

public class Taxi extends Transporte {

    @Override
    public void iniciarViaje() {
        System.out.println("Taxi encendido");
    }

    @Override
    public double calcularDistancia(double velocidad, double tiempo) {
        return velocidad * tiempo;
    }
}

