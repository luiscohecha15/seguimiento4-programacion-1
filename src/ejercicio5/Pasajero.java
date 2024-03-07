package ejercicio5;

public class Pasajero extends Persona{
    private String historialReservas;

    public String getHistorialReservas() {
        return historialReservas;
    }

    public void setHistorialReservas(String historialReservas) {
        this.historialReservas = historialReservas;
    }

    public Pasajero(String nombre, String identificacion, String contacto, String historialReservas) {
        super(nombre, identificacion, contacto);
        this.historialReservas = historialReservas;
    }
    public String obtenerHistorialReservas(){
        return this.getHistorialReservas();
    }

}
