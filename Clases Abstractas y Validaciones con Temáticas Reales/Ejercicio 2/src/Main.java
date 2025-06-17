import Empleado.Empleado;
import SubEmpleados.EmpleadoFijo;
import SubEmpleados.EmpleadoPorHoras;

public class Main {
    public static void main(String[] args) {
        Empleado empFijo = new EmpleadoFijo(600);
        Empleado empHoras = new EmpleadoPorHoras(40, 5);

        System.out.println("Salario fijo: " + empFijo.calcularSalario());
        System.out.println("Salario por Horas: " + empHoras.calcularSalario());
    }
}
