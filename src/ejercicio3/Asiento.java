package ejercicio3;

public class Asiento {
    private int numero;
    private String estado = "Pendiente";

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int obtenerNumero(){
        return this.getNumero();
    }
    public String obtenerEstado(){
        return this.getEstado();
    }
    public void reservar(){
        setEstado("Reservado");
    }
    public void ocupar(){
        setEstado("Ocupado");
    }
}
