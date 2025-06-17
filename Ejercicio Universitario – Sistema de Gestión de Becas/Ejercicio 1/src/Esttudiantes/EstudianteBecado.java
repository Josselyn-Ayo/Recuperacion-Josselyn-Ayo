package Esttudiantes;

public class EstudianteBecado extends Estudiante {
    private String tipoBeca;

    public EstudianteBecado(String nombre, int edad, String carrera, double promedio, String tipoBeca) {
        super(nombre, edad, carrera, promedio);
        this.tipoBeca = tipoBeca;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de Beca: " + tipoBeca);
    }

    public void aplicarDescuento() {
        double descuento;

        if (tipoBeca.equalsIgnoreCase("Académica") && getPromedio() >= 9) {
            descuento = 50;
        } else if (tipoBeca.equalsIgnoreCase("Económica")) {
            descuento = 40;
        } else {
            descuento = 30;
        }

        System.out.println("Descuento del " + descuento + "%");
    }
}

