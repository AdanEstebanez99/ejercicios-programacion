/**
 * Ejercicio 20: Programa que rellena un array bidimensional como el ejercicio 
 * anterior pero con numeros aleatorios.
 * 
 * @author Adán
 */

  public class E20T7 { // Clase principal
  public static void main(String[] args) {
    
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
      System.out.print(" | ");
      System.out.print("Sumatorio fila "+fila+" = "+sumaFila);
      System.out.println();
    }
    
    int sumaColumna = 0;
    System.out.println("------------------------------------------");
    System.out.print("sumatorio:");
    
    for (columna = 0; columna < 5; columna ++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila ++) {
        sumaColumna += num[fila][columna];
      }
      totalColumna += sumaColumna;
      System.out.printf("%6d", sumaColumna);
      }
      System.out.print(" | ");
      System.out.print("Suma total: "+totalColumna);
    
  }
}
