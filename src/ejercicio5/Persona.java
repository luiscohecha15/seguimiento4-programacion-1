package ejercicio5;

public class Persona {
    private String nombre,identificacion,contacto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Persona(String nombre, String identificacion, String contacto) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.contacto = contacto;
    }

    public String obtenerNombre(){
        return this.getNombre();
    }
    public String obtenerIdentificacion(){
        return this.getIdentificacion();
    }
    public String obtenerContacto(){
        return this.getContacto();
    }
}
