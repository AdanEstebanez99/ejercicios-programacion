/*
 *Ejercicio 17 del tema 8: Conversor de binario a decimal.
 *
 * @author Adan
 */
package ejercicio17tema8;

import java.util.Scanner;

public class E17T8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long decimal = 0;
        System.out.print("Introduce un número binario: ");
        long binario = s.nextLong();

        int bits = Funciones.Varias.digitos(binario);
        
        for (int i = 0; i < bits; i++) {
            decimal += Funciones.Varias.digitoN(binario, bits - i - 1) * Funciones.Varias.potencia(2, i);
        }
        System.out.println(binario + " en decimal es " + decimal);
    }
}
