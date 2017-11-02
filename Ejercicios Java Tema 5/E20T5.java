/**
 * Ejercicio 20: Programa que pinta una piramide hueca y tienes que introducirle
 * la altura y los caracteres.
 * 
 * @author Adán
 */

public class E20T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce la altura de la piramide:");
  int alturaIntroducida= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce el caracter con el que quieres pintar la piramide:");
  String pintar = System.console().readLine();
  
  int altura = 1;
  int espacio = alturaIntroducida - 1;
  int hueco = 0;
  
  while (altura <= alturaIntroducida - 1){
    
    for (int i = 1; i <= espacio; i++) {
      System.out.print(" ");
    }
      System.out.print(pintar);
    
    for (int i = 1 ; i < hueco; i++) {
      System.out.print(" ");
    }
    if (altura > 1){
        System.out.print(pintar);
      }
  System.out.println();
  altura++;
  espacio--;
  hueco += 2;
  }
  for (int i = 1 ; i <= (altura * 2) - 1; i++) {
      System.out.print(pintar);
    }
 }
 }

