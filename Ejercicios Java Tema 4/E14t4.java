/**
 * Ejercicio 14: te dice si un numero es impar y divisible entre 5
 * 
 * @author Adán
 */

public class E14t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numero = Integer.parseInt( System.console().readLine());
  int resto = numero % 2;
  int divisible5 = numero % 5;

  if ((resto != 0)) {
    System.out.println("Es Impar");
  }
  if ((divisible5 == 0)) {
    System.out.println("Es divisible entre 5");
  }
  
    
  
  
  

  }
}
