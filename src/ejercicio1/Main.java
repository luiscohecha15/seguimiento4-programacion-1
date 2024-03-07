package ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Persona persona;
        Cliente cliente = new Cliente("Luis","1005133059","Armenia, centenario","Bueno",4000000);
        SolicitudCredito solicitudCredito = new SolicitudCredito(cliente,"Hipotecario",50000000,10,0.05f);
        Credito credito = new Credito(solicitudCredito,true);

        JOptionPane.showMessageDialog(null, "Nombre: "+cliente.obtenerName()+"\nId: "+cliente.obtenerId()
        +"\nHistorial: "+cliente.obtenerHistorialCrediticio()+"\nIngresos: "+ cliente.obtenerIngresos()+"\n\nTipo Credito: "+
                solicitudCredito.obtenerTipoCredito()+"\nMonto: "+ solicitudCredito.obtenerMonto()+"\nPlazo:" +
                solicitudCredito.obtenerPlazo()+" meses\nTasa interes: "+ solicitudCredito.obtenerTasaInteres());
    }



}
