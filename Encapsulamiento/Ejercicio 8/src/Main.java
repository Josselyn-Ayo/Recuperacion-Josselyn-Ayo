
public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Cenicienta");
        libro.setAnioPublicacion(1999);
        System.out.println("--------Libro-------");
        System.out.println("Titulo: "+ libro.getTitulo());
        System.out.println("Año de publicacion: "+ libro.getAnioPublicacion());

    }
}