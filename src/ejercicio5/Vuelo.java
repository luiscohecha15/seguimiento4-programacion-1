package ejercicio5;

public class Vuelo {
    private int numero;
    private String ruta,fecha,horaSalida,horaLlegada;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int obtenerNumero(){
        return this.getNumero();
    }
    public String obtenerRuta(){
        return this.getRuta();
    }
    public String obtenerHoraSalida() {
        return this.getHoraSalida();
    }
    public String obtenerHoraLlegada() {
        return this.getHoraLlegada();
    }
}
