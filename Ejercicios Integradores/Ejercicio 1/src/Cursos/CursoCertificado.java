package Cursos;

import Curso.Curso;

public class CursoCertificado extends Curso {
    private double recargo;

    public CursoCertificado(String nombre, double costoInicial, double recargo) {
        super(nombre, costoInicial);
        this.recargo = recargo;
    }

    @Override
    public double calcularCosto() {
        return getCostoInicial()+recargo;
    }
}
