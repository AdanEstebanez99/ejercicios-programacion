/**
 * Ejercicio 18: Programa que segun 2 numeros introducidos por teclado te diga
 * los numeros que hay entre ellos en intervalos comprendidos de 7 en 7
 * 
 * @author Adán
 */

public class E18T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un número");
  int numero= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce otro numero");
  int numero1= Integer.parseInt( System.console().readLine());
  if ((numero < 0) || (numero1 < 0)) {
    System.out.println("Por favor introduzca un numero positivo");
  } else {
  if (numero > numero1) {
    do {
      int respuesta;
      respuesta = numero1 += 7;
      System.out.println(respuesta);
     } while (numero >= numero1);
   }
   if (numero1 > numero) {
    do {
      int respuesta;
      respuesta = numero += 7;
      System.out.println(respuesta);
     } while (numero1 >= numero);
   }
  }
 }
}
