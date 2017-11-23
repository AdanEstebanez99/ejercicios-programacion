/**
 * Ejercicio 8: Programa igual que el anterior solo que la prbabilidad de que
 * salga "1" sea 1/2, la de "X" 1/3 y "2" 1/6.
 * @author Adán
 */

  public class E8T6 { // Clase principal
  public static void main(String[] args) {
    
    int columnas = 3;
    
    for (int fila = 1 ; fila <= 15 ; fila ++) {
      System.out.printf("%4d) ", fila);
      
      if (fila==15) {
        columnas = 1;
        }
      
      for (int apuesta = 1 ; apuesta <= columnas ; apuesta ++){
        int resultado = (int)(Math.random()*6) + 1;
        
        switch(resultado) {
          case 1:
          case 2:
          case 3:
            System.out.print(" 1 |");
            break;
          case 4:
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print(" 2 |");
            break;
          }
      }
      System.out.println();
    }
  }
}
