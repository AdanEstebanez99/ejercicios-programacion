/**
 * Ejercicio3Examen1: Dibuja el numero 155 y debe tener la altura que el usuario
 * introduzca por teclado.
 * @author Adán
 */

public class Ejercicio3Examen1 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce al altura(minimo 5):");
  int altura= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce los espacios entre numeros");
  int espacio= Integer.parseInt( System.console().readLine());
  int i = 0;
  int j = 0;
  for (i = 1 ; i <= altura; i++) {
      System.out.print("*");
    for (j = 1 ; j <= espacio; j++) {
      System.out.print(" ");
    }
    if ((i ==1) || (i == 3) || (i == altura)) {
      System.out.print("****");
    } else if (i == 2) {
      System.out.print("*   ");
    } else {
      System.out.print("   *");
    }
    for (j = 1 ; j <= espacio; j++) {
      System.out.print(" ");
    }
    if ((i ==1) || (i == 3) || (i == altura)) {
      System.out.print("****");
    } else if (i == 2) {
      System.out.print("*   ");
    } else {
      System.out.print("   *");
    }
    System.out.println();
  }
 }
 }

