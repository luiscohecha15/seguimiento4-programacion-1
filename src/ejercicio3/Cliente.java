package ejercicio3;

import ejercicio3.Persona;

public class Cliente extends Persona {
    private String historialCrediticio, ingresos;

    public Cliente(String name, String id, String address, String historialCrediticio, String ingresos) {
        super(name, id, address);
        this.historialCrediticio = historialCrediticio;
        this.ingresos = ingresos;
    }

    public String getHistorialCrediticio() {
        return historialCrediticio;
    }

    public void setHistorialCrediticio(String historialCrediticio) {
        this.historialCrediticio = historialCrediticio;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String obtenerHistorialCrediticio(){
        return this.getHistorialCrediticio();
    }

    public String obtenerIngresos(){
        return this.getIngresos();
    }
}
