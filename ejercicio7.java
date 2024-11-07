import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduce una cadena: ");
        String cadena = leer.nextLine();

        char caracter1, caracter2;

        while (true) {
            System.out.println("Introduce el primer carcater: ");
            String input1 = leer.nextLine();
            if (input1.length() == 1) {
                caracter1 = input1.charAt(0);
                break;
            } else {
                System.out.println("Por favor introduce solo un caracter: ");
            }
        }
        while (true) {
            System.out.println("Introduce el segundo caracter: ");
            String input2 = leer.nextLine();
            if (input2.length() == 1) {
                caracter2 = input2.charAt(0);
                break;
            } else {
                System.out.println("Por favor introduce solo un caracter: ");
            }
        }
    String cadena_mod = cadena.replace(caracter1, caracter2);

    System.out.println("El resultado de la cadena es: " + cadena_mod);

    leer.close();
    }
}
