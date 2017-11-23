/**
 * Ejercicio 6: Programa que piensa un numero aleatorio entre 0 y 100 y el
 * usuario debe adivinarlo en 5 intentos.
 * @author Adán
 */

  public class E6T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a jugar, Voy a pensar un numero entre 0 y 100");
    System.out.println("tienes 5 intentos para adivirnarlo, buena suerte.");
    int numero = (int)(Math.random()*100) + 1;
    int intentos = 5;
    boolean acierto = false;
    do {
       int numeroIntroducido = Integer.parseInt (System.console().readLine());
       intentos --;
      
      if ((numeroIntroducido < numero) && (intentos > 0)) {
        System.out.println("El numero es mayor que el numero introducido");
        System.out.println("Te quedan "+intentos+" intentos");
      }
      
      if ((numeroIntroducido > numero) && (intentos > 0)) {
        System.out.println("El numero es menor que el numero introducido");
        System.out.println("Te quedan "+intentos+" intentos");
      }
      
      if ((numeroIntroducido == numero) && (intentos >= 0)) {
        acierto = true;
        System.out.println("Has adivinado el numero secreto, enhorabuena!");
      }
       
       } while ((intentos > 0) && (!acierto));
      
      if (!acierto) {
        System.out.println("Lo siento, no has acertado, el numero era "+numero);
      }
    }
  }
