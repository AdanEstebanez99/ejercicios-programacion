/**
 * Ejercicio 29: Programa que pide un numero por teclado y te muestra los 
 * numeros que no son divisibles entre otro introducido por teclado
 * 
 * @author Adán
 */

public class E29T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numero1= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce el numero por el que quieres dividir:");
  int numero2= Integer.parseInt( System.console().readLine());
  
  if ((numero1 < 0) || (numero2 < 0)) {
    System.out.println("Por favor introduce numeros positivos");
  } else {
  for (int i = 1 ; i <= numero1 ; i ++) {
      if (i % numero2 != 0) {
        System.out.println(i);
      }
     }
    }
   }
  }

