/*Ejercicio 3 del tema 9: Definición de la clase Mamifero.
 * 
 * @author Adan
 */
package E3T9;

public class Mamifero extends Animal{
    
    public Mamifero() {
        super();
    }

    public Mamifero(Sexo s) {
        super(s);
    }

    public void amamanta() {
        if (this.getSexo() == Sexo.MACHO) {
            System.out.println("Soy macho, no puedo amamantar :(");
        } else {
            System.out.println("Toma pecho, hazte grande");
        }
    }

    public void cuidaCrias() {
        System.out.println("Estoy cuidando mis crias");
    }

    public void anda() {
        System.out.println("Estoy andando");
    }
}
