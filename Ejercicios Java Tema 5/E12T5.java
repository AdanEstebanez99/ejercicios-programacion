/**
 *  Ejercicio 12: Serie de Fibonacci
 * 
 * @author Adán
 */

public class E12T5 { // Clase principal
  public static void main(String[] args) {
  System.out.print("Introduce un número ");
    int cifras = Integer.parseInt(System.console().readLine());
    int numero1 = 0;
    int numero2 = 1;
    int fibonaci = 0;
    System.out.print("Las primeras "+cifras+" de la serie de Fibonacci son: "+ numero1+" "+numero2+ " ");
    for (int i = 0; i < cifras; i++){
      fibonaci = numero1 + numero2;
      System.out.print(" "+fibonaci+" ");
      numero1 = numero2;
      numero2 = fibonaci;
}
  }
}
