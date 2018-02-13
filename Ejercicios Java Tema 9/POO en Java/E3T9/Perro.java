/*Ejercicio 3 del tema 9: Definición de la clase Perro.
 * 
 * @author Adan
 */
package E3T9;

public class Perro extends Mamifero {
    public Perro(Sexo s) {
        super(s);
    }

    public Perro() {
        super(Sexo.HEMBRA);
    }

    public void ladra() {
        System.out.println("Guau guau");
    }

    public void dameLaPata() {
        System.out.println("Toma mi patita");
    }

    public void caza() {
        System.out.println("Estoy cazando perdices");
    }
}
