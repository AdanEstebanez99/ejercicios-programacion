/**
 * Ejercicio 5: Programa que a partir de 10 numeros introducidos por el usuario
 * al lado del mayor y del menor pone "maximo" o "minimo" respectivamente.
 * 
 * @author Adán
 */

  public class E5T7 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Introduce 10 numeros:");
    System.out.println();
    int numMayor = 0;
    int numMenor = 100000;
    int [] numero;
    numero = new int[10];
    for (int i = 0 ; i <= 9 ; i ++) {
      numero[i] = Integer.parseInt(System.console().readLine());
      if (numero[i] > numMayor) {
        numMayor = numero[i];
      } 
      else if (numero[i] < numMenor){
        numMenor = numero[i];
      }
    }
    System.out.println();
    for (int i = 0 ; i < 10 ; i ++) {
      System.out.println(numero[i]);
      if (numMayor == numero[i]) {
        System.out.println("Mayor");
      }
      else if (numMenor == numero[i]) {
        System.out.println("Menor");
      }
    }
  }
}


    
