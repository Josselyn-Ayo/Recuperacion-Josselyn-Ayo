package Cursos;

import Curso.Curso;

public class CursoRegular extends Curso {
    public CursoRegular(String nombre, double costoInicial) {
        super(nombre, costoInicial);
    }

    @Override
    public double calcularCosto() {
        return getCostoInicial();
    }
}
