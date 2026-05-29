package Ejercicios.Ejercicio2;

import modelo.Moneda;

import java.util.ArrayList;
import java.util.List;

public class Mochila <T>{
    private List <T> elementos=new ArrayList<>();
    private int capacidad;

    public Mochila(int capacidad) {
        this.capacidad = capacidad;
    }

    public void guardar(T item) {

        if (!estaLlena()) {
            System.out.println("Moneda guarda correctamente");
            elementos.add(item);
        }else {
            System.out.println("La mochila esta llena");
        }
        }

    public T sacar() {
        return elementos.isEmpty()
                ? null : elementos.remove(0);
    }
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
    public boolean estaLlena() {
        if (elementos.size()>=capacidad){
            return true;
        }
        return false;
    }
   public void mostrarContenido(){
        for (T t:elementos){
            System.out.println("Contenido de la Mochila");

            System.out.println("\n"+t.toString());
        }
        if (estaVacia()){
            System.out.println("La mochila esta vacia");
        }
   }

}


