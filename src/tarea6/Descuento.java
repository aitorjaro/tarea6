/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea6;

/**
 *
 * @author aitor
 */
public class Descuento {
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioProducto -= DESCUENTOMAYORDETRES;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTODISTINTODECERO;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTOGENERAL;
            mostrarTotal(total);
        }
    }
    private static final double DESCUENTOGENERAL = 0.95;
    private static final double DESCUENTODISTINTODECERO = 0.8;
    private static final int DESCUENTOMAYORDETRES = 5;

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

}
