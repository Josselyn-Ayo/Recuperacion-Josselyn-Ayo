package SubEmpleados;

import Empleado.Empleado;

public class EmpleadoFIjo extends Empleado {
    private double salarioBase;
    private int anio;

    public EmpleadoFIjo(String nombre, double salarioBase, int anio) {
        super(nombre);
        this.salarioBase = salarioBase;
        this.anio = 0;
    }

    public EmpleadoFIjo(double salarioBase, int anio) {
        this.salarioBase = salarioBase;
        this.anio = anio;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
    public void aplicarBono(){
        if (anio > 5 ){
            salarioBase += 100;
        }
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Empleado fijo: " + getNombre());
        System.out.println("Salario base: "+ salarioBase);
    }
}
