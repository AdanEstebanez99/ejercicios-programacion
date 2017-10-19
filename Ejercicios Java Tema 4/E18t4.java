/**
 * Ejercicio 18: Programa que te dice el primer numero de hasta 5 digitos.
 * 
 * @author Adán
 */

public class E18t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un numero cualquiera:");
  int numero = Integer.parseInt (System.console().readLine());
  
  int primerDigito = 0;
  
  if (numero < 10) {
    primerDigito = numero;
   }
  if ((numero >= 10) && (numero < 100)) {
    primerDigito = numero / 10;
   }
  if ((numero >= 100) && (numero < 1000)) {
    primerDigito = numero / 100;
   }
  if ((numero >= 1000) && (numero < 10000)) {
    primerDigito = numero / 1000;
   }
  if (numero >= 10000) {
    primerDigito = numero / 10000;
  }
  System.out.println(primerDigito + " Es el primer digito del numero " + numero);
  
  
  
  
  

  }
}
