/**
 *Ejercicio 10 convertidor de Mb a Kb
 * @author Adán
 */

public class E10t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero en Mb");
  int Mb = Integer.parseInt( System.console().readLine());
  
  double Kb = ((double) Mb * (double) 1024);
  System.out.println(Kb + " Son los Kb que valen " + Mb + " Mb");

  }
}
