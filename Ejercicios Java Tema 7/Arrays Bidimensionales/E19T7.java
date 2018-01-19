/**
 * Ejercicio 19: Programa que pide un array de 20 numeros enteros y que te hace
 * la suma de cada fila, cada columna y la suma total de las filas y las
 * columnas
 * 
 * @author Adán
 */

  public class E19T7 { // Clase principal
  public static void main(String[] args) {
    int[][] num = new int[4][5];
    int fila, columna;
    
    System.out.println("Introduzca 20 numeros enteros: ");
    
    for (fila = 0; fila < 4; fila ++) {
      
      for (columna = 0; columna < 5; columna ++) {
        System.out.print("Fila: "+fila+" Columna: "+columna+"  ");
        num[fila][columna]= Integer.parseInt(System.console().readLine());
        
      }
      System.out.println();
    }
    
    for (fila = 0; fila < 4; fila ++) {
      System.out.print("Fila "+fila+":");
      int sumaFila = 0;
      
      for (columna = 0; columna < 5; columna ++) {
        System.out.printf("%5d", num[fila][columna]);
        sumaFila += num[fila][columna];
        
      }
      System.out.print("   ");
      System.out.print("Sumatorio fila "+fila+" = "+sumaFila);
      System.out.println();
    }
  }
}
