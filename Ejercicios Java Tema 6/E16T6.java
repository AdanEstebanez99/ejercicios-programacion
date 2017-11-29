/**
 * Ejercicio 16: Maquina tragaperras con requisitos.
 * 
 * @author Adán
 */

  public class E16T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Maquina Tragaperras:");
    int figura1 = (int)(Math.random() * 5) + 1;
    int figura2 = (int)(Math.random() * 5) + 1;
    int figura3 = (int)(Math.random() * 5) + 1;
    
    switch (figura1) {
      case 1:
      System.out.print(" corazon ");
      break;
      case 2:
      System.out.print(" diamante ");
      break;
      case 3:
      System.out.print(" herradura ");
      break;
      case 4:
      System.out.print(" campana ");
      break;
      case 5:
      System.out.print(" limon ");
      break;
    }
    
    switch (figura2) {
      case 1:
      System.out.print(" corazon ");
      break;
      case 2:
      System.out.print(" diamante ");
      break;
      case 3:
      System.out.print(" herradura ");
      break;
      case 4:
      System.out.print(" campana ");
      break;
      case 5:
      System.out.print(" limon ");
      break;
    }
    
    switch (figura3) {
      case 1:
      System.out.print(" corazon ");
      break;
      case 2:
      System.out.print(" diamante ");
      break;
      case 3:
      System.out.print(" herradura ");
      break;
      case 4:
      System.out.print(" campana ");
      break;
      case 5:
      System.out.print(" limon ");
      break;
    }
    System.out.println();
    
    if ((figura1 != figura2) && (figura1 != figura3)) {
      if (figura2 != figura3) {
        System.out.println("No coincide ninguno, reintentelo");
      }
    }
    
    if (((figura1 == figura2) || (figura2 == figura3) || (figura1 == figura3)) && ((figura1 != figura2) || (figura2 != figura3) || (figura1 != figura3))) {
        System.out.println("Hay una coincidencia, Ha recuperado su moneda");
    }
    
    if ((figura1 == figura2) && (figura1 == figura3) && (figura2 == figura3)) {
        System.out.println("¡Enhorabuena ha conseguido el premio!");
    }
   }
  }
