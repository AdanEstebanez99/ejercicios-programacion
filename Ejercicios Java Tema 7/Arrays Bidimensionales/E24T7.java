/*
 *Ejercicio 24 del tema 7: Ejercicio de mejorar el juego de buscar el tesoro
 *
 * @author Adan
 */
package Ejercicio24t7;

import java.util.Scanner;

public class E24T7 {

    public static void main(String[] args) {
        final char TESORO = 'T';
        final char MINA = 'X';
        final char VACIO = 'O';
        
        final String RESET = "\u001B[0m";
        final String RED = "\033[31m";
        final String GREEN = "\033[32m";
        final String PURPLE = "\033[35m";
        final String YELLOW = "\033[0;33m";

        Scanner s = new Scanner(System.in);

        char[][] tablero = new char[5][5];
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 5);

        //Generamos el tablero vacio:
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = VACIO;
            }
        }

        //Generamos el Tesoro dentro del tablero:
        
        tablero[x][y] = TESORO;
        
        //Generamos la mina dentro del tablero:
        
        int minax;
        int minay;
        
        do {
            minax = (int) (Math.random() * 5);
            minay = (int) (Math.random() * 5);
        } while (minax == x || minay == y);

        tablero[minax][minay] = MINA;

        int intentos = 10;
        int cont;
        boolean encontrado = false;

        //Pintamos el tablero con la mina y el tesoro:
        
        System.out.println("  0 1 2 3 4");
        System.out.println("─┼─────────");
        cont = 0;

        for (char[] tab : tablero) {
            System.out.print(cont + "│");
            cont++;
            for (char c : tab) {
                System.out.print("O ");
            }
            System.out.println();
        }

        //Inicio del programa:
        
        do {
            do {
                System.out.print("\nIntentos restantes: " + intentos);
                System.out.print("\nIntroduzca una coordenada válida entre [0,0] y [4,4]. Elija la coordenada x: ");
                y = s.nextInt();
                System.out.print("Elija la coordenada y: ");
                x = s.nextInt();
            } while (x > 4 || x < 0 || y > 4 || y < 0);

            switch (tablero[x][y]) {
                case 'T':
                    System.out.println(GREEN + "¡Enhorabuena, has encontrado el tesoro!\n");
                    encontrado = true;
                    break;
                case 'X':

                    System.out.println(RED + "Mala suerte... has pisado una mina y has reventado en 6846554 cachitos :D.\n");
                    encontrado = true;
                    break;
                case '-':
                    System.out.println(PURPLE + "Ya habías buscado en esa posición antes" + RESET);
                    break;
                default:
                    intentos--;
                    
                    for (int i = y - 1; i < y + 2; i++) {
                        for (int j = x - 1; j < x + 2; j++) {
                            if (i >= 0 && i < 5 && j >= 0 && j < 5 && tablero[j][i] == 'X') { //ver las casillas colindantes DENTRO del tablero
                                System.out.println(YELLOW + "¡Cuidado! Hay una mina cerca." + RESET);
                            }
                        }
                    }
                    
                    tablero[x][y] = '-';
                    System.out.println("  0 1 2 3 4");
                    System.out.println("─┼─────────");
                    cont = 0;
                    
                    for (char[] tab : tablero) {
                        System.out.print(cont + "│");
                        cont++;
                        for (char c : tab) {
                            if (c == '-') {
                                System.out.print(c + " ");
                            } else {
                                System.out.print("O ");
                            }
                        }
                        System.out.println();
                    }
            }
        } while (intentos > 0 && !encontrado);
        if (intentos == 0) {
            System.out.println("Te has quedado sin intentos. Aquí está el mapa:\n");
        }
        System.out.println("Aquí está el mapa descubierto:\n");
        System.out.println("  0 1 2 3 4");
        System.out.println("─┼─────────");
        cont = 0;

        for (char[] tab : tablero) {
            System.out.print(cont + "│");
            cont++;
            for (char c : tab) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
