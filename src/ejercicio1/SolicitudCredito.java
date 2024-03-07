package ejercicio1;

import javax.swing.*;

public class SolicitudCredito {
    private String tipoCredito;
    private float monto,plazo,tasaInteres;
    Cliente cliente;
    public SolicitudCredito(Cliente cliente, String tipoCredito, float monto, float plazo, float tasaInteres) {
        this.cliente = cliente;
        this.tipoCredito = tipoCredito;
        this.monto = monto;
        this.plazo = plazo;
        this.tasaInteres = tasaInteres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getPlazo() {
        return plazo;
    }

    public void setPlazo(float plazo) {
        this.plazo = plazo;
    }

    public float getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(float tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String obtenerCliente(){
        return (cliente.getName() +" "+ cliente.obtenerId() +" "+ cliente.getAddress()
                +" "+ cliente.getIngresos()+" "+ cliente.getHistorialCrediticio());
    }

    public String obtenerTipoCredito(){
        return this.getTipoCredito();
    }

    public float obtenerMonto(){
        return this.getMonto();
    }

    public float obtenerPlazo(){
        return this.getPlazo();
    }
    public float obtenerTasaInteres(){
        return this.getTasaInteres();
    }
}

