package Ejercicios.Ejercicio2;

import modelo.Moneda;

import java.util.ArrayList;
import java.util.List;

public class MochiladeMonedas {
    private List<Moneda> monedas=new ArrayList<>();
    private int capacidad;

    public MochiladeMonedas(int capacidad) {
        this.capacidad = capacidad;
    }

    public void guardar(Moneda item) {
        monedas.add(item);
    }
    public Moneda sacar() {
        return monedas.isEmpty()
                ? null : monedas.remove(0);
    }
    public boolean estaLlena() {
        if (monedas.size()>=capacidad){
            return true;
        }
        return false;
    }
    public boolean estaVacia() {
        return monedas.isEmpty();
    }
    public void mostrarContenido(){
        for (Moneda m:monedas){
            System.out.println("Contenido de la Mochila");
            System.out.println("\n"+m.toString());
        }
        if (estaVacia()){
            System.out.println("La mochila esta vacia");
        }
    }
}
