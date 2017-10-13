/**
 * Calcula el area de un triangulo.
 * @author Adán
 */

public class E6t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce el valor de la base de tu triangulo en cm: ");
  int base = Integer.parseInt( System.console().readLine());
  
  System.out.println("Introduce el valor de la altura de tu triangulo en cm: ");
  int altura = Integer.parseInt( System.console().readLine());
  
  int multiplicacion;
  multiplicacion = (base * altura);
  
  int areatotal;
  areatotal = (multiplicacion / 2);
  System.out.println(areatotal + " cm Es el area total de tu triangulo");
  }
}
