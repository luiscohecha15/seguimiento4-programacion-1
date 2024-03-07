package ejercicio3;

public class Viaje {
    private String fecha,horaSalida,horaLlegada;
    private int tren;

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

    public int getTren() {
        return tren;
    }

    public void setTren(int tren) {
        this.tren = tren;
    }
    public String obtenerFecha(){
        return getFecha();
    }
    public String obtenerHoraSalida(){
        return getHoraSalida();
    }
    public String obtenerHoraLlegada(){
        return getHoraLlegada();
    }
    public int tren(){
        return this.getTren();
    }
}
