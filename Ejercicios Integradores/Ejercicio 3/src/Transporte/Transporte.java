package Transporte;

public abstract class Transporte {
    private String direccion;

    public void registrarRuta(String direccion) {
        if (direccion == null || direccion == "") {
            System.out.println("Error: dirección inválida");
            this.direccion = "Sin dirección";
        } else {
            this.direccion = direccion;
            System.out.println("Dirección registrada: " + direccion);
        }
    }

    public void registrarRuta(String direccion, String hora) {
        if (direccion == null || direccion == "") {
            System.out.println("Error: dirección inválida");
            this.direccion = "Sin dirección";
        } else {
            this.direccion = direccion;
            System.out.println("Dirección registrada: " + direccion + ", Hora: " + hora);
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public abstract void iniciarViaje();

    public abstract double calcularDistancia(double velocidad, double tiempo);
}

