package ejercicio3;

import ejercicio2.Asiento;

public class Vagon {
    private String tipo;
    private int capacidad;
    private int listaAsiento;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getListaAsiento() {
        return listaAsiento;
    }

    public void setListaAsiento(int listaAsiento) {
        this.listaAsiento = listaAsiento;
    }
    public String obtenerTipo(){
        return this.getTipo();
    }
    public int obtenerCapacidad(){
        return this.getCapacidad();
    }
    public int obtenerListaAsientos(){
        return this.getListaAsiento();
    }
}
