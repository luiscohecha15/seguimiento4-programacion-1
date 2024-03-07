package ejercicio4;

import ejercicio4.ProductoPerecedero;

import javax.swing.*;
import java.util.ArrayList;

public class PrincipalProductos {
    public static void main(String[] args) {

        ArrayList<Producto> producto = new ArrayList<>();
        ProductoPerecedero productoPerecedero;

        int selec;

        boolean flag = true;
        do{
            selec = Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar\n2.Modificar" +
                    "\n3.Eliminar"));

            switch (selec){
                case 1:
                    producto.add(new ProductoPerecedero(JOptionPane.showInputDialog(null,"Nombre del producto")
                            ,JOptionPane.showInputDialog(null,"Descripcion del producto"),
                            Double.parseDouble(JOptionPane.showInputDialog(null,"Precio")),
                            Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el stock")),
                            JOptionPane.showInputDialog(null,"Fecha de vencimiento")));
                    System.out.println(producto);

                    break;
                case 2:
                    System.out.println("Listado de productos");
                    String changeName = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a modificar");
                    for (Producto productos : producto){
                        System.out.println(productos);
                        if (productos.obtenerNombre().equals(changeName)){
                            productos.name = JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre");
                            productos.description = JOptionPane.showInputDialog(null,"Ingrese la nueva descripcion");
                            productos.stock = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo stock"));
                            productos.price = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo precio"));

                            break;
                        }
                    }
                    break;
                case 3:
                    String deleteName = JOptionPane.showInputDialog(null, "Ingrese el nombre del producto a eliminar");
                    int index = 0;
                    for (Producto productos : producto) {
                        if (productos.obtenerNombre().equals(deleteName)) {
                                producto.remove(index);
                        }
                        index++;
                    }
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }while (flag);
        for (Producto producto1 : producto){
            System.out.println(producto1.name);
        }
    }
}
