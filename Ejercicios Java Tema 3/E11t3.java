/**
 *Ejercicio 11 convertidor de Kb a Mb
 * @author Adán
 */

public class E11t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero en Kb");
  int Kb = Integer.parseInt( System.console().readLine());
  
  double Mb = ((double) Kb / (double) 1024);
  System.out.println(Mb + " Son los Mb que valen " + Kb + " Kb");
  
}
}
