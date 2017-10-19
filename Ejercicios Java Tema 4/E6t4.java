/**
 * Ejercicio 6: Calcula el tiempo que tarda en caer un objeto desde x altura
 * 
 * @author Adán
 */

public class E6t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce la Altura");
  double altura = Integer.parseInt( System.console().readLine());
  double tiempo = (Math.sqrt(altura * 2 / 9.81));
  System.out.println(tiempo + " Es el tiempo en m/s que tarda en caer un objeto a " + altura + " metros de altura");

  }
}
