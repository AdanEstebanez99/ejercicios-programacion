/*
 *Ejercicio 27 del tema 7: Juego del tres en raya. 
 *
 *
 * @author Adan
 */
package ejercicio27tema7;

import java.util.Scanner;

public class E27T7 {

    public static void main(String[] args) throws InterruptedException {
        String[][] tablero = new String[3][3];

        //Dibuja el tablero inicial
        
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "-";
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("  1 2 3\nElige quien va a comenzar: 1) Máquina   Enter) Jugador: ");

        Scanner s = new Scanner(System.in);
        int ficha;
        int x;
        int y;
        boolean valido;
        boolean libre;
        boolean ganaMaquina;
        boolean ganaJugador;
        int hor;
        int ver;
        int diaIz;
        int diaDe;
        
        switch (s.nextLine()) {
            case "1":
                tablero[(int) (Math.random() * 3)][(int) (Math.random() * 3)] = "X";
                break;
            default:
                System.out.println("Comienzas Tu!");
        }
        do {
            valido = false;
            libre = false;
            ganaMaquina = false;
            ganaJugador = false;
            diaIz = 0;
            diaDe = 0;

            //Comprobar si hay algun ganador
            
            for (int i = 0; i < 3 && !ganaMaquina && !ganaJugador; i++) {
                hor = 0;
                ver = 0;
                for (int j = 0; j < 2; j++) {
                    if (tablero[i][j].equals(tablero[i][j + 1])) {
                        hor++;
                    }
                    if (tablero[j][i].equals(tablero[j + 1][i])) {
                        ver++;
                    }
                }
                if (i < 2 && tablero[i][i].equals(tablero[i + 1][i + 1])) {
                    diaIz++;
                }
                if (i < 2 && tablero[i][2 - i].equals(tablero[i + 1][2 - i - 1])) {
                    diaDe++;
                }
                if (hor == 2) { //Si hay 2 repeticiones en la horizontal i
                    switch (tablero[i][0]) {
                        case "X":
                            ganaMaquina = true;
                            break;
                        case "O":
                            ganaJugador = true;
                            break;
                    }
                } else if (ver == 2) { //Si hay dos repeticiones en la vertical i
                    switch (tablero[0][i]) {
                        case "X":
                            ganaMaquina = true;
                            break;
                        case "O":
                            ganaJugador = true;
                            break;
                    }
                } else if (diaDe == 2) { //Si hay dos repeticiones en la diagonal derecha
                    switch (tablero[1][1]) {
                        case "X":
                            ganaMaquina = true;
                            break;
                        case "O":
                            ganaJugador = true;
                            break;
                    }
                } else if (diaIz == 2) { //Si hay dos repeticiones en la diagonal izquierda
                    switch (tablero[1][1]) {
                        case "X":
                            ganaMaquina = true;
                            break;
                        case "O":
                            ganaJugador = true;
                            break;
                    }
                }
            }
            if (!ganaMaquina && !ganaJugador) { //Se comprueba si todavia no hay ganadores
                
                //Vuelve a imprimir el tablero
                
                for (int i = 0; i < 3; i++) {
                    System.out.print(i + 1 + " ");
                    for (int j = 0; j < 3; j++) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("  1 2 3");

                //Comprobacion de casillas libres
                
                for (String[] lib : tablero) {
                    for (String l : lib) {
                        if (l.equals("-")) {
                            libre = true;
                        }
                    }
                }

                //Juega el usuario
                
                while (!ganaMaquina && !ganaJugador && libre && !valido) {
                    System.out.println("Introduce una coordenada en x e y. Ejemplo: 12");
                    ficha = s.nextInt();
                    x = ficha % 10;
                    y = ficha / 10;
                    if (x < 1 || x > 3 || y < 1 || y > 3) {
                        System.out.println("Posicion no valida");
                    } else if (!tablero[x - 1][y - 1].equals("-")) {
                        System.out.println("Esa posicion esta ocupada, introduce otra coordenada: ");
                    } else {
                        tablero[x - 1][y - 1] = "O";
                        valido = true;
                    }
                }

                //Juega la Maquina
                
                valido = false;
                Thread.sleep(1000);
                while (!ganaMaquina && !ganaJugador && libre && !valido) {
                    x = (int) (Math.random() * 3);
                    y = (int) (Math.random() * 3);
                    if (tablero[x][y].equals("-")) {
                        valido = true;
                        tablero[x][y] = "X";
                    }
                }
            }
        } while (!ganaJugador && !ganaMaquina && libre);

        //Se vuelve a imprimir el tablero
        
        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("  1 2 3");
        if (ganaJugador) {

            System.out.println("Has derrotado a la Maquina!");
        } else if (ganaMaquina) {
            System.out.println("La maquina te ha derrotado, intentalo de nuevo!");
        } else {
            System.out.println("Empate, ¿Quieres la revancha?");
        }
    }
}
