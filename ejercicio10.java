import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("introduce una cadena: ");
        String cadena = leer.nextLine();

        String cadena_limpia = cadena.replaceAll("\\s+", "").toLowerCase();

        StringBuilder cadena_invertida = new StringBuilder(cadena_limpia);

        if (cadena_limpia.equals(cadena_invertida.toString())) {
            System.out.println("La cadena es un polidromo");
        } else {
            System.out.println("La cadena no es un polidromo");
        }
        leer.close();
    }
}
