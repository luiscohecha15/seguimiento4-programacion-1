package ejercicio2;

public class Pelicula {
    private String nombre,categoria;

    public Pelicula(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void obtenerPelicula(){
        this.getNombre();
    }
    public  void obtenerCategoria(){
        this.getCategoria();
    }
}
