package Main;

import Cursos.CursoCertificado;
import Cursos.CursoRegular;

public class Main {
    public static void main(String[] args) {
        CursoRegular curso1 = new CursoRegular("Java Básico",100);
        CursoCertificado curso2 = new CursoCertificado("Java Avanzado",150,50);

        System.out.println("El costo del curso regular: "+curso1.calcularCosto());
        System.out.println("El costo del curso con certificado: "+ curso2.calcularCosto());

        curso1.mostrarInf(curso1.getNombre());
        curso2.mostrarInf(curso2.getNombre(), curso2.calcularCosto());

        System.out.println("El descuento del curso regular es: "+curso1.calcularDescuento());
        System.out.println("El descuento del curso con certificado es: "+curso2.calcularDescuento());
    }
}