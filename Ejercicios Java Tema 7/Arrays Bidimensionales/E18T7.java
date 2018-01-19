/**
 * Ejercicio 18: Define un array de numeros enteros de 3 filas y 6 columnas y
 * asignar los valores de la tabla.
 * 
 * @author Adán
 */

  public class E18T7 { // Clase principal
  public static void main(String[] args) {
    int[][] num = new int[3][6];
    num[0][0]=0;
    num[0][1]=30;
    num[0][2]=2;
    num[0][5]=5;
    num[1][0]=75;
    num[1][4]=0;
    num[2][2]=-2;
    num[2][3]=9;
    num[2][5]=11;
    
    int fila, columna;
    
    for (fila = 0; fila < 3; fila ++) {
      System.out.print("Fila "+fila+":");
      
      for (columna = 0; columna < 6; columna ++) {
        System.out.printf("%5d", num[fila][columna]);
      }
      System.out.println();
    }
  }
}
