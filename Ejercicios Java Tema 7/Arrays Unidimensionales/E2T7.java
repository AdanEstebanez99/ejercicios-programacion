/**
 * Ejercicio 2: Programa que establece 10 valores de numeros segun una tabla:
 * 
 * 
 * @author Adán
 */

  public class E2T7 { // Clase principal
  public static void main(String[] args) {
    char [] simbolo;
    simbolo = new char[10];
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    for (int i = 0 ; i < 10 ; i ++) {
      System.out.print(simbolo[i]+", ");
    }
    System.out.println();
    System.out.println("Los elementos que no han sido inicializados no se muestran");
  }
}


    
