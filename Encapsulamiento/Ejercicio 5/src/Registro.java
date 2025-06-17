public class Registro {
    private String nombre;
    private final String codigo = "REG-001";

    public Registro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }


}
