public class Main {
    public static void main(String[] args) {
        Persona persona1 =new Persona("Anabel", "Ayo",18);
        persona1.setEdad(19);
        persona1.mostrarInfo();
        System.out.println("Edad: " +persona1.getEdad());


    }
}