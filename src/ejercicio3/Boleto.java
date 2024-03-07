package ejercicio3;

public class Boleto {
    Cliente cliente;
    Viaje viaje;
    Asiento asiento;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }
    public void Cliente (){
        cliente.getName();
        cliente.getId();
        cliente.getAddress();
    }

}
