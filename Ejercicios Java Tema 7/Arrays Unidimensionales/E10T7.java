/**
 * Ejercicio 10: Programa que genera 20 numeros aleatorios entre 0 y 100 y que
 * te muestra los numeros pares primero y los impares despues.
 * 
 * @author Adán
 */

  public class E10T7 { // Clase principal
  public static void main(String[] args) {
    
    //Generar 20 numeros entre 0 y 100.
    
    int[] n = new int[20];
    int numero;
    System.out.println("Generación de numeros aleatorios desordenados:");
    System.out.println();
  
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 101);
      n[i] = numero;
      System.out.print(numero + " ");
    }
      System.out.println();
      System.out.println();
      
    //Identificamos los pares y los almacenamos en un Array.
    //Creamos la variable posicion para empezar a ordenarlos.
    
      int[] aux = new int[20];
      int posicion = 0;
  
      for (int i = 0; i < 20; i++) {
    
        if (n[i] % 2 == 0) {
          aux[posicion] = n[i];
          posicion++;
        }
      }
      
    //Repetimos lo anterior pero con los impares.
    //ordenamos estos a partir de el fin de los anteriores.
    
      for (int i = 0; i < 20; i++) {
    
        if (n[i] % 2 != 0) {
          aux[posicion] = n[i];
          posicion++;
        }
      }
      
    //Ahora los pasamos del Array auxisiliar al inicial y listo.
    
      System.out.println("Con los pares primero quedaría así: ");
      System.out.println();
  
      for (int i = 0; i < 20; i++) {
        n[i] = aux[i];
        System.out.print(n[i] + " ");
      }
    }
  }


    
