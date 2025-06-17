package Tipos;

import Trasporte.Transporte;

public class Bicicleta extends Transporte {
    @Override
    public void iniciarViaje(){
        System.out.println("La bicicleta se pedalea");
    }
}
