/**
 * Ejercicio 15 Tema 8: Programa que muestra por pantalla todos los numeros
 * primos entre 0 y 1000.
 * 
 * @author Adán
 */

  import Funciones.primo0a1000;

  public class E15T8 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Primos de 0 a 1000: ");
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
    System.out.println("5");
    System.out.println("7");
    
    for (int i = 2; i <= 1000; i++) {
      if (Funciones.primo0a1000.primo1000(i)){
        System.out.println(i);
      }
    }
  }
}

    
    

