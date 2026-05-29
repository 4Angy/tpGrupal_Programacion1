package modelo;

public class Moneda {
    private final double valor;
    private final String nombre;
    private final String simbolo;

    public Moneda(double valor, String nombre, String simbolo) {
        this.valor = valor;
        this.nombre = nombre;
        this.simbolo = simbolo;
    }


    public double getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    @Override
    public String toString() {
        return "Moneda: "+simbolo+valor+" "+nombre;
    }
}


