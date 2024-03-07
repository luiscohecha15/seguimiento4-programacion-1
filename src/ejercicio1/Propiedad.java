package ejercicio1;

public class Propiedad {
    private String address;
    private double valor;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public String obtenerDireccion(){
        return getAddress();
    }
    public Double obtenerValor(){
        return getValor();
    }
}
