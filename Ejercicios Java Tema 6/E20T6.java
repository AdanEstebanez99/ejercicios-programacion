/**
 * Ejercicio 20: Programa que rellena una vaso de agua segun los litros
 * de capacidad introducidos por el usuario.
 * 
 * @author Adán
 */

  public class E20T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Introduce la capacidad del recipiente:");
    int altura = Integer.parseInt(System.console().readLine());
    int i = 0;
    int j = 0;
    int espacio = 4;
    int numero = (int)(Math.random() * (altura)) + 1;
    int l = 0;
    int libre = altura - numero;
    
    for (i = 1 ; i <= altura ; i++) {
      System.out.print("*");
      if (l <= libre) {
        System.out.print("   ");
      } else {
        System.out.print("===");
      }
      System.out.print("*");
      System.out.println();
      l ++;
    }
    System.out.println("*****");
    System.out.println();
    System.out.println("Se han rellenado: "+(numero - 1)+" litros");
    }
  }


    
