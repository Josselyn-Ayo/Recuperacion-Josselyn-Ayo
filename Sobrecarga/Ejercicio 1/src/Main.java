public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
         int resultado1 = calculadora.sumar(5,3);
         System.out.println("La suma de 5 y 3 es: "+ resultado1);
         double resultado2 = calculadora.sumar(2.5,3.1);
         System.out.println("La suma de 2.5 y 3.1 es: "+resultado2);
         int resultado3 = calculadora.sumar(1,2,3);
         System.out.println("La suma de 1, 2 y 3 es: " + resultado3);


    }
}