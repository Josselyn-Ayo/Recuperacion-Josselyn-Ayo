public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();

        Animal[] animales = {new Perro(), new Gato()};

        System.out.println("Animales hacen: ");
        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}