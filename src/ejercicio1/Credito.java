package ejercicio1;

public class Credito {
    SolicitudCredito solicitudCredito;
    private boolean estado = true;

    public Credito(SolicitudCredito solicitudCredito, boolean estado) {
        this.solicitudCredito = solicitudCredito;
        this.estado = estado;
    }

    public SolicitudCredito getSolicitudCredito() {
        return solicitudCredito;
    }

    public void setSolicitudCredito(SolicitudCredito solicitudCredito) {
        this.solicitudCredito = solicitudCredito;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String obtenerSolicitud(){
        return (solicitudCredito.obtenerCliente() +" "+solicitudCredito.obtenerTipoCredito()
        +" "+solicitudCredito.obtenerMonto()+" "+solicitudCredito.obtenerMonto() +" "+
                solicitudCredito.obtenerTasaInteres());
    }

    public String obtenerEstado(){
        if (this.getEstado()){
            return "Aprovado";
        } else {
            return "Rechazado";
        }
    }
}
