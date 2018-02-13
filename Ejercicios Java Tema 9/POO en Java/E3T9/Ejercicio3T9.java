/*
 *Ejercicio 3 del tema 9: Ejercicio de las clases  Animal, Mamifero, Ave, Gato, 
 *Perro, Canario, Pinguino y Lagarto.
 *
 * @author Adan
 */
package E3T9;

public class Ejercicio3T9 {

    public static void main(String[] args) {
        System.out.println("Soy el pinguino Emperador");
        Pinguino Emperador = new Pinguino(Sexo.MACHO);
        Emperador.come("palomitas");
        Emperador.programa();
        Emperador.duerme();
        System.out.println();
        
        System.out.println("Soy el canario Pitidos");
        Canario Pitidos = new Canario(Sexo.MACHO);
        Pitidos.canta();
        Pitidos.vuela();
        Pitidos.limpiate();
        Pitidos.ponHuevo();
        Pitidos.duerme();
        System.out.println();
        
        System.out.println("Soy la perrita Manchas");
        Perro Manchas = new Perro(Sexo.HEMBRA);
        Manchas.dameLaPata();
        Manchas.anda();
        Manchas.amamanta();
        Manchas.cuidaCrias();
        Manchas.duerme();
        System.out.println();
        
        System.out.println("Soy el gato Garfield");
        Gato Garfield = new Gato(Sexo.MACHO);
        Garfield.come("Palomitas");
        Garfield.come("pescado");
        Garfield.anda();
        Garfield.limpiate();
        Garfield.duerme();
        System.out.println();

        System.out.println("Soy el lagarto Juancho");
        Lagarto Juancho = new Lagarto(Sexo.MACHO);
        Juancho.tomaElSol();
        Juancho.baniate();
        Juancho.escondete();
        Juancho.duerme();
    }
}

