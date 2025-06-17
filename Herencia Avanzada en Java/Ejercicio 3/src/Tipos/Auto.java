package Tipos;

import Vehiculos.Vehiculo;

public class Auto extends Vehiculo {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
        if (marca == null) {
            System.out.println("Error: La marca no puede ser nula.");
            this.marca = "Sin marca";
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Vehículo liviano");
    }
}

