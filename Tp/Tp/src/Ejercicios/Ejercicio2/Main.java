package Ejercicios.Ejercicio2;

import modelo.Moneda;

public class Main {
    public static void main(String[] args) {
        System.out.println("Con clase generica");
        Mochila<Moneda> mochilaMonedas = new Mochila<>(2);
        mochilaMonedas.guardar(new Moneda(20,"centavos","$"));
        mochilaMonedas.guardar(new Moneda(25,"centavos","$"));
        mochilaMonedas.guardar(new Moneda(20,"centavos","$"));
        mochilaMonedas.mostrarContenido();
        mochilaMonedas.sacar();
        mochilaMonedas.mostrarContenido();
        System.out.println("Con clase normal");
        MochiladeMonedas mochiladeMonedas1=new MochiladeMonedas(2);
        mochiladeMonedas1.guardar(new Moneda(1,"peso","$"));
        mochiladeMonedas1.guardar(new Moneda(25,"centavos","$"));
        mochiladeMonedas1.guardar(new Moneda(20,"centavos","$"));
        mochiladeMonedas1.mostrarContenido();
        mochiladeMonedas1.sacar();
        mochiladeMonedas1.mostrarContenido();

    }

}
