package Cuenta;

public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;

    public CuentaBancaria(String numeroCuenta, double saldo) {
        if (numeroCuenta == null || numeroCuenta == "") {
            System.out.println("Error: Número de cuenta inválido.");
            this.numeroCuenta = "Sin número";
        } else {
            this.numeroCuenta = numeroCuenta;
        }
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}
