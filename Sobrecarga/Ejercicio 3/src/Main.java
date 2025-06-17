public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.mostrar("Luis");
        System.out.println("---------------");
        p.mostrar("Luis", 25);
        System.out.println("---------------");
        p.mostrar("Luis", 25, "Quito");
    }
}