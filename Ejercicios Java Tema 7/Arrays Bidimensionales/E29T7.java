/*
 *Ejercicio 29 del tema 7: Ejercicio que muestra por pantalla un array de 9
 *filas y 9 columnas con valores comprendidos entre 500 y 900 y te dice el
 *numero mayor, el numero menor y la media de los numeros de la diagonal junto
 *con estos.
 *
 * @author Adan
 */
package ejercicio29tema7;

public class E29T7 {

    public static void main(String[] args) {
        int[][] array = new int[9][9];
        int numero;
        int mayor = 0;
        int menor = 999;
        int suma = 0;

        for (int a = 0; a < 9; a++) {
            for (int b = 0; b < 9; b++) {
                numero = (int) (Math.random() * 401 + 500);
                array[a][b] = numero;
                System.out.print(array[a][b] + " ");
            }
            System.out.println();
        }
        int auxX = 8;
        int auxY = 0;
        int indiceDiagonal = 0;
        int[] diagonal = new int[9];

        for (int x = 0; x < 9; x++) {
            diagonal[indiceDiagonal] = array[auxX][auxY];
            indiceDiagonal++;
            auxX--;
            auxY++;
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            System.out.print(diagonal[i] + " ");
            if (diagonal[i] > mayor) {
                mayor = diagonal[i];
            } else if (diagonal[i] < menor) {
                menor = diagonal[i];
            }
            suma += diagonal[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
        System.out.println("La media es de : " + ((double) suma / 10));
    }
    
}
