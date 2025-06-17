public class Estudiante {
    private double nota;

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
            System.out.println("Nota valida registrada: " + nota);
        } else {
            System.out.println("La nota no esta en el rango");
        }
    }

    public double getNota(){
        return nota;
    }
}
