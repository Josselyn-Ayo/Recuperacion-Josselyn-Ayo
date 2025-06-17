import Gerente.Gerente;

public class Main {
    public static void main(String[] args) {
        Gerente gerenteLuis = new Gerente("Luis", 40, 900, 100);
        System.out.println("\nInformación Gerente Luis:");
        gerenteLuis.mostrarInfo();
        Gerente gerenteAna = new Gerente("Ana", 30, 700, 200);
        System.out.println("\nInformación Gerente Ana:");
        gerenteAna.mostrarInfo();
    }
}
