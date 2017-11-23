/**
 * Ejercicio 4: Programa que muestra 20 numeros aleatorios entre 0 y 10.
 * 
 * @author Adán
 */

  public class E4T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a mostrar 20 numeros entre 0 y 10");
    
    for (int i = 1 ; i <= 20 ; i ++) {
      int numero = (int)(Math.random()*11);
      System.out.print("  "+numero);
    }
    }
  }
