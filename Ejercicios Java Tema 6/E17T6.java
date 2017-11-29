/**
 * Ejercicio 17: Programa que pinta una pecera con un pez aleatorio dentro
 * 
 * 
 * @author Adán
 */

  public class E17T6 { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura (minimo 4):");    
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el ancho (minimo 4):");    
    int ancho = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int espacios = 0;
    int posicionPez = 0;
    int posicion = (int)Math.random();
    
    for (i = 1 ; i <= ancho ; i ++){
      System.out.print("*");
    }
    
    for(i = 2 ; i < altura ; i ++){
      System.out.print("\n*");
      
      for (espacios = 2 ; espacios < ancho ; espacios ++){

       if (posicion == posicionPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
        }
      System.out.print("*");
    }
    System.out.println();
    
    for (i = 1 ; i <= ancho; i ++){
      System.out.print("*");
    }
  }
}
