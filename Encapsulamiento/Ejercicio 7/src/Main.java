
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.setNombre("borrador");
        producto.setPrecio(0.25);
        System.out.println("-------------Informacion del producto-------------");
        System.out.println("Nombre del producto:"+ producto.getNombre());
        System.out.println("Precio del producto: "+ producto.getPrecio());

    }
}