/**
 * Ejercicio 16: Programa que dice si un numero introducido por teclado es primo
 * 
 * 
 * @author Adán
 */

public class E16T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un número");
  int numero= Integer.parseInt( System.console().readLine());
  boolean primo = true;
  
  for (int i = 2; i < numero; i++) {
    if (numero % i == 0) {
      primo = false;
    }
  }
  if (primo) {
    System.out.println("El numero introducido es primo");
  } else {
      System.out.println("El numero introducido no es primo");
  }
   
  }
}
