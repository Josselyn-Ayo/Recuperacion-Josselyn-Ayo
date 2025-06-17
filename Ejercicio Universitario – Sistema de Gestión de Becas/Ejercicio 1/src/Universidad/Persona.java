package Universidad;
public abstract class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        if (nombre == null || nombre == "") {
            System.out.println("Error: El nombre no puede estar vacío.");
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }

        if (edad < 18) {
            System.out.println("Error: La edad debe ser mayor o igual a 18.");
            this.edad = 0;
        } else {
            this.edad = edad;
        }
    }

    public abstract void mostrarDatos();
}
