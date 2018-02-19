/*
 *Ejercicio 6 del tema 9: Ejercicio de sumar los tiempos.
 *
 * @author Adan
 */
package E6T9;

public class Ejercicio6T9 {

    public static void main(String[] args) {
        Tiempo t1 = new Tiempo(06, 3, 42);
        Tiempo t2 = new Tiempo(01, 48, 53);

        //Usando ToString veo los resultados:
        
        System.out.println("Tiempo 1: " + t1);
        System.out.println("Tiempo 2: " + t2);

        //Funcion suma:
        
        Tiempo t3 = t1.suma(t2);
        System.out.println("Si se suman los intervalos, el resultado es: " + t3);
        
        //Funcion resta:
        
        t3 = t1.resta(t2);
        System.out.println("Si se restan los intervalos, el resultado es: " + t3);
    }
}
