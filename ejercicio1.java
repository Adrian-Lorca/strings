import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) throws Exception {
      Scanner leer = new Scanner(System.in);
      System.out.println("Introduce una cadena: ");
      String cadena = leer.nextLine();
      
      for (int i = 0; i < cadena.length(); i++) {
        System.out.println(cadena.charAt(i));
      }
      leer.close();
    }
}
