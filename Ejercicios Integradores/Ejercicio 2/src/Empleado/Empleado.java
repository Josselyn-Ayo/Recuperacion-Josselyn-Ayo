package Empleado;

public abstract class Empleado {
    private String nombre;
    public Empleado(){
        this.nombre="sin nombre";
    }
    public Empleado(String nombre){
        validarNombre(nombre);
    }
    public void validarNombre(String nombre){
        if (nombre == null || nombre == ""){
            System.out.println("Nombre invalido");
            this.nombre = "sin nombre";
        }else{
            this.nombre = nombre;
        }

        }

    public String getNombre() {
        return nombre;
    }
    public abstract double calcularSalario();
    public abstract void mostrarDatos();
}
