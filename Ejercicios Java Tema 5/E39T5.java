/**
 * Ejercicio 39: Programa que muestra los numeros desde el 1 hasta uno 
 * introducido por teclado incluido su numero factorial.
 * 
 * @author Adán
 */

public class E39T5 { // Clase principal
public static void main(String[] args) {
    System.out.println("Programa que calcula el factorial hasta el numero introducido por teclado");
    System.out.println("Introduce un numero:");
    int numero = Integer.parseInt( System.console().readLine());
    
    for(int i = 1; i <= numero; i ++){
      int factorial = n;
      for (int j = 1 ; j < n ; j ++) {
          factorial *= j;
        }
    System.out.println("El factorial de " + n + " es " + factorial);
    }
  }
}
