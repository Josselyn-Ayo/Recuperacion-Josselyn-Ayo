public class Cliente {
     public int codigoCliente;
     public boolean activo = true;
     private String nombre = "";
     private String telefono = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void verCliente (){
        System.out.println("-------------Cliente------------");
        System.out.println("Codigo del cliente: "+ codigoCliente);
        System.out.println("Estado activo: "+ activo);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Telefono: "+ telefono);
    }

}
