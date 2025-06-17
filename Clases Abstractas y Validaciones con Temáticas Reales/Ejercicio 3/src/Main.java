import Tipos.Bicicleta;
import Tipos.Bus;
import Trasporte.Transporte;

public class Main {
    public static void main(String[] args) {
        Transporte t1 = new Bus();
        Transporte t2 = new Bicicleta();

        t1.iniciarViaje();
        t2.iniciarViaje();

    }
}
