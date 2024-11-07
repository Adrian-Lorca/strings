import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("introduce tu nombre y apellidos: ");
        String nombre = leer.nextLine();

        String[] palabras = nombre.split(" ");

        StringBuilder iniciales = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                iniciales.append(Character.toUpperCase(palabra.charAt(0)));
            }

            System.out.println("Las iniciales en mayuscula son: " + iniciales);

            leer.close();
        }
    }
}
