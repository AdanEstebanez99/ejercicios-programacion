/**
 * Ejercicio 3: Programa que muestra en orden inverso 10 numeros introducidos
 * por el usuario.
 * 
 * @author Adán
 */

  public class E3T7 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Introduce 10 numeros:");
    System.out.println();
    int [] numero;
    numero = new int[10];
    numero[0] = Integer.parseInt(System.console().readLine());
    numero[1] = Integer.parseInt(System.console().readLine());
    numero[2] = Integer.parseInt(System.console().readLine());
    numero[3] = Integer.parseInt(System.console().readLine());
    numero[4] = Integer.parseInt(System.console().readLine());
    numero[5] = Integer.parseInt(System.console().readLine());
    numero[6] = Integer.parseInt(System.console().readLine());
    numero[7] = Integer.parseInt(System.console().readLine());
    numero[8] = Integer.parseInt(System.console().readLine());
    numero[9] = Integer.parseInt(System.console().readLine());
    
    for (int i = 9 ; i >= 0 ; i --) {
      System.out.println();
      System.out.print(numero[i]);
    }
  }
}


    
