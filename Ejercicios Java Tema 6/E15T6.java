/**
 * Ejercicio 15: Programa que genera una melodia.
 * 
 * @author Adán
 */

  public class E15T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Voy a pintar una melodia aleatoria:");
    int nota = 0;
    int compas = (int)(Math.random() * 7) + 1;
    for (int j = 1 ; j <= compas ; j ++) {
    
      for (int i = 1 ; i <= 4 ; i ++) {
        nota = (int)(Math.random() * 6) + 1;
        switch (nota) {
          case 1:
          System.out.print(" do");
          break;
          case 2:
          System.out.print(" re");
          break;
          case 3:
          System.out.print(" mi");
          break;
          case 4:
          System.out.print(" fa");
          break;
          case 5:
          System.out.print(" sol");
          break;
          case 6:
          System.out.print(" la");
          break;
          case 7:
          System.out.print(" si");
          break;
        }
      }
      if (j <= compas) {
        System.out.print(" |");
      }
    }
    System.out.print("|");
   }
  }
