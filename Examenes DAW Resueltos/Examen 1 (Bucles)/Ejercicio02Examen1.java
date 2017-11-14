/**
 * Ejercicio02Examen1: Programa que te pide 10 numeros por teclado y te hace la media de 
 * los numeros primos introducidos y si no se introduce ninguno te dice que no 
 * puede hacerte la media.
 * @author Adán
 */

  public class Ejercicio02Examen1 { // Clase principal
  public static void main(String[] args) {
    int numero = 0;
    int contador = 0;
    double sumaPrimo = 0;
    double media = 0;
    System.out.println("Introduce 10 números enteros positivos:");
  
    for (int i = 1; i <= 10 ; i ++){
      numero = Integer.parseInt( System.console().readLine());
      boolean primo = true;
      for (int j = 2; j < numero; j++) {
        if (numero % j == 0) {
        primo = false;
        }
      }
      if (primo) {
        contador ++;
        sumaPrimo += numero;
      }
    }
      media = sumaPrimo / contador;
      if (contador == 0) {
        System.out.println("No has introducido ningun numero primo, no puedo hacerte la media");
      }
      if (contador > 0) {
        System.out.println("Has introducido "+contador+" numeros primos");
        System.out.println("La media de los numeros primos introducidos es: "+media);
      }
  }
}


