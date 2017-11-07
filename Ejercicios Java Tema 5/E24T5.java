/**
 * Ejercicio 24: Programa que dibuja una piramide formada por n numeros y
 * y con una fila de n numeros.
 * 
 * @author Adán
 */

public class E24T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce la altura de la piramide:");
  int alturaIntroducida= Integer.parseInt( System.console().readLine());
  int altura = 1;
  int espacio = alturaIntroducida - 1;
  
  while (altura <= alturaIntroducida){
    
    for (int i = 1; i <= espacio; i++) {
      System.out.print(" ");
   }
    
    for (int i = 1 ; i <= altura - 1; i++) {
      System.out.print(i);
  
  }
    for (int i = altura ; i > 0 ; i--) {
      System.out.print(i);
    }
  System.out.println();
  altura++;
  espacio--;
  }
   }
  }

