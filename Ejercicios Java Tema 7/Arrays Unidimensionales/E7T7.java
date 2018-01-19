/**
 * Ejercicio 7: Programa que genera 100 numeros aleatorios y a partir de dos 
 * numeros instroducidos cambien las ocurrencias.
 * 
 * 
 * @author Adán
 */

  public class E7T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[100];
    int numero;
  
      for (int i = 0; i < 100; i++) {
    
      numero = (int)(Math.random() * 21);
    
      System.out.print(numero + " ");
      n[i] = numero;
    }

    System.out.println();
  
    System.out.print("Introduce algún número de los que aparezcan: ");
    int primero = Integer.parseInt(System.console().readLine());
  
    System.out.print("Cada número anterior se cambiará por el que pongas ahora: ");
    int segundo = Integer.parseInt(System.console().readLine());
  
  for (int i = 0; i < 100; i++) {
    
    if (n[i] == primero) {
      System.out.print("\033[33m'" + segundo + "'" + " ");
    } else {
      System.out.print("\033[37m" + n[i] + " ");
      }
    }
  } 
}


    
