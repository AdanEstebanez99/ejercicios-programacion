/*
 *Ejercicio 18 del tema 8: Conversor de numeros decimales a numeros binarios.
 *
 * @author Adan
 */
package ejercicio18tema8;

import java.util.Scanner;

public class E18T8 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca un número decimal para pasarlo a binario: ");
        int decimal = s.nextInt();
        System.out.println("El resultado en binario es " + decimalBinario(decimal));
    }
    public static long decimalBinario(int decimal) {
        if (decimal == 0) {
            return 0;
        }
        long binario = 1;
        
        while (decimal > 1) {
            binario = Funciones.Varias.pegaPorDetras(binario, decimal % 2);
            decimal = decimal / 2;
        }
        binario = Funciones.Varias.pegaPorDetras(binario, 1);
        binario = Funciones.Varias.voltea(binario);
        binario = Funciones.Varias.quitaPorDetras(binario, 1);
        return binario;

  }
}
