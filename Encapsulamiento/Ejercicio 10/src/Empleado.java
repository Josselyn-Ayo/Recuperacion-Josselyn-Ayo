public class Empleado {
    public String departamento = "ventas";
    public String horario;
    private String nombre = "";
    private double salario = 0.0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void mostrarInfo(){
        System.out.println("Departamento: "+departamento);
        System.out.println("Horario: "+ horario);
        System.out.println("Nombre: "+nombre);
        System.out.println("Salario: "+salario);
    }
}
