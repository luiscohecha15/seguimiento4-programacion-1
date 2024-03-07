package ejercicio4;

public class ProductoPerecedero extends Producto {
    public String vencido;


    public ProductoPerecedero(String name, String description, double price, int stock, String vencido) {
        super(name, description, price, stock);
        this.vencido = vencido;
    }

    public String fechaVencimiento() {
        return this.vencido;
    }

    @Override
    public String toString() {
        return super.toString() + ", fechaVencimiento " +fechaVencimiento();
    }
}
