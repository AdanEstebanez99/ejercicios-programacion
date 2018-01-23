/**
 * Ejercicio 21: Programa igual que el anterior pero que tarde un poco de tiempo
 * en mostrar los sumatorios.
 * 
 * @author Adán
 */

  public class E21T7 { // Clase principal
  public static void main(String[] args) throws InterruptedException {
    
  int[][] num = new int[4][5];
    int fila, columna;
    int totalColumna = 0;
    
    for (fila = 0; fila < 4; fila ++) {
      
      for (columna = 0; columna < 5; columna ++) {
        num[fila][columna]= (int)(Math.random() * 899) + 101;
        
      }
      System.out.println();
    }
    int sumaFila;
    for (fila = 0; fila < 4; fila ++) {
      System.out.print("Fila "+fila+":   ");
      sumaFila = 0;
      
      for (columna = 0; columna < 5; columna ++) {
        System.out.printf("%6d", num[fila][columna]);
        sumaFila += num[fila][columna];
        
      }
      Thread.sleep(200);
      System.out.print(" | ");
      Thread.sleep(200);
      System.out.print("Sumatorio fila "+fila+" = "+sumaFila);
      System.out.println();
    }
    Thread.sleep(200);
    int sumaColumna = 0;
    System.out.println("------------------------------------------");
    System.out.print("sumatorio:");
    Thread.sleep(200);
    for (columna = 0; columna < 5; columna ++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila ++) {
        sumaColumna += num[fila][columna];
      }
      Thread.sleep(200);
      totalColumna += sumaColumna;
      System.out.printf("%6d", sumaColumna);
      }
      Thread.sleep(200);
      System.out.print(" | ");
      System.out.print("Suma total: "+totalColumna);
    
  }
}
