/**
 *Ejercicio 19: Decir el numero de cifras que tiene un numero entero.
 * @author Adán
 */

public class E19T4 { // Clase principal
  public static void main(String[] args) {
    System.out.print("introduce un número entero de 5 cifras como máximo: ");
    int num = Integer.parseInt(System.console().readLine());
    if (num > 100000){
      System.out.print("La cifra debe tener como máximo 5 cifras.");
    } else {
      int contador = 1;
      num = num/10;
    if (num < 10){
        contador++;
        System.out.print("El número tiene " + contador + " cifras.");
    } else {
        contador++;
        num = num/10;
    if (num < 10){
          contador++;
          System.out.print("El número tiene " + contador + " cifras.");
    } else {
          contador++;
          num = num/10;
    if (num < 10){
            contador++;
            System.out.print("El número tiene " + contador + " cifras.");
    } else {
            contador++;
            num = num/10;
    if (num < 10){
              contador++;
              System.out.print("El número tiene " + contador + " cifras.");
    } else {
            contador++;
              num = num/10;
              System.out.print("El número tiene " + contador + " cifras.");
        }
        }
        }
    }
    }
  }
}
    
