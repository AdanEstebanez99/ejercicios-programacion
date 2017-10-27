/**
 * Ejercicio 7: Averigua el PIN de la caja fuerte, solo tienes 4 intentos.
 * 
 * @author Adán
 */

public class E7T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Intenta averiguar el código de mi caja fuerte");
  System.out.println("El codigo tiene 4 DIGITOS y solo tienes 4 INTENTOS");
  
  for (int i = 3; i >= 0; i = i - 1) {
    System.out.println("Introduce el codigo");
    int solucion = Integer.parseInt( System.console().readLine());
    System.out.println("Te quedan "+i+" intentos");
     if ((solucion == 1999)) {
       System.out.println("¡Enhorabuena has acertado!");
    } else {
       System.out.println("Sigue intentandolo");
    }
  }
  System.out.println("No has acertado, reinicia el programa");
  }
}

