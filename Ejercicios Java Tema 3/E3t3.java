/**
 *Conversor de pesetas a euros con entrada de numeros.
 * @author Adán
 */

public class E3t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero en pesetas: ");
  double pesetas = Integer.parseInt( System.console().readLine());
  
  double euros = ((int) pesetas * (double) 0.006);
  System.out.println(euros + " Son los euros que valen "+ pesetas +" pesetas");

  }
}
