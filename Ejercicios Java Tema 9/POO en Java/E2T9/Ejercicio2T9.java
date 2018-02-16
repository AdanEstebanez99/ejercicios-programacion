/*
 *Ejercicio 2 del tema 9: Ejercicio en el que debemos definir la clase vehiculos
 *con las sub-clases bicicleta y coche y creamos los atributos kilometros
 * totales y kilometros recorridos.
 *
 * @author Adan
 */
package E2T9;

import java.util.Scanner;

public class Ejercicio2T9 {

    public void main(String[] args) {
        int opcion = 0;
        int km;

        Bicicleta Ghost = new Bicicleta(10);
        Coche Subaru = new Coche(2500);

        System.out.println("VEHICULOS:");
        System.out.println("==========");
        while (opcion != 8) {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.println("Elige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            
            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos kilómetros vas a recorrer? ");
                    km = Integer.parseInt(System.console().readLine());
                    Ghost.recorre(km);
                    break;
                case 2:
                    Ghost.hazCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuántos kilómetros vas a recorrer? ");
                    km = Integer.parseInt(System.console().readLine());
                    Subaru.recorre(km);
                    break;
                case 4:
                    Subaru.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bicicleta ha recorridos ");
                    System.out.println(Subaru.getKilometrosRecorridos() + " Km");
                    break;
                case 6:
                    System.out.println("El coche ha recorridos ");
                    System.out.println(Subaru.getKilometrosRecorridos() + " Km");
                    break;
                case 7:
                    System.out.println("Los vehículos han recorrido ");
                    System.out.println(Vehiculo.getKilometrosTotales() + " Km");
                default:
            } // switch
        } // while
    }
}
