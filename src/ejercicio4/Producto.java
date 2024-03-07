package ejercicio4;

public class Producto {

    public String name;
    public String description;
    public double price;
    public int stock;

    public Producto(String name, String description, double price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;

    }

    public String obtenerNombre(){
        return this.name;
    }

    public String obtenerDescripcion(){
        return this.description;
    }

    public double obtenerPrecio(){
        return this.price;
    }

    public int obtenerStock(){
        return this.stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }

}