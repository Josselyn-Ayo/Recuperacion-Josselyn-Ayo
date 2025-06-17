import Figuras.Figura;
import SubFiguras.Cuadrado;
import SubFiguras.Triangulo;

public class Main {
    public static void main(String[] args) {
        Figura cuadrado = new Cuadrado(4);
        Figura triangulo = new Triangulo(5,3);

        System.out.println("Area del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
    }
}
