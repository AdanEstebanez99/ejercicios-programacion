/**
 * Ejercicio 11: calcular el cuadrado y el cubo a partir de los 5 primeros numeros
 * a partir de un numero introducido por teclado.
 * 
 * @author Adán
 */

public class E11T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int contador = 0;
  int numero = 0;
  int suma = 0;
  
  for (int i = 1; i <= 5 ; i = i + 1){
    numero = Integer.parseInt( System.console().readLine());
    numero ++;
    System.out.println(numero +"   "+i);
    
   }
   
  }
}
