package ejercicio2;

import java.util.Objects;

public class Cliente extends Persona {
    private String historialReseras;

    public Cliente(String name, String id, String address, String historialReseras) {
        super(name, id, address);
        this.historialReseras = historialReseras;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;
        return Objects.equals(historialReseras, cliente.historialReseras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(historialReseras);
    }
    public String obtenerHistorialReservas(){
        return this.historialReseras;
    }
}