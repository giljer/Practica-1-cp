import java.util.Scanner;

    public class aprovado { //algoritmo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CALIFICACION = 70;
            String nombre;
        int calificacion = 70;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu calificacion");
        calificacion = scanner.nextInt();
        if(calificacion  >= CALIFICACION) { //SI calificacion >= 70 entonces.....
            System.out.println(nombre + " Su calificacion es " + calificacion + " y has aprobado la materia");
        }
            else{ //Sino
            System.out.println(nombre + " Su calificacion es " + calificacion + " reprobaste la materia");
        } //FinSi
    }
    }