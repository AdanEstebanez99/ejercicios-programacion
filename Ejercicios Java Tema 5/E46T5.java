/**
 * Ejercicio 46: Programa que dibuja un cuadrado segun una altura y una base
 * introducidos por teclado, aunque estos datos deben ser mayor o igual que 2.
 * 
 * @author Adán
 */

public class E46T5 { // Clase principal
public static void main(String[] args) {
    System.out.print("Introduce la altura (minimo 2): ");    
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la anchura (minimo 2): ");    
    int ancho = Integer.parseInt(System.console().readLine());
    int i = 0;
    int espacios = 0;
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
    for (i = 2 ; i < altura ; i ++){
      System.out.print("\n*");
      for (espacios = 2 ; espacios < ancho ;espacios ++){
        System.out.print(" ");
        }
      System.out.print("*");
    }
    System.out.println();
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
  }
}
