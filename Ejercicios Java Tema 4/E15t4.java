/**
 * Ejercicio 15: Programa que hace una piramide en la dirección que le digas.
 * 
 * @author Adán
 */

public class E15t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce hacia donde quieres que mire la piramide");
  System.out.println("(Derecha, Izquierda, Arriba, Abajo)");
  String respuesta = System.console().readLine(). toLowerCase();
  
  if (respuesta.equals("derecha")) {
    System.out.println("*    ");
    System.out.println("**   ");
    System.out.println("***  ");
    System.out.println("**** ");
    System.out.println("*****");
    System.out.println("**** ");
    System.out.println("***  ");
    System.out.println("**   ");
    System.out.println("*    ");
  }
  if (respuesta.equals("izquierda")) {
    System.out.println("    *");
    System.out.println("   **");
    System.out.println("  ***");
    System.out.println(" ****");
    System.out.println("*****");
    System.out.println(" ****");
    System.out.println("  ***");
    System.out.println("   **");
    System.out.println("    *");
  }
  if (respuesta.equals("arriba")) {
    System.out.println("    *    ");
    System.out.println("   ***   ");
    System.out.println("  *****  ");
    System.out.println(" ******* ");
    System.out.println("*********");
  }
  if (respuesta.equals("abajo")) {
    System.out.println("*********");
    System.out.println(" ******* ");
    System.out.println("  *****  ");
    System.out.println("   ***   ");
    System.out.println("    *    ");
    
  }
  
  
    
  
  
  

  }
}
