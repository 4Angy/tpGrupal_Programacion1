package Ejercicios.Ejercicio4;
import Ejercicios.Ejercicio4.Promedio;
import Ejercicios.Ejercicio4.Maximo;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Promedio promedio = new Promedio();
    Maximo maximo = new Maximo();

    List<Double> listaNum = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa un numero para agregar a la lista");
            Double ingresoUsuario = scanner.nextDouble();
            listaNum.add(ingresoUsuario);
        }
        

        System.out.println("El promedio es: " + promedio.promedio(listaNum));
        System.out.println("El numero mayor es: " + maximo.max(listaNum));

}}

