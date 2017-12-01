/**
 * Ejercicio 1: Programa que establece 12 valores de numeros segun una tabla:
 * 
 * 
 * @author Adán
 */

  public class E1T7 { // Clase principal
  public static void main(String[] args) {
    int [] num;
    num = new int [12];
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    System.out.print(num[0]+", "+num[1]+", "+num[2]+", "+num[3]+", "+num[4]+", ");
    System.out.print(num[5]+", "+num[6]+", "+num[7]+", "+num[8]+", "+num[9]+", ");
    System.out.print(num[10]+", "+num[11]);
    System.out.println("Los elementos que no han sido inicializados se muestran con un 0");
  }
}


    
