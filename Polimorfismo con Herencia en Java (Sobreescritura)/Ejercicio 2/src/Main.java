public class Main {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();

        moto.arrancar();
        carro.arrancar();
        System.out.println("------------------------");
        Vehiculo[] lista = { new Moto(), new Carro()};

        System.out.println("Vehiculos Arrancando: ");
        for (Vehiculo v : lista) {
            v.arrancar();
        }
    }
}