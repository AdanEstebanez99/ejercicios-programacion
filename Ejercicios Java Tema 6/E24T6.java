/**
 * Ejercicio 24: Programa que a partir de un numero introducido por el usuario
 * te elija un digito aleatorio de este.
 * 
 * @author Adán
 */

  public class E24T6 { // Clase principal
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("introduce un número entero positivo: ");
    long num = s.nextLong();
    
    //cuenta las cifras que tiene el numero:
    
    long aux = num;
    int cont = 0;
    while (aux > 0) {
      aux /= 10;
      cont++;
    }
    int posicion = (int) (Math.random() * cont) + 1;
    System.out.println("Posición de la cifra elegida: " + (cont - posicion + 1));
    
    //corta el numero hasta la cifra que coincida con el numero aleatorio
    
    while (posicion > 1) {
      num /= 10;
      posicion--;
    }
    System.out.println("La cifra elegida es el: " + num % 10);
  }
}

    
