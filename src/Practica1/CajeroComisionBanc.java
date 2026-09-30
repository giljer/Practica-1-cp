package Practica1;

import java.util.Scanner;

    public class CajeroComisionBanc { // algoritmo

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final double COMISION = 10.0;
        final double LIMITE_RETIRO = 5000.0;
        System.out.println("Ingresa tu saldo disponible:");
        double saldo = teclado.nextDouble();
        System.out.println("Ingresa la cantidad que deseas retirar:");
        double retiro = teclado.nextDouble();
        if (retiro > 0) {
            if (retiro <= LIMITE_RETIRO) {
                double totalNecesario = retiro + COMISION;
                if (saldo >= totalNecesario) {
                    double saldoFinal = saldo - totalNecesario;
                    System.out.println("Retiro exitoso.");
                    System.out.println("Monto retirado: " + retiro);
                    System.out.println("Comision bancaria: " + COMISION);
                    System.out.println("Saldo final: " + saldoFinal);
                } else {
                    System.out.println("Error: Saldo insuficiente para cubrir el retiro y la comision de 10 pesos.");
                }
            } else {
                System.out.println("Error: La cantidad supera el limite de 5000.");
            }
        } else {
            System.out.println("Error: La cantidad debe ser mayor a cero.");
        }
    }
}