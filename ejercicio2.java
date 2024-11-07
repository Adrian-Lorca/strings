import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = leer.nextLine();

        System.out.println("Introduce la subcadena: ");
        String subcadena = leer.nextLine();

        if (cadena.startsWith(subcadena)) {
            System.out.println("La cadena comienza con la subcadena");
        } else {
            System.out.println("La cadena no comienza con la subcadena");
        }
        
        leer.close();
    }
}


