/*
 *Ejercicio 4 del tema 9: Ejercicio de hacer operaciones con la clase fraccion.
 *
 * @author Adan
 */
package E4T9;

import java.util.Scanner;

public class Ejercicio4T9 {

//Clase Fraccion.
    
    public static void main(String[] args) {
        UsaFraccion fr1 = new UsaFraccion(18, 96);
        System.out.println(fr1+" x 5 = "+fr1.multiplicar(5));
        System.out.println(fr1+" ^-1 = "+fr1.invertir());

        UsaFraccion fr2 = new UsaFraccion(76, 54);
        System.out.println(fr1+" x "+fr2+" = "+fr1.multiplicar(fr2));
        System.out.println(fr1+" : "+fr2+" = "+fr1.dividir(fr2));

        UsaFraccion fr3 = new UsaFraccion(322, 678);
        System.out.println(fr3+" = "+fr3.simplificar());
    }
}
