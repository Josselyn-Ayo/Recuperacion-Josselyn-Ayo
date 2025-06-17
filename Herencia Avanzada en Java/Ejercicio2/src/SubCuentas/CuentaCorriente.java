package SubCuentas;


import Cuenta.CuentaBancaria;

public class CuentaCorriente extends CuentaBancaria {
    private double sobregiroPermitido;

    public CuentaCorriente(String numeroCuenta, double saldo, double sobregiroPermitido) {
        super(numeroCuenta, saldo);
        this.sobregiroPermitido = sobregiroPermitido;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sobregiro permitido: $" + sobregiroPermitido);
    }
}

