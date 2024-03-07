package ejercicio2;

public class Asiento {
    private String fila,columna,estado;

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String obtenerFila(){
        return this.fila;
    }
    public String obtenerColumna(){
        return this.columna;
    }
    public String obtenerEstado(){
        return this.estado;
    }
}
