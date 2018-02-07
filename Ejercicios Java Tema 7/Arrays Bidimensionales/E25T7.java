/*
 *Ejercicio 25 del tema 7: Ejercicio de la ficha del Alfil del Ajedrez 
 *
 * @author Adan
 */
package ejercicio25tema7;

import java.util.Scanner;

public class E25T7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        final String AZUL = "\033[46m";
        final String AMARILLO = "\033[43m";
        final String RESET = "\033[0m";
        String[][] tablero = new String[10][10];
        int[][] colores = new int[10][10];
        String casilla = "   ";
        String movimiento = "\033[30m" + " * ";
        int casillasPosibles = 0;

        // Dibujamos el tablero de ajedrez:
        
        System.out.print("   a  b  c  d  e  f  g  h \n");
        
        for (int a = 8; a >= 1; a--) {
            System.out.print(a + " ");
            for (int b = 1; b < 9; b++) {
                if (a % 2 == 0) {
                    if (b % 2 == 0) {
                        System.out.print(AZUL + "   " + RESET);
                        tablero[a][b] = AZUL + casilla + RESET;
                        colores[a][b] = 1;
                    } else {
                        System.out.print(AMARILLO + "   " + RESET);
                        tablero[a][b] = AMARILLO + casilla + RESET;
                        colores[a][b] = 0;
                    }
                }
                if (a % 2 != 0) {
                    if (b % 2 == 0) {
                        System.out.print(AMARILLO + "   " + RESET);
                        tablero[a][b] = AMARILLO + casilla + RESET;
                        colores[a][b] = 0;
                    } else {
                        System.out.print(AZUL + "   " + RESET);
                        tablero[a][b] = AZUL + casilla + RESET;
                        colores[a][b] = 1;
                    }
                }
            }
            System.out.print(" " + a);
            System.out.println();
        }
        System.out.print("   a  b  c  d  e  f  g  h \n");
        
        //Definicion de la posicion del alfil:
        
        System.out.println("Introduce la posición del aflil: ");
        String posicionAlfil = s.nextLine();
        int alfilX = 0;
        int alfilY = 0;
        char letra = 'a';
        
        for (int a = 1; a < 9; a++) {
            for (int b = 1; b < 9; b++) {
                if (posicionAlfil.equals(String.valueOf(letra) + (b))) {
                    alfilX = b;
                    alfilY = a;
                    if (colores[a][b] == 1) {
                        tablero[alfilX][alfilY] = AZUL + " ♗ " + RESET;
                    } else {
                        tablero[alfilX][alfilY] = AMARILLO + " ♗ " + RESET;
                    }
                }
            }
            letra++;
        }
        System.out.print("   a  b  c  d  e  f  g  h \n");
        int diagonalX = alfilX;
        int diagonalY = alfilY;
        
        //Movimiento diagonal hacia arriba y la izquierda:
        
        while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
            diagonalX++;
            diagonalY--;
            tablero[diagonalX][diagonalY] = movimiento;
        }
        diagonalX = alfilX;
        diagonalY = alfilY;
        
        //Movimiento diagonal hacia arriba y la derecha:
        
        while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
            diagonalX++;
            diagonalY++;
            tablero[diagonalX][diagonalY] = movimiento;
        }
        diagonalX = alfilX;
        diagonalY = alfilY;

        //Movimiento diagonal hacia debajo y la derecha:
        
        while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
            diagonalX--;
            diagonalY++;
            tablero[diagonalX][diagonalY] = movimiento;
        }
        diagonalX = alfilX;
        diagonalY = alfilY;

        // Movimiento diagonal hacia debajo y la izquierda:
        
        while (diagonalX >= 1 && diagonalX < 9 && diagonalY >= 1 && diagonalY < 9) {
            diagonalX--;
            diagonalY--;
            tablero[diagonalX][diagonalY] = movimiento;
        }

        for (int a = 8; a >= 1; a--) {
            System.out.print(a + " ");
            for (int b = 1; b < 9; b++) {
                if (tablero[a][b].equals(movimiento)) {
                    casillasPosibles++;
                    if (colores[a][b] == 1) {
                        System.out.print(AZUL + movimiento + RESET);
                    } else {
                        System.out.print(AMARILLO + movimiento + RESET);
                    }
                } else {
                    System.out.print(tablero[a][b]);
                }
            }
            System.out.print(" " + a);
            System.out.println();
        }
        System.out.print("   a  b  c  d  e  f  g  h \n");
        System.out.println("\nLas posiciones posibles son las siguientes: ");

        for (int a = 1; a < 9; a++) {
            letra = 'a';
            for (int b = 1; b < 9; b++) {
                if (tablero[a][b].equals(movimiento)) {
                    System.out.print(String.valueOf(letra) + a + " ");
                }
                letra++;
            }
        }
        System.out.println();
    }
}        