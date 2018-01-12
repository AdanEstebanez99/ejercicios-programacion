/**
 * Ejercicio01Examen01: Programa que genere un array de 20 numeros aleatorios
 * entre 1 y 100 y que se muestren por pantalla, despues debera mostrarte cuales
 * son multiplos de 2, de 3, y de 5.
 * 
 * @author Adán
 */

  public class Ejercicio01Examen01 { // Clase principal
  public static void main(String[] args) {
    
    int[] numeros = new int[20];
    int generado;
    
    System.out.println("Generación de numeros aleatorios:");
    System.out.println();
  
    for (int i = 0; i < 20; i++) {
      generado = (int)(Math.random()*100) + 1;
      numeros[i] = generado;
      System.out.print(generado + " ");
    }
      System.out.println();
      System.out.println();
      System.out.println("Numeros que son multiplos de 2, 3 o 5:");
      System.out.println();
      System.out.print("Multiplos de 2: ");
    
    for (int i = 0; i < 20; i++) {
    
      if (numeros[i] % 2 == 0) {
        System.out.print(numeros[i]+" ");
      }
    }
    System.out.println();
    System.out.print("Multiplos de 3: ");
    for (int i = 0; i < 20; i++) {
    
      if (numeros[i] % 3 == 0) {
        System.out.print(numeros[i]+" ");
      }
    }
    System.out.println();
    System.out.print("Multiplos de 5: ");
    for (int i = 0; i < 20; i++) {
    
      if (numeros[i] % 5 == 0) {
        System.out.print(numeros[i]+" ");
      }
    }
  }
}
