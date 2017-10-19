/**
 * Ejercicio 13: Ordena tres numeros introducidos por teclado
 * 
 * @author Adán
 */

public class E13t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numero1 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Introduce otro numero:");
  int numero2 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Introduce otro numero:");
  int numero3 = Integer.parseInt( System.console().readLine());
  
  if ((numero1 > numero2) && (numero1 > numero3)) {
    System.out.println(numero1 + " es el mayor");
    
    if ((numero2 > numero3)) {
      System.out.println(numero2 + " es el segundo mayor y " + numero3 + " es el menor");
    }
    if ((numero3 > numero2))  {
      System.out.println(numero3 + " es el segundo mayor y " + numero2 + " es el menor");
    }
    }
    
  if ((numero2 > numero1) && (numero2 > numero3)) {
    System.out.println(numero2 + " es el mayor");
    
    if ((numero1 > numero3)) {
      System.out.println(numero1 + " es el segundo mayor y " + numero3 + " es el menor");
    }
    if ((numero3 > numero1)) {
      System.out.println(numero3 + " es el segundo mayor y " + numero1 + " es el menor");
    }
  }
    
  if ((numero3 > numero2) && (numero3 > numero1)) {
    System.out.println(numero3 + " es el mayor");
    
    if ((numero2 > numero1)) {
      System.out.println(numero2 + " es el segundo mayor y " + numero1 + " es el menor");
    }
    if ((numero1 > numero2)) {
      System.out.println(numero1 + " es el segundo mayor y " + numero2 + " es el menor");
    }
  }
  
  
  

  }
}
