/**
 * Funciones varias para los ejercicios del tema 8
 * 
 * @author Adán
 */

  package Funciones;
  public class primo0a1000 {
  
  //Numero primo:
    public static boolean primo1000(int x) {
        if ((x % 2 == 0) || (x % 3 == 0) || (x % 5 == 0) || (x % 7 == 0)) {
          return false;
        }
      return true;
    }
  }
