package ejercicio1;

public class Cliente extends Persona{
    private String historialCrediticio;
    private int ingresos;

    public Cliente(String name, String id, String address, String historialCrediticio, int ingresos) {
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

    public int getIngresos() {
        return ingresos;
    }

    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }

    public String obtenerHistorialCrediticio(){
        return this.getHistorialCrediticio();
    }

    public int obtenerIngresos(){
        return this.getIngresos();
    }
}
