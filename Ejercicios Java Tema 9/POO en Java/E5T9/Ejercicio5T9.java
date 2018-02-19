/*
 *Ejercicio 5 del tema 9: Ejercicio de pizzas.
 *
 * @author Adan
 */
package E5T9;

public class Ejercicio5T9 {

    public static void main(String[] args) {
        Pizza p1 = new Pizza("margarita", "familiar");
        System.out.println(p1);
        Pizza p2 = new Pizza("funghi", "mediana");
        System.out.println(p2);
        Pizza p3 = new Pizza("carbonara", "pequeña");
        System.out.println(p3);
        Pizza p4 = new Pizza("cuatro estaciones", "familiar");
        System.out.println(p4);
        System.out.println();

        //Finciones de las distintas Pizzas:
        p2.sirve();
        p4.sirve();
        p2.sirve();
        p4.sirve();

        //Recuento de las pizzas con el atributo clase:
        
        System.out.println();
        System.out.println("Se han servido " + Pizza.getServidas() + " pizzas.");
        System.out.println("Se han pedido " + Pizza.getPedidas() + " pizzas.");
    }
}
