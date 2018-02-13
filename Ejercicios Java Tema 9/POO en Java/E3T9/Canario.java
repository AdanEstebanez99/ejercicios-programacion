/*Ejercicio 3 del tema 9: Definición de la clase Canario.
 * 
 * @author Adan
 */
package E3T9;

public class Canario extends Ave {
  public Canario() {}

  public Canario(Sexo s) {
    super(s);
  }

  public void canta() {
    System.out.println("Tralaralariiiiiiii");
  }

  public void caza() {
    System.out.println("Los canarios no cazan");
  }

  public void pia() {
    System.out.println("Pio pio pio");
  }
}
