/**
 * Ejercicio 22: Programa que muestra todos los numeros primos entre 2 y 100
 * ambos incluidos.
 * 
 * @author Adán
 */

public class E22T5 { // Clase principal
public static void main(String[] args) {
  boolean primo = true;
  for (int numero = 2 ; numero <= 100 ; numero ++){
    primo = true;
    for (int i = 2 ; i < numero ; i ++) {
    
      if (numero % i == 0) {
        primo = false;
      } 
     }
      if (primo) {
        System.out.println(numero+" es un numero primo");
        }
    }
   }
  }

