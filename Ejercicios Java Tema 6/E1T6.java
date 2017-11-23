/**
 * Ejercicio 1: Muestra la tirada de 3 dados y la suma de estos tres.
 * 
 * @author Adán
 */

public class E1T6 { // Clase principal
public static void main(String[] args) {
  for (int i = 1 ; i <= 3 ; i++) {
    int dado = (int)(Math.random()*6) + 1;
    System.out.println("El dado "+i+" vale: "+dado);
  }
  }
}
