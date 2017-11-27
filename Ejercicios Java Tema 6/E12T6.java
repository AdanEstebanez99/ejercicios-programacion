/**
 * Ejercicio 12: Programa que pinta caracteres aleatorios a lo matrix
 * 
 * @author Adán
 */

  public class E12T6 { // Clase principal
  public static void main(String[] args) {
    System.out.print("\033[32m");
    for (long i = 0 ; i < 60000000 ; i ++){
      int num = (int)(Math.random()*94) + 32;
      System.out.print((char)(num));
      Thread.sleep(1);
      }
    
  }
}
