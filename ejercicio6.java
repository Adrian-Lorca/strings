import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("introduce una cadena: ");
        String cadena = leer.nextLine();

        String cadena_invertida = "";
        char caracter;
        String conversion;
        
        //for (i = cadena.length() -1; i >= 0; i--)
        for ( int i = cadena.length() - 1; i >= 0; i--) {
            caracter = cadena.charAt(i);
            //cadena.charAt(i);
            //substring(posicionI, posicionF);
            conversion = Character.toString(caracter);
            cadena_invertida.concat(cadena);
            
        }

        System.out.println("La cadena invertida es: " + cadena_invertida);
        leer.close();
    }
}




