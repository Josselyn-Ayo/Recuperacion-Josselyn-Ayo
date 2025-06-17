public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Leonel Arteaga");
        estudiante1.setCarrera("Ingenieria en Software");
        System.out.println("---------------Informacion--------------- ");
        System.out.println("El nombre del estudainte: " + estudiante1.getNombre());
        System.out.println("La carrera del estudiante: "+ estudiante1.getCarrera());

    }
}