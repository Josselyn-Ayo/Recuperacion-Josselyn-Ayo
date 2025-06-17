package SubEmpleados;

import Empleado.Empleado;

public class EmpleadoFijo extends Empleado {
    private double sueldoBase;

    public EmpleadoFijo(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public double calcularSalario() {
        return sueldoBase;
    }
}
