package SubCuentas;


import Cuenta.CuentaBancaria;

public class CuentaAhorros extends CuentaBancaria {
    private double interesMensual; // en porcentaje

    public CuentaAhorros(String numeroCuenta, double saldo, double interesMensual) {
        super(numeroCuenta, saldo);
        this.interesMensual = interesMensual;
    }

    public void calcularInteres() {
        double interes = saldo * (interesMensual / 100);
        saldo += interes;
    }

    @Override
    public void mostrarDatos() {
        calcularInteres();
        super.mostrarDatos();
        System.out.println("Interés mensual aplicado: " + interesMensual + "%");
    }
}

