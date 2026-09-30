package Practica1;

import java.util.Scanner;

    public class CobroEstacionamiento { // algoritmo

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double TARIFA_MOTO = 10.0;
        final double TARIFA_AUTO = 20.0;
        final double TARIFA_CAMIONETA = 30.0;
        final double DESC_5_HORAS = 0.10;
        final double DESC_10_HORAS = 0.20;
        System.out.println("Ingresa el tipo de vehiculo (1: Motocicleta, 2: Automovil, 3: Camioneta):");
        int tipoVehiculo = teclado.nextInt();
        System.out.println("Ingresa el numero de horas que permanecio estacionado:");
        int horas = teclado.nextInt();
        if (horas <= 0) {
            System.out.println("Error: La cantidad de horas no es valida.");
        } else {
            double tarifaHora = 0.0;
            String nombreVehiculo = "";
            if (tipoVehiculo == 1) {
                tarifaHora = TARIFA_MOTO;
                nombreVehiculo = "Motocicleta";
            } else {
                if (tipoVehiculo == 2) {
                    tarifaHora = TARIFA_AUTO;
                    nombreVehiculo = "Automovil";
                } else {
                    if (tipoVehiculo == 3) {
                        tarifaHora = TARIFA_CAMIONETA;
                        nombreVehiculo = "Camioneta";
                    }
                }
            }
            if (tarifaHora == 0.0) {
                System.out.println("Error: Tipo de vehiculo no valido.");
            } else {
                double subtotal = horas * tarifaHora;
                double porcentajeDesc = 0.0;

                if (horas > 10) {
                    porcentajeDesc = DESC_10_HORAS;
                } else {
                    if (horas > 5) {
                        porcentajeDesc = DESC_5_HORAS;
                    }
                }
                double descuento = subtotal * porcentajeDesc;
                double totalPagar = subtotal - descuento;
                System.out.println("Tipo de vehiculo: " + nombreVehiculo);
                System.out.println("Horas: " + horas);
                System.out.println("Tarifa por hora: " + tarifaHora);
                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento aplicado: " + descuento);
                System.out.println("Total a pagar: " + totalPagar);
            }
        }
    }
}