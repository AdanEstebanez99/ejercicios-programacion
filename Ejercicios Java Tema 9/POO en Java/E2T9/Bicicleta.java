/*
 *Ejercicio 2 del tema 9: Definicion de la clase sub-clase Bicicleta 
 *
 *
 * @author Adan
 */
package E2T9;

public class Bicicleta extends Vehiculo {
    private int pinones; // número de piñones
    public Bicicleta(int p) {
        super();
        this.pinones = p;
    }
    public void hazCaballito() {
        System.out.println("Voy a hacer el caballito!");
    }
}
