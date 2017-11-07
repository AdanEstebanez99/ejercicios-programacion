/**
 * Ejercicio 27: Programa que suma , muestra y cuenta los multiplos de 3 que hay
 * entre 1 y un numero que introduzcamos.
 * 
 * @author Adán
 */

public class E27T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce hasta el numero que quieres que se sumen los multiplos de 3");
  int numeroIntroducido= Integer.parseInt( System.console().readLine());
  int numero = 3;
  int suma = 0;
  int repeticiones = 0;
  int i = 0;
  for (i = 1 ; i <= numeroIntroducido ; i ++) {
    if (i % 3 == 0) {
      repeticiones ++;
      suma += i;
    }
    }
    System.out.println(repeticiones+" es el nº de numeros multiplos de 3 que se han cogido desde 1 hasta "+numeroIntroducido);
    System.out.println("Y el resultado de su suma es "+suma);
   }
  }

