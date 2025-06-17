package Main;

import Esttudiantes.EstudianteBecado;

public class Main {
    public static void main(String[] args) {

        EstudianteBecado est1 = new EstudianteBecado("Luis", 20, "Sistemas", 9.2, "Académica");
        System.out.println("\nEstudiante 1:");
        est1.mostrarDatos();
        est1.aplicarDescuento();

        EstudianteBecado est2 = new EstudianteBecado("Ana", 19, "Derecho", 8.0, "Económica");
        System.out.println("\nEstudiante 2:");
        est2.mostrarDatos();
        est2.aplicarDescuento();

        EstudianteBecado est3 = new EstudianteBecado("", 17, "Arquitectura", 9.5, "Otro");
        System.out.println("\nEstudiante 3:");
        est3.mostrarDatos();
        est3.aplicarDescuento();
    }
}
