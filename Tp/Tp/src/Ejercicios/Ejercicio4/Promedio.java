package Ejercicios.Ejercicio4;
import java.util.List;

public class Promedio <T extends Number> {

    public double promedio(List<T> listaNum) {
        double totalNumeros = 0;

        for (T n : listaNum) {
            totalNumeros += n.doubleValue();
        }

        return totalNumeros / listaNum.size();
    }
}
