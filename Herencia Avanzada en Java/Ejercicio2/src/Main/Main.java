package Main;

import SubCuentas.CuentaAhorros;
import SubCuentas.CuentaCorriente;

public class Main{
    public static void main(String[] args) {

        CuentaAhorros ahorros = new CuentaAhorros("001A", 1000, 2);
        System.out.println("\nCuenta de Ahorros:");
        ahorros.mostrarDatos();

        CuentaCorriente corriente = new CuentaCorriente("", 500, 200);
        System.out.println("\nCuenta Corriente:");
        corriente.mostrarDatos();
    }
}
