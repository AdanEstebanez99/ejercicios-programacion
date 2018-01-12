/**
 * Ejercicio02Examen01: Programa que genere un array de 20 numeros aleatorios
 * entre 1 y 10 y que se muestren por pantalla, despues debera mostrarte el
 * numero de veces que se repite cada numero.
 * 
 * @author Adán
 */

  public class Ejercicio02Examen01 { // Clase principal
  public static void main(String[] args) {
    
    int[] numeros = new int[20];
    int generado;
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    int contador6 = 0;
    int contador7 = 0;
    int contador8 = 0;
    int contador9 = 0;
    int contador10 = 0;
    System.out.println("Generación de numeros aleatorios desordenados:");
    System.out.println();
  
    for (int i = 0; i < 20; i++) {
      generado = (int)(Math.random()*10) + 1;
      numeros[i] = generado;
      System.out.print(generado + " ");
    }
      System.out.println();
      System.out.println();
      System.out.println("Numero de veces que se repite cada numero:");
      System.out.println();
      
    for (int i = 0; i < 20; i++) {
    
      if (numeros[i] == 1) {
        contador1 ++;
      }
      if (numeros[i] == 2) {
        contador2 ++;
      }
      if (numeros[i] == 3) {
        contador3 ++;
      }
      if (numeros[i] == 4) {
        contador4 ++;
      }
      if (numeros[i] == 5) {
        contador5 ++;
      }
      if (numeros[i] == 6) {
        contador6 ++;
      }
      if (numeros[i] == 7) {
        contador7 ++;
      }
      if (numeros[i] == 8) {
        contador8 ++;
      }
      if (numeros[i] == 9) {
        contador9 ++;
      }
      if (numeros[i] == 10) {
        contador10 ++;
      }
    }
      System.out.println("El numero 1 se repite: "+contador1+" veces");
      System.out.println("El numero 2 se repite: "+contador2+" veces");
      System.out.println("El numero 3 se repite: "+contador3+" veces");
      System.out.println("El numero 4 se repite: "+contador4+" veces");
      System.out.println("El numero 5 se repite: "+contador5+" veces");
      System.out.println("El numero 6 se repite: "+contador6+" veces");
      System.out.println("El numero 7 se repite: "+contador7+" veces");
      System.out.println("El numero 8 se repite: "+contador8+" veces");
      System.out.println("El numero 9 se repite: "+contador9+" veces");
      System.out.println("El numero 10 se repite: "+contador10+" veces");
  }
}
