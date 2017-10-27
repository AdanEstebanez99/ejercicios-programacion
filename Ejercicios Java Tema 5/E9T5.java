/**
 * Ejercicio 9: Programa que dice cuantos digitos tiene un numero introducido
 * por teclado.
 * @author Adán
 */

public class E9T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero para decirte cuantos digitos tiene");
    int numero = Integer.parseInt( System.console().readLine());
    int contador = 1;
  while (numero > 10) {
    numero /= 10;
    contador ++;
  }
  System.out.println("Tu numero tiene "+contador+" digitos");
  }
}
