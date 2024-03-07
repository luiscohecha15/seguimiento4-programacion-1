package ejercicio3;

import java.util.Arrays;

public class Tren {
    private int numero;
    private String ruta;
    private int[] listaVagones = {1,2,3};

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int[] getListaVagones() {
        return listaVagones;
    }

    public void setListaVagones(int[] listaVagones) {
        this.listaVagones = listaVagones;
    }
    public int obtenerNumero(){
        return this.getNumero();
    }
    public String obtenerRuta(){
        return this.getRuta();
    }
    public int[] obtenerVagon(){
        return Arrays.stream(this.getListaVagones()).toArray();
    }

    @Override
    public String toString() {
        return "Tren{" +
                "listaVagones=" + Arrays.toString(listaVagones) +
                '}';
    }
}

