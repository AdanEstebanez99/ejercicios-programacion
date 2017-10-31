/**
 * Ejercicio 13: Programa que lee una lista de 10 numeros y te dice cuales son
 * negativos y cuales son positivos.
 * 
 * @author Adán
 */

public class E13T5 { // Clase principal
public static void main(String[] args) {
  int numero = 0;
  
  for (int i = 1; i <= 10 ; i = i + 1){
    System.out.println("Introduce un número:");
    numero = Integer.parseInt( System.console().readLine());
     if (numero < 0) {
       System.out.println("El numero introducido es negativo");
    }
     if (numero >= 0) {
       System.out.println("El numero introducido es positivo");
    }
    
   }
   
  }
}
