/**
 * Ejercicio 5: Programa que muestra 50 numeros aleatorios entre 100 y 199
 * separados por espacios.
 * @author Adán
 */

  public class E5T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 50 numeros entre 100 y 199");
    
    for (int i = 1 ; i <= 50 ; i ++) {
      int numero = (int)(Math.random()*100) + 100;
      System.out.print("  "+numero);
    }
    }
  }
