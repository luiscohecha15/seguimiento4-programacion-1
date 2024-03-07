package ejercicio2;

public class Funcion {
    Funcion funcion;
    private String horaInicio;
    private int sala ;
    private double precioEntrada;

    public Funcion(Funcion funcion, String horaInicio, int sala, double precioEntrada) {
        this.funcion = funcion;
        this.horaInicio = horaInicio;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }


    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public String obtenerHoraInicio(){
        return this.horaInicio;
    }
    public int obtenerSala(){
        return this.sala;
    }
    public double obtenerPrecioEntrada(){
        return this.precioEntrada;
    }

}
