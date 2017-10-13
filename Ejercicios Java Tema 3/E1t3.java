/**
 *Programa que te pide 2 numeros y muestra el resultado
 *de la multiplicación de ambos numeros
 * @author Adán
 */

public class E1t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero entero: ");
  int primerNumero = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce otro numero: ");
  int segundoNumero = Integer.parseInt( System.console().readLine());
  
  int total;
  total = primerNumero * segundoNumero;
  System.out.println(total + " Es el resultado de la multiplicación del primer y segundo numero");

  }
}
