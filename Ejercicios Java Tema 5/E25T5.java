/**
 * Ejercicio 25: Programa que te pide un numero y te lo muestra al reves
 * 
 * 
 * @author Adán
 */

public class E25T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numero= Integer.parseInt( System.console().readLine());
  int volteado = 0;
    while (numero > 0) {
    volteado = ((volteado * 10) + (numero % 10));
    numero /= 10;
  }
  System.out.println(volteado);
   }
  }

