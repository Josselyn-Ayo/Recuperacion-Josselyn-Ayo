public class Productos {
        private String nombre = "cepillo";
        private double precio;
        public Productos(double precio){
            this.precio= precio;
        }

        public String getNombre() {
            return nombre;
        }

        public double getPrecio() {
            return precio;
        }
}
