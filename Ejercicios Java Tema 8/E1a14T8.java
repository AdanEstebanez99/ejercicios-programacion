/**
 * Ejercicios Tema 8: A continuación estaran los ejercicios del 1 al 14 del tema
 * de funciones de java.
 * 
 * @author Adán
 */

  import Funciones.Varias;

  public class E1a14T8 { // Clase principal
  public static void main(String[] args) {
    
    int numero;
    
    //Ejercicio 1:Decir si un numero es o no Capicua.
    
    System.out.println("Introduzca un numero entero positivo: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (Funciones.Varias.esCapicua(numero)) {
      System.out.println("El numero "+numero+" es capicua");
    } else {
      System.out.println("El numero "+numero+" no es capicua");
    }
    
    
    
    //Ejercicio 2:Decir si un numero es o no primo.
    
    System.out.println("Introduzca un numero entero positivo: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (Funciones.Varias.esPrimo(numero)) {
      System.out.println("El numero "+numero+" es primo");
    } else {
      System.out.println("El numero "+numero+" no es primo");
    }
  }
}

    
    

