/**
 * Ejercicio 16 Tema 8: Programa que muestra por pantalla todos los numeros
 * capicuos entre 0 y 9999.
 * 
 * @author Adán
 */

  import Funciones.capicua0a9999;

  public class E16T8 { // Clase principal
  public static void main(String[] args) {
    int volteado = 0;
    int i = 0;
    int numero = 0;
    
    System.out.println("capicuas de 0 a 9999: ");
    
    for (i = 0; i <= 9999; i++) {
      volteado = Funciones.Varias.voltea(i);
      numero = i;
      
      if (Funciones.capicua0a9999.capicua9999(numero , volteado)){
        System.out.println(numero);
      }
     }
    }
  }


    
    

