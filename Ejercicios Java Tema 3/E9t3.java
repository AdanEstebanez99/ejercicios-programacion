/**
 *Ejercicio 9: calcular el volumen de un cono
 * @author Adán
 */

public class E9t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el radio");
  int radio = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce la altura");
  int altura = Integer.parseInt( System.console().readLine());
  
  double volumen = ((double) 0.3333333 * (double) 3.14159) * ((double) radio * (double) radio) * ((double) altura);
  System.out.println(volumen + " Es el volumen de tu cono");

  }
}
