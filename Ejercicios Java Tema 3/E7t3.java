/**
 *Ejercicio 7: calcular el valor de una factura.
 * @author Adán
 */

public class E7t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el precio de una factura en euros");
  double precio = Integer.parseInt( System.console().readLine());
  
  double siniva = ((double) precio * (double) 0.21); //calcula el precio sin iva del producto
  double iva = ((double) precio - (double) siniva);  //calcula el precio del iva del producto
  System.out.println(siniva + " Es lo que vale el iva de tu factura, "+ iva +" Es lo que vale tu factura sin iva");

  }
}
