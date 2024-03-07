package ejercicio2;

public class Reserva {
    Cliente cliente;
    Funcion funcion;
    Asiento listaAsientos;

    public void obtenerCliente(){
        cliente.obtenerName();
        cliente.obtenerId();
        cliente.obtenerAddress();
    }
    public void obtenerFuncion(){
        funcion.obtenerPelicula();
        funcion.obtenerSala();
        funcion.obtenerHoraInicio();
        funcion.obtenerPrecioEntrada();
    }
    public void listaAsientos(){
        listaAsientos.obtenerFila();
        listaAsientos.obtenerColumna();
        listaAsientos.obtenerEstado();
    }
}
