import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = leer.nextLine();

        char caracter;
        while (true) {
            System.out.println("Introduce un caracter: ");
            String input = leer.nextLine();
            if (input.length() == 1) {
                caracter = input.charAt(0);
                break;
            } else {
                System.out.println("Por favor, introduce solo un caracter: ");
            }
        }

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            } 
        }

        System.out.println("el caracter: " + caracter + " aparece " + contador + " veces en la cadena.");
        leer.close();
    }
}
