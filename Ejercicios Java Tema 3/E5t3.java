/**
 * Calcula el área de un rectangulo.
 * @author Adán
 */

public class E5t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce el valor de la base de tu rectangulo: ");
  int base = Integer.parseInt( System.console().readLine());
  
  System.out.println("Introduce el valor de la altura de tu rectangulo: ");
  int altura = Integer.parseInt( System.console().readLine());
  
  int areatotal;
  areatotal = (base * altura);
  System.out.println(areatotal + " Es el area total de tu rectangulo");
  }
}
