/**
 * Ejercicio 23: Programa que rellena un array bidimensional sin que se repitan 
 * sus valores.
 * 
 * @author Adán
 */

  public class E23T7 { // Clase principal
  public static void main(String[] args) {
    int[] numero = new int[1000];
    boolean numeroValido = true;
    
    for (int i = 0; i < 1001; i++) {
      
      do {
        numeroValido = true;
        
        numero[i] = (int)(Math.random() * 1001);
        
        for (int j = 0; j < 1; j++) {
          if (numero[i] == numero[j]){
            numeroValido = false;
          }
        }
        
        numero[i] = (int)(Math.random() * 1001);
      } while (!numeroValido);
    }
    
    //Pasamos el contenido del numero al array bidimensional:
    
    int [][] numeroBi = new int[6][10];
    
    int fila = 0;
    int columna = 0;
    
    for (int n : numero) {
      numeroBi[fila][columna] = n;
      columna ++;
      
      if (columna == 10) {
        fila++;
        columna = 0;
      }
    }
    
    // Mostrar el contenido de numeroBi:
    
    for (int[] f : numeroBi) {
      for (int n : f) {
        System.out.printf("%4d", n);
      }
      System.out.println();
    }
  }
}
