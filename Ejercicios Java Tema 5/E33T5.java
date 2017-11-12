/**
 * Ejercicio 33: Programa que pinta una U y la base es igual que la altura pero
 * con dos espacios para simular la curvatura.
 * 
 * @author Adán
 */

public class E33T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce al altura:");
  int altura= Integer.parseInt( System.console().readLine());
  int i = 0;
  int j = 0;
  int base = (altura - 2);
  for (i = 1 ; i < altura; i++) {
      System.out.print("*");
      for (j = 1 ; j <= base ; j ++) {
      System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
  for (j = 1 ; j <= base ; j ++) {
      System.out.print("*");
    }
    System.out.print(" ");
 }
}
    
    

