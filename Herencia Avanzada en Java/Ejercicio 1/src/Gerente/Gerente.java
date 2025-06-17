package Gerente;

import Empleado.Empleado;

public class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int edad, double salario, double bono) {
        super(nombre, edad, salario);
        if (salario > 800) {
            this.bono = bono;
        } else {
            this.bono = 0;
            System.out.println("Advertencia: El salario es menor o igual a 800, bono NO aplicado.");
        }
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Bono: $" + bono);
    }
}

