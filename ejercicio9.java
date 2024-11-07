import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = leer.nextLine();

        System.out.println("Introduce la subcadena: ");
        String subcadena = leer.nextLine();

        if (cadena.contains(subcadena)) {
            System.out.println("La cadena principal tiene subcadena");
        } else {
            System.out.println("La cadena principal no tiene la subcadena");
        }
        leer.close();
    }
}
