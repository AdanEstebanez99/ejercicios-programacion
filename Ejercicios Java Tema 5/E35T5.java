/**
 * Ejercicio 35: Programa que dibuja una X de una altura introducida por teclado
 * hueca.
 * 
 * @author Adán
 */

public class E35T5 { // Clase principal
public static void main(String[] args) {
  System.out.print("Introduce la altura de la X (numero impar igual o mayor que 3): ");    
    int altura = Integer.parseInt(System.console().readLine());
    int i = 0;
    int j = 0;
    for(i = 1; i <= altura ; i++){
      for(j = 1; j <= altura; j++){
        if((i == j) || (j == ((altura - i)+1))){
        System.out.print("*");
        }else{
          System.out.print(" ");
          }
      }
      System.out.println();
    }
  }
}
 

    
    

