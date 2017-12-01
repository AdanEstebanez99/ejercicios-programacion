/**
 * Ejercicio 22: Programa que dibuja una serpiente simulando su serpenteo de
 * forma aleatoria y de una longitud que el usuario introduzca por teclado.
 * 
 * @author Adán
 */

  public class E22T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Introduce la longitud de la serpiente:");
    int longitud = Integer.parseInt(System.console().readLine());
    int i = 1;
    while (i <= longitud) {
      int serpenteo = (int)(Math.random() * 3) -1;
      if (i == 1) {
        System.out.println("            @");
      } else {
        switch (serpenteo) {
          case -1:
          System.out.println("           *");
          break;
          case 0:
          System.out.println("            *");
          break;
          case 1:
          System.out.println("             *");
          break;
        }
      }
      i ++;
    }
  }
}


    
