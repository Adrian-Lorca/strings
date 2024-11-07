import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = leer.nextLine();

        String[] palabras = frase.split(" ");
        int n_palabras = palabras.length;

        System.out.println("La frase tiene " + n_palabras + " palabras");

        leer.close();
    }
}
