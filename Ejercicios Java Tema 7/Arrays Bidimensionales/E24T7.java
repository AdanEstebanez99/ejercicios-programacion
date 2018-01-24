/**
 * Ejercicio 24: Programa que mejora el juego de buscar el tesoro diciendo que
 * hay una mina cerca si hay menos de una casilla de distancia
 * 
 * @author Adán
 */

  public class E24T7 { // Clase principal
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
