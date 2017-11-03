/**
 * Ejercicio 23: Programa que permite ir introduciendo numeros siempre que su
 * suma no supere 1000 y te muestra la media de ellos y un contador de numeros. 
 * 
 * @author Adán
 */

public class E23T5 { // Clase principal
public static void main(String[] args) {
  double contador = 0;
  double suma = 0;
  double numero = 0;
    do {
      System.out.println("Introduce un numero:");
      numero = Double.parseDouble( System.console().readLine());
      suma += numero;
      contador ++;
      } while (suma <= 10000);
      System.out.println("La suma total es "+suma);
      System.out.println("La media total es "+(suma / contador));
      System.out.println("Has introducido "+contador+" numeros");
  
   }
  }

