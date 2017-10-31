/**
 * Ejercicio 17: Programa que suma los 100 numeros siguientes a uno introducido
 * por teclado.
 * 
 * @author Adán
 */

public class E17T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un número");
  int numero= Integer.parseInt( System.console().readLine());
  int numero1 = numero;
  if (numero < 0) {
    System.out.println("Por favor introduzca un numero positivo");
  } else {
  
  for (int i = 1; i <= 99; i++) {
    int sumaNumero = numero ++;
    numero = sumaNumero + numero1 + i;
    
    System.out.println(numero);
   }
  }
 }
}
