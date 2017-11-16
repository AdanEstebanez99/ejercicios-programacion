/**
 * Ejercicio 41: Programa que dice cuantos digitos pares se han introducido en 
 * un numero y cuantos impares.
 * 
 * @author Adán
 */

  public class E41T5 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numeroBasura = numUs;
    int numeroDig = 0;
    while (numeroBasura > 0){
      numeroBasura /=10;
      numeroDig++;
    }
    int pares = 0;
    int impares = 0;
    for (int i = 0; i < numeroDig ; i ++){
      long cifra = numeroIntroducido % 10;
      if (cifra % 2 == 0){
        pares ++;
      } else {
        impares ++;
      }
      numeroIntroducido /= 10;
    }
    System.out.print("En el número "+numeroIntroducido+" hay "+pares+" cifras pares y "+impares+" cifras impares.");
  }
}
