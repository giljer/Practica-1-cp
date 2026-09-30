import java.util.Scanner;

    public class jubilacion { //algoritmo

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EDAD_JUNILACION = 65;
                String nombre;
        int edad = 0;
        System.out.println("Escribe tu nombre");
        nombre = scanner.nextLine();
        System.out.println("Escribe tu edad");
        edad = scanner.nextInt();
                if(edad >= EDAD_JUNILACION) { // SI edad <= 65 entoncees......
                    System.out.println(nombre + " Tiene " + edad + " años y esta listo para jubilarse");
         }
                else{ //sino
                    System.out.println(nombre + " Tiene " + edad + " años y aun no se puede jubilar ");
    }  //FinSi
    }
}
//fin algoritmo
