/**
 * Ejercicio 19: Programa que pinta una piramide hueca y tienes que introducirle
 * la altura y los caracteres.
 * 
 * @author Adán
 */

public class E19T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce la altura de la piramide:");
  int alturaIntroducida= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce el caracter con el que quieres pintar la piramide:");
  String pintar = System.console().readLine();
  
  int altura = 1;
  int espacio = alturaIntroducida - 1;
  
  while (altura <= alturaIntroducida){
    
    for (int i = 1; i <= espacio; i++) {
      System.out.print(" ");
   }
    
    for (int i = 1 ; i <= (altura * 2) - 1; i++) {
      System.out.print(pintar);
  
  }
  System.out.println();
  altura++;
  espacio--;
  }
 }
 }

