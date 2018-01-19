/**
 * Funciones varias para los ejercicios del tema 8
 * 
 * @author Adán
 */

  package Funciones;
  public class Varias {
  
  //Numero primo:
  
    public static boolean esPrimo(int x) {
      for (int i = 2;i < x; i ++) {
        if ((x % i) == 0) {
          return false;
        }
      }
      return true;
    }
    
  //Numero capicua:
  
    public static boolean esCapicua(int x) {
      int numeroReves = 0;
      int numero = x;
      while (numero > 0) {
        numeroReves = (numeroReves * 10) + (numero % 10);
        numero /= 10;
      }
      if (numero == numeroReves){
          return true;
        }
     return false;
    }
    
    
}
