/**
 * Ejercicio 38: Programa que dibuja un reloj de arena relleno, también se debe 
 * comprobar que el numero introducido sea impar y mayor que tres.
 * 
 * @author Adán
 */

public class E38T5 { // Clase principal
public static void main(String[] args) {
    System.out.print("Introduce la altura: ");    
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int asteriscos = alturaIntroducida;
    int espacios = 0;
    int i = 0;
    while(altura < (alturaIntroducida / 2 + 1)){
      for(i = 1 ; i <= espacios ; i ++){
        System.out.print(" ");
      }
      for(i = 0 ; i <= asteriscos ; i ++){
        System.out.print("*");
      }
      System.out.println();
      altura ++;
      espacios ++;
      asteriscos -= 2;
    }
    espacios = alturaIntroducida / 2;
    altura = 1;
    while(altura <= (alturaIntroducida / 2 + 1 )){
    
      for(i = 1 ; i <= espacios; i ++){
        System.out.print(" ");
      }
      for(i = 0 ; i <= asteriscos; i ++){
        System.out.print("*");
      }
      
      System.out.println();
      altura ++;
      espacios --;
      asteriscos += 2;
    }
  }
}
