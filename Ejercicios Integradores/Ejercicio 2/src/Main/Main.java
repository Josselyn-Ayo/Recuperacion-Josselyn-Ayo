package Main;

import SubEmpleados.EmpleadoFIjo;
import SubEmpleados.EmpleadoPorComision;

public class Main {
    public static void main(String[] args) {
        EmpleadoFIjo empFijo = new EmpleadoFIjo("Luis", 500, 6);
                    empFijo.aplicarBono();

                EmpleadoPorComision empCom = new EmpleadoPorComision("María", 1000, 10);
                empCom.aplicarBono();

                System.out.println("Salario Empleado Fijo: $" + empFijo.calcularSalario());
                System.out.println("Salario Empleado por Comisión: $" + empCom.calcularSalario());

                empFijo.mostrarDatos();
                empCom.mostrarDatos();

                EmpleadoFIjo empInvalido = new EmpleadoFIjo("",400,0);
    }
}