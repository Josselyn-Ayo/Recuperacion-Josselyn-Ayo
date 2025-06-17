public class Pelicula {
    public String titulo = "";
    public int anio = 2024;
    private String director = "";
    private double duracion = 0.0;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public void mostrarFicha(){
        System.out.println("------------FICHA------------");
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Director: " + director);
        System.out.println("Duración: " + duracion + " horas");
    }
}
