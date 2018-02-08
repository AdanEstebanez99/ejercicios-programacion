/*
 *Ejercicio 27 del tema 7: Juego del tres en raya. 
 *
 *
 * @author Adan
 */
package ejercicio27tema7;

import java.util.Scanner;

public class E27T7 {
    static final int fichaO = 1;
    static final int fichaX = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] tablero = new int[3][3];
        
        //Pintamos el Tablero:
        
        System.out.println("   0  1  2  ");
        System.out.println(" ┼-┼-┼-┤");
        for (int x = 0; x < 3; x ++) {
          System.out.print(x+"│");
          for (int y = 0; y < 3; y ++) {
              System.out.print(" "+"│");
          }
          System.out.println();
        }
        System.out.println(" ┴-┴-┴-┘");
        
        //Le Preguntamos al usuario que en que posicion quiere empezar:
        
        System.out.println("¿En que posicion deseas colocar la primera ficha?");
        System.out.println("Vas a ser la ficha con forma de X");
        System.out.println("Posicion de X:");
        int posiFichaXx = s.nextInt();
        System.out.println("Posicion de Y:");
        int posiFichaXy = s.nextInt();
        tablero [posiFichaXx][posiFichaXy] = fichaX;
        
        //Generamos la posicion aleatoria de la ficha O:
        
        int posiFichaOx = (int)(Math.random() * 3);
        int posiFichaOy = (int)(Math.random() * 3);
        tablero [posiFichaOx][posiFichaOy] = fichaO;
        
        
        
        System.out.println("   0  1  2  ");
        System.out.println(" ┼-┼-┼-┤");
        for (int x = 0; x < 3; x ++) {
          System.out.print(x+"│");
          for (int y = 0; y < 3; y ++) {
              if (tablero[posiFichaXx][posiFichaXy] == tablero[x][y]){
                  System.out.print("X"+"│");
              }else{
                  System.out.print(" "+"│");
              }
          }
          System.out.println();
        }
        System.out.println(" ┴-┴-┴-┘");
        
        
    } 
}
