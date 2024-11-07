import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("introduce una cadena: ");
        String cadena = leer.nextLine();

        StringBuilder cadena_convertida = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isUpperCase(c)) {
                cadena_convertida.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                cadena_convertida.append(Character.toUpperCase(c));
            } else {
                cadena_convertida.append(c);
            }
        }
        System.out.println("La cadena convertida es: " + cadena_convertida);
        leer.close();
    }
}
