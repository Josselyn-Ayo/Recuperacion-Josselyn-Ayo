public class Estudiante {
    private String nombre;
    private String apellido;
    private String matricula;

    public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void mostrarInfo(){
        System.out.println("Estudiante: " + nombre+ apellido);
        System.out.println("Matricula:"+ matricula);
        System.out.println("Matricula registrada correctamente.");

    }
}
