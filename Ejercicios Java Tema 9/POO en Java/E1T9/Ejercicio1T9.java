/*
 *Ejercicio 1 del tema 9: Ejercicio del Caballo
 *
 * @author Adan
 */
package E1T9;

public class Ejercicio1T9 {

    public static void main(String[] args) {
        Caballo rocinante = new Caballo("Rocinante");

        Persona pepe = new Persona("Pepe", "Pérez");

        rocinante.setRaza("flaco");

        rocinante.setColor("blanco");

        rocinante.setJinete(pepe);

        System.out.println(pepe);

        pepe.espolea("cariñosa");

        System.out.println(rocinante);

    }

}
