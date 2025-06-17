
public class Main {
    public static void main(String[] args) {
        Agenda ag = new Agenda();

        ag.agregarContacto("Maria");
        System.out.println("------------------");
        ag.agregarContacto("Maria", "0999803244");
        System.out.println("------------------");
        ag.agregarContacto("Josselyn", "0987654321", "josselyn.ayo@email.com");
    }
}