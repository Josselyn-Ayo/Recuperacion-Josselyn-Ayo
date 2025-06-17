public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria();
        cuentaBancaria1.setTitular("Josselyn Ayo");
        cuentaBancaria1.setSaldo(10.50);
        System.out.println("----------CUENTA-------------");
        System.out.println("Titular: "+ cuentaBancaria1.getTitular());
        System.out.println("Saldo: "+cuentaBancaria1.getSaldo());

    }
}