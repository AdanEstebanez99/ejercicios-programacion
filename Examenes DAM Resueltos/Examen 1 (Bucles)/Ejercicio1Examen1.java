/**
 * Ejercicio1Examen1: Programa que va pidiendo numeros por teclado hasta que se introduce 
 * un numero primo y entonces te muestra la media el mayor y el menor de los
 * numeros
 * @author Adán
 */

public class Ejercicio1Examen1 { // Clase principal
public static void main(String[] args) {
  int numero = 0;
  boolean primo = true;
  int mayor = 0;
  int menor = 9999;
  int suma = 0;
  int contador = 0;
    
  do {
    System.out.println("Introduce números:");
    System.out.println("Para parar introduce un numero primo");
    numero = Integer.parseInt(System.console().readLine());
    primo = true;
      
    for ( int i = 2; i < numero; i ++) {
    if (numero % i == 0) {
        primo = false;
        }
      }
      
    if ((numero >= 0) && (!primo)) {
        suma += numero;
        contador ++;
        if (numero > mayor) {
          mayor = numero;
            }
        if (numero < menor) {
          menor = numero;
            }
        }
      
        } while (!primo);
      
        if (primo && (contador > 0)) {
        
        int media = suma /contador;
        System.out.println("Has introducido "+contador+" numeros no primos");
        System.out.println("El mayor numero es: "+mayor);
        System.out.println("El menor numero es: "+menor);
        System.out.println("La media es: "+media);
        } else {
        System.out.println("Introduce un numero que NO sea primo");
        }
  }
}





