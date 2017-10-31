/**
 * Ejercicio 14: Programa que pide un exponente y una base y te calcula el
 * resultado (solo se pueden introducir numeros positivos).
 * 
 * @author Adán
 */

public class E14T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce el exponente");
  int exponente= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce la base");
  int base= Integer.parseInt( System.console().readLine());
  int potencia = 1;
  if (exponente == 0) {
    System.out.println ("El resultado va a ser 1");
   }
  if (exponente > 0) {
    for (int i = 0; i < exponente; i++){
      potencia = base * potencia;
    }
  }
  System.out.println("El resultado de la potencia es: "+potencia);
  }
}
