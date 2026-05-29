package Ejercicios.Ejercicio4;
import java.util.Collections;
import java.util.List;

public class Maximo  <T extends Number & Comparable<T>> {

    public T max (List<T> listaMax ) {

        Collections.sort(listaMax,Collections.reverseOrder());
        return listaMax.get(0);}
}



