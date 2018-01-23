/**
 * Ejercicio 22: Programa que rellena un array de 6 filas y 10 columnas con
 * numeros enteros positivos comprendidos entre el 0 y el 1000 y se debera dar 
 * la posicion del maximo y del minimo.
 * 
 * @author Adán
 */

  public class E22T7 { // Clase principal
  public static void main(String[] args) {
    
    int[][] num = new int[6][10];
    int fila, columna;
    int numeroMayor = 0;
    int numeroMenor = 1001;
    int xMayor = 0;
    int xMenor = 0;
    int yMayor = 0;
    int yMenor = 0;
    
    for (fila = 0; fila < 6; fila ++) {
      
      for (columna = 0; columna < 10; columna ++) {
        num[fila][columna]= (int)(Math.random() * 1000);
        
        if (num[fila][columna] >= numeroMayor) {
          numeroMayor = num[fila][columna];
          xMayor = columna;
          yMayor = fila;
        }
        
        if (num[fila][columna] <= numeroMenor) {
          numeroMenor = num[fila][columna];
          xMenor = columna;
          yMenor = fila;
        }
      }
    }
    
    for (fila = 0; fila < 6; fila ++) {
      System.out.print("Fila "+fila+":   ");
      
      for (columna = 0; columna < 10; columna ++) {
        System.out.printf("%6d", num[fila][columna]);
        
      }
      System.out.println();
    }
    System.out.println("Numero Mayor: "+numeroMayor+" Posicion: x= "+xMayor+"  y= "+yMayor);
    System.out.println("Numero Menor: "+numeroMenor+" Posicion: x= "+xMenor+"  y= "+yMenor);
  }
}
