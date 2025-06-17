package Curso;

public abstract class Curso {
    private String nombre;
    private double costoInicial;

    public Curso(String nombre, double costoInicial) {
        if (nombre == null){
            System.out.println("El nombre del curso esta vacio");
            this.nombre = "Sin nombre";
        }else {
            this.nombre = nombre;
        }
        this.costoInicial = costoInicial;
    }

    public String getNombre() {
        return nombre;
    }
    public double getCostoInicial() {
        return costoInicial;
    }
    public abstract double calcularCosto();
    public void mostrarInf(String nombre){
        System.out.println("Curso: "+ nombre);
    }
    public void mostrarInf(String nombre, double costo){
        System.out.println("Curso: "+ nombre);
        System.out.println("Costo: " + costo);
    }
    public double calcularDescuento(){
        double costo = calcularCosto();
        if (costo > 150){
            return costo * 0.10;
        } else {
            return 0;
        }
    }
}
