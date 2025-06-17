public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        Asistente a  = new Asistente();

        g.mostrarInfo();
        a.mostrarInfo();
        System.out.println("---------------------");

        Empleado[] personal = {new Gerente(), new Asistente()};

        System.out.println("Informacion del personal: ");
        for (Empleado e : personal){
            e.mostrarInfo();
        }
    }
}