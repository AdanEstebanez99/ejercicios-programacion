/**
 * Ejercicio 28: Programa que pide un numero por teclado y te dice el factorial
 * de ese numero.
 * 
 * @author Adán
 */

public class E28T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numeroIntroducido= Integer.parseInt( System.console().readLine());
  int suma = 1;
  for (int i = 1 ; i <= numeroIntroducido ; i ++) {
      suma *= i;
    }
    System.out.println("El factorial de "+numeroIntroducido+" es "+suma);
   }
  }

