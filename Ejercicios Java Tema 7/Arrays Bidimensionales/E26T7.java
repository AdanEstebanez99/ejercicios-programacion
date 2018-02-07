/*
 *Ejercicio 26 del tema 7: Ejercicio de rotar una matriz en el sentido de las 
 * agujas del reloj
 *
 * @author Adan
 */
package ejercicio26tema7;

public class E26T7 {

    public static void main(String[] args) {
        int[][] original = new int[12][12];
        int[][] auxiliar = new int[12][12];
        int numero;
        int subidaDeNumeros = 0;
        int bajadaDeNumeros = 11;
        int contadorNumerosSubidos;
        int contadorNumerosBajados;
        int originalY;
        int auxiliarY;
        int referenciaOriginal = 0;
        int referenciaAuxiliar = 1;
        int iteracionesIntermedias;

        //Dibuja el Array original:
        
        System.out.println("Array original: ");
        System.out.println();

        for (int a = 0; a < 12; a++) {
            for (int b = 0; b < 12; b++) {
                numero = (int) (Math.random() * 101);
                original[a][b] = numero;
                System.out.printf("%5d %1s", numero, "");
            }
            System.out.println();
        }

        //Dibuja el lado izquierdo del Array ya rotado:
        
        for (int a = 0; a < 12; a++) {
            contadorNumerosSubidos = 0;
            for (int b = 0; b < subidaDeNumeros; b++) {
                auxiliar[a - 1][b] = original[a][b];
                contadorNumerosSubidos++;
            }
            if (a < 6) {
                subidaDeNumeros++;
            } else {
                subidaDeNumeros--;
            }

            //Dibuja el lado izquierdo del Array ya rotado:
            
            contadorNumerosBajados = 0;
            
            for (int c = bajadaDeNumeros; c < 12; c++) {
                if (a < 11) {
                    auxiliar[a + 1][c] = original[a][c];
                    contadorNumerosBajados++;
                }
            }
            if (a < 5) {
                bajadaDeNumeros--;
            } else {
                bajadaDeNumeros++;

            }

            //Por ultimo se dibuja la parte central del Array ya rotado:
            
            if (a < 6) {
                iteracionesIntermedias = 12 - (contadorNumerosBajados + contadorNumerosSubidos);
                auxiliarY = referenciaAuxiliar;
                originalY = referenciaOriginal;
                for (int d = 0; d < iteracionesIntermedias; d++) {
                    auxiliar[a][auxiliarY] = original[a][originalY];
                    auxiliarY++;
                    originalY++;
                }
                referenciaAuxiliar++;
                referenciaOriginal++;
            } else {
                if (a == 6) {
                    referenciaAuxiliar = 5;
                    referenciaOriginal = 6;
                }
                iteracionesIntermedias = 12 - (contadorNumerosBajados + contadorNumerosSubidos);
                auxiliarY = referenciaAuxiliar;
                originalY = referenciaOriginal;
                for (int d = 0; d < iteracionesIntermedias; d++) {
                    auxiliar[a][auxiliarY] = original[a][originalY];
                    auxiliarY++;
                    originalY++;
                }
                referenciaAuxiliar--;
                referenciaOriginal--;
            }
        }
        System.out.println();
        System.out.println("Array con las cifras rotadas: ");
        System.out.println();
        
        for (int a = 0; a < 12; a++) {
            for (int b = 0; b < 12; b++) {
                System.out.printf("%5d %1s", auxiliar[a][b], "");
            }
            System.out.println();
        }
    }
}
