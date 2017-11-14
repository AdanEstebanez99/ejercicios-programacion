/**
 * Ejercicio03Examen1: Programa que pinta un cuadrado con 2 asteriscos como borde según
 * el ancho que un usuario ha introducido por teclado.
 * 
 * @author Adán
 */

  public class Ejercicio03Examen1 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la anchura del cuadrado (minimo 5): ");    
    int ancho = Integer.parseInt(System.console().readLine());
    int altura = ancho;
    int i = 0;
    int espacios = 0;
    if (ancho >= 5) {
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
    System.out.println();
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
    for (i = 4 ; i < altura ; i ++){
      System.out.print("\n**");
      for (espacios = 4 ; espacios < ancho ;espacios ++){
        System.out.print(" ");
        }
      System.out.print("**");
    }
    System.out.println();
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
    System.out.println();
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
  } else {
    System.out.println("Introduce un numero MAYOR que 5");
  }
 }
}
    
    

