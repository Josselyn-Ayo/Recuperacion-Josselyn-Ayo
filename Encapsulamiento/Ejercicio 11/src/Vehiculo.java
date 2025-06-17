public class Vehiculo {
     public String tipo = "Automóvil";
     public int velocidadMaxima;
     private String placa = "";
     private String marca = "Toyota";

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void mostrarInfo(){
        System.out.println("--------------- INFORMACION --------------");
        System.out.println("Tipo: "+ tipo);
        System.out.println("Velocidad maxima: "+ velocidadMaxima);
        System.out.println("Placa: " + placa);
        System.out.println("Marca: "+ marca);
    }
}
