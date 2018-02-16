/*
 *Ejercicio 2 del tema 9: Definicion de la clase sub-clase Coche 
 *
 *
 * @author Adan
 */
package E2T9;

public class Coche extends Vehiculo {
    private int cilindrada;
    
    public Coche(int c) {
        super();
        this.cilindrada = c;
    }
    public void quemaRueda() {
        System.out.println("Bruuuun Bruuuuun");
    }
}

