/**
 *Conversor de euros a pesetas con entrada de numero.
 * @author Adán
 */

public class E2t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero en euros: ");
  double euros = Integer.parseInt( System.console().readLine());
  
  double pesetas = ((int) euros * (int) 166.386);
  System.out.println(pesetas + " Son las pesetas que valen "+ euros +" euros");

  }
}
