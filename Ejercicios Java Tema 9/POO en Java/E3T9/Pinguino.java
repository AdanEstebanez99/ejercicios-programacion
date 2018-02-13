/*Ejercicio 3 del tema 9: Definición de la clase Pinguino.
 * 
 * @author Adan
 */
package E3T9;

public class Pinguino extends Ave {
    public Pinguino() {
    }
    
    public Pinguino(Sexo s) {
        super(s);
    }

    @Override
    public void vuela() {
        System.out.println("Soy un pingüino, no puedo volar");
    }

    public void programa() {
        System.out.println("Soy un pingüino programador, estoy programando en Java");
    }

    public void nada() {
        System.out.println("Estoy nadando");
    }
}


