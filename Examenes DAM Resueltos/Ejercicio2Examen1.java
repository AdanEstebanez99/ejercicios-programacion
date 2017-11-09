/**
 * Ejercicio2Examen1: TiendaBanderadeEspaña.es
 * 
 * 
 * @author Adán
 */

public class Ejercicio2Examen1 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce la altura de la bandera en cm:");
  int altura = Integer.parseInt( System.console().readLine());
  System.out.println("Introduce la anchura de la bandera en cm:");
  int anchura = Integer.parseInt( System.console().readLine());
  System.out.println("¿Quiere el escudo bordado?: s/n");
  String respuesta = (System.console().readLine().toLowerCase());
  double total = 0;
  int cmCuadrado = anchura * altura;
  double precioEuros = cmCuadrado * 0.01;
  if (respuesta.equals ("s")) {
    total = precioEuros + 2.50 + 3.25;
    System.out.println(cmCuadrado+" Es la superficie de la bandera en cm cuadrados");
    System.out.println(precioEuros+" Es el precio de la superficie de la bander");
    System.out.println("2.50 Es el precio del escudo");
    System.out.println("3.25 Es el precio de los gastos de envio");
    System.out.println(total+" Es el precio total");
  }
  if (respuesta.equals ("n")) {
    total = precioEuros + 3.25;
    System.out.println(cmCuadrado+" Es la superficie de la bandera en cm cuadrados");
    System.out.println(precioEuros+" Es el precio de la superficie de la bander");
    System.out.println("3.25 Es el precio de los gastos de envio");
    System.out.println(total+" Es el precio total");
  }
  }
}
