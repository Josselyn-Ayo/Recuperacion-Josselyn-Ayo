package SubEmpleados;

import Empleado.Empleado;

public class EmpleadoPorComision extends Empleado {


        private double ventas;
        private double porcentajeComision;

        public EmpleadoPorComision(String nombre, double ventas, double porcentajeComision) {
            super(nombre);
            this.ventas = ventas;
            this.porcentajeComision = porcentajeComision;
        }

        @Override
        public double calcularSalario() {
            return ventas + (ventas * porcentajeComision / 100);
        }

        public void aplicarBono() {
            if (ventas > 1000) {
                ventas += 200;
            }
        }

        @Override
        public void mostrarDatos() {
            System.out.println("Empleado por Comisión: " + getNombre());
            System.out.println("Ventas: $" + ventas);
            System.out.println("Comisión: " + porcentajeComision + "%");
        }
    }


