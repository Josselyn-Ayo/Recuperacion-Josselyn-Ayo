
public class Main{

public static void main(String[] args) {
    Mensajero m = new Mensajero();

    m.enviar("Hola");
    System.out.println("-----------------");
    m.enviar("Hola","Emilia");
    System.out.println("------------------");
    m.enviar("Hola","Josselyn",1);
}
}