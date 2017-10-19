/**
 * Ejercicio 17: Programa que te dice el último dígito de un numero.
 * 
 * @author Adán
 */

public class E17t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un numero cualquiera:");
  int numero = Integer.parseInt (System.console().readLine());
  
  int ultimoDigito = numero - ((numero / 10) * 10);
  
  System.out.println(ultimoDigito + " Es el último dígito");
  
  
  
  
  

  }
}
