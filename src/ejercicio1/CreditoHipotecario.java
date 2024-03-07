package ejercicio1;

public class CreditoHipotecario extends Credito{
    Propiedad propiedad;

    public CreditoHipotecario(SolicitudCredito solicitudCredito, boolean estado, Propiedad propiedad) {
        super(solicitudCredito, estado);
        this.propiedad = propiedad;
    }

    public Propiedad obtenerPropiedad(){
        return propiedad;
    }
}
