public class Cuenta {
    private String nombre = "Josselyn";
    private String apellido = "Ayo";
    private String contraseña;

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public void mostrarInfo(){
        System.out.println("Nombre del usuario: " + nombre+ apellido);
    }
}
