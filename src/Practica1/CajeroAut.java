package Practica1;

import java.util.Scanner;

    public class CajeroAut { // algoritmo

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double LIMITE_RETIRO = 5000.0;
        System.out.println("Ingresa tu saldo disponible:");
        double saldo = teclado.nextDouble();
        System.out.println("Ingresa la cantidad que deseas retirar:");
        double retiro = teclado.nextDouble();
        if (retiro > 0) {
            if (retiro <= LIMITE_RETIRO) {
                if (retiro <= saldo) {
                    double saldoFinal = saldo - retiro;
                    System.out.println("Retiro autorizado.");
                    System.out.println("Cantidad retirada: " + retiro);
                    System.out.println("Nuevo saldo: " + saldoFinal);
                    if (saldoFinal < 500.0) {
                        System.out.println("Advertencia: Tu saldo restante es menor a 500 pesos.");
                    }
                } else {
                    System.out.println("Error: No tienes suficiente saldo.");
                }
            } else {
                System.out.println("Error: La cantidad supera el limite de retiro de 5000.");
            }
        } else {
            System.out.println("Error: La cantidad a retirar debe ser mayor a cero.");
        }
    }
}
