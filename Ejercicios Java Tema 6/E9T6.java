/**
 * Ejercicio 9: Programa que genera 100 numeros aleatorios y cuando se genere 
 * el 24 para y te dice cuantos numeros se han generado.
 * @author Adán
 */

  public class E9T6 { // Clase principal
  public static void main(String[] args) {
    
    int contador = 0;
    int numAleatorio = 0;
    
    do {
      numAleatorio = (int)(Math.random()*101);
      System.out.print(" "+numAleatorio+" ");
      contador ++;
    } while (numAleatorio != 24);
    
    System.out.println();
    
    if (numAleatorio == 24) {
      System.out.println("Se han generado "+contador+" numeros aleatorios");
      System.out.println("Hasta que se ha generado el numero 24");
    }
  }
}
