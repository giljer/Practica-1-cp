package Practica1;

import java.util.Scanner;

    public class SistemaCalif { // algoritmo

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            final double MINIMO_APROBATORIO = 70.0;
            final double MINIMO_UNIDAD = 60.0;
            System.out.println("Ingresa la calificacion de la unidad 1:");
            double c1 = teclado.nextDouble();
            System.out.println("Ingresa la calificacion de la unidad 2:");
            double c2 = teclado.nextDouble();
            System.out.println("Ingresa la calificacion de la unidad 3:");
            double c3 = teclado.nextDouble();
            double promedio = (c1 + c2 + c3) / 3.0;
            System.out.println("Calificacion unidad 1: " + c1);
            System.out.println("Calificacion unidad 2: " + c2);
            System.out.println("Calificacion unidad 3: " + c3);
            System.out.println("Promedio final: " + promedio);
                if (promedio >= MINIMO_APROBATORIO) {
                    System.out.println("Resultado: Alumno APROBADO.");
                } else {
                    System.out.println("Resultado: Alumno REPROBADO.");
                }

                if (c1 < MINIMO_UNIDAD) {
                    System.out.println("Debes presentar recuperacion de la unidad 1.");
                }
                if (c2 < MINIMO_UNIDAD) {
                    System.out.println("Debes presentar recuperacion de la unidad 2.");
                }
                if (c3 < MINIMO_UNIDAD) {
                    System.out.println("Debes presentar recuperacion de la unidad 3.");
                }
        }
}