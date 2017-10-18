/**
 * Ejercicio 5: Programa que resuelve una ecuación de primer grado
 * 
 * @author Adán
 */

public class E5t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el valor de la variable a");
  int variableA = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce el valor de la variable b");
  int variableB = Integer.parseInt( System.console().readLine());
  
  int valorX;
  valorX = ((variableB - variableB - variableB) / variableA);
  System.out.println(valorX + " Es lo que tiene que valer X para que ax - b = 0");

  }
}
