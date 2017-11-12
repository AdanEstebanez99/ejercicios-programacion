/**
 * Ejercicio 31: Programa que dibuja una L segun la altura introducida por 
 * teclado y la base es la mitad de la altura.
 * 
 * @author Adán
 */

public class E31T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce al altura:");
  int altura= Integer.parseInt( System.console().readLine());
  int i = 0;
  int j = 0;
  int base = (altura / 2);
  for (i = 1 ; i < altura; i++) {
      System.out.print("*");
      System.out.println();    
      }
  for (j = 1 ; j <= base ; j ++) {
      System.out.print("*");
    }
 }
}
    
    

