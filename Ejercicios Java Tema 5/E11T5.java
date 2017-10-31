/**
 * Ejercicio 11: calcular el cuadrado y el cubo a partir de los 5 primeros numeros
 * a partir de un numero introducido por teclado.
 * 
 * @author Adán
 */

public class E11T5 { // Clase principal
public static void main(String[] args) {
  int numero = 0;
  int cuadrado = 0;
  int cubo = 0;
  System.out.println("Introduce un numero:");
  numero = Integer.parseInt( System.console().readLine());
    System.out.println("  Numero    Cuadrado    Cubo  ");
  
  for (int i = 1; i <= 5 ; i = i + 1){
    numero ++;
    cuadrado = (numero * numero);
    cubo = (numero * numero * numero);
    System.out.println("    "+numero+"        "+cuadrado+"       "+cubo+"  ");
    
   }
   
  }
}
