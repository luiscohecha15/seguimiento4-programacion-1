package ejercicio2;

import java.lang.reflect.Array;

public class Sala {
    private int numero,capacidad;
    private String asientos[][] = {{"A","B","C"},{"1","2","3"}};

    public Sala(int numero, int capacidad, String[][] asientos) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.asientos = asientos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }
    public void obtenerNumero(){
        this.getNumero();
    }
    public void obtenerCapacidad(){
        this.getCapacidad();
    }

}
