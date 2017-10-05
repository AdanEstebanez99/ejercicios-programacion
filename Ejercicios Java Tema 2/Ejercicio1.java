/**
 * Muestra por pantalla la suma, resta, multiplicación y división de 
 * los valores "x" e "y".
 * @author Adán
 */

public class Ejercicio1 { // Clase principal
  public static void main(String[] args) {
  double x = 144;
  double y = 999;
  double Division;
  Division = (double)x / (double)y;
  System.out.println ( x + " Es lo que vale la variable x");
  System.out.println ( y + " Es lo que vale la variable y");
  System.out.println (x * y + " Es el resultado de 144 x 999");
  System.out.println (x + y + " Es el resultado de 144 + 999");
  System.out.println (x - y + " Es el resultado de 144 - 999");
  System.out.println (Division + " Es el resultado de 144 / 999");

  }
}
