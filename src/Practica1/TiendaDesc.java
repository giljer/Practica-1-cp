package Practica1;

import java.util.Scanner;

public class TiendaDesc { // algoritmo

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double DESC_FRECUENTE = 0.10;
        final double DESC_VIP = 0.20;
        final double DESC_ADICIONAL = 0.05;
        System.out.println("Ingresa el nombre del cliente:");
        String nombre = teclado.nextLine();
        System.out.println("Ingresa el monto de la compra:");
        double monto = teclado.nextDouble();
        System.out.println("Ingresa el tipo de cliente (1: Normal, 2: Frecuente, 3: VIP):");
        int tipo = teclado.nextInt();
        double porcentajeDesc = 0.0;
        if (tipo == 2) {
            porcentajeDesc = DESC_FRECUENTE;
        } else {
            if (tipo == 3) {
                porcentajeDesc = DESC_VIP;
            }
        }
        double descuentoTipo = monto * porcentajeDesc;
        double subtotal = monto - descuentoTipo;
        double descuentoAdicional = 0.0;
        if (monto > 2000.0) {
            descuentoAdicional = monto * DESC_ADICIONAL;
        }
        double totalPagar = subtotal - descuentoAdicional;
        System.out.println("Cliente: " + nombre);
        System.out.println("Monto original: " + monto);
        System.out.println("Descuento por tipo de cliente: " + descuentoTipo);
        System.out.println("Descuento adicional por compra mayor a 2000: " + descuentoAdicional);
        System.out.println("Total a pagar: " + totalPagar);
    }
}