package Casas;

import Casas.tipos.CasaChica;

public class Main {
    public static void main(String[] args) {
        MetodoPrueba();
    }
    private static void MetodoPrueba() {
        CasaChica casaChica = new CasaChica("Verde");
        CasaGrande casaGrande = new CasaGrande();

        casaChica.pintar("Rojo");
        CasaChica casaChica2 = new CasaChica();
        casaChica2.pintar("Verde") ;
        CasaChica.contador++;
    }
}