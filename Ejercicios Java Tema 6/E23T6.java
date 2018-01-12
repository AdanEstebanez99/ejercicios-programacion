/**
 * Ejercicio 23: Programa que genera 5 dados de poker aleatorios a la vez.
 * 
 * @author Adán
 */

  public class E23T6 { // Clase principal
  public static void main(String[] args) {
    int con = 0;
    do {
      switch ((int) (Math.random() * 6)) {
        case 0:
          System.out.print("As ");
          break;
        case 1:
          System.out.print("K ");
          break;
        case 2:
          System.out.print("Q ");
          break;
        case 3:
          System.out.print("J ");
          break;
        case 4:
          System.out.print("7 ");
          break;
        case 5:
          System.out.print("8 ");
          break;
      }
      con++;
    } while (con < 5); 
  }
}


    
