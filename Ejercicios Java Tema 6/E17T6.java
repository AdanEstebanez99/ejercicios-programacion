/**
 * Ejercicio 17: Programa que pinta una pecera con un pez aleatorio dentro de ella.
 * 
 * 
 * @author Adán
 */

  public class E17T6 { // Clase principal
  public static void main(String[] args) {
    System.out.print("Introduce la altura(como mínimo 4): ");
    int h = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduce el anchura (como mínimo 4): ");
    int w = Integer.parseInt(System.console().readLine());
    int x = (int)((Math.random()*(w-1))+1);
    System.out.println(x);
    int y = (int)((Math.random()*(h-1))+1);
    System.out.println(y);
    
    for (int ver = 0; ver < h; ver++){
      
      for (int hor = 0; hor < w; hor++){
        
        if ((hor == 0) || (hor == w-1) || (ver == 0) || (ver == h-1)){
          System.out.print("* ");
        } else if ((hor == x) && (ver == y)){
          System.out.print("&&");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }
}
