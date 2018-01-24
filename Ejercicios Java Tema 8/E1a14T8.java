/**
 * Ejercicios Tema 8: A continuación estaran los ejercicios del 1 al 14 del tema
 * de funciones de java.
 * 
 * @author Adán
 */

  import Funciones.Varias;

  public class E1a14T8 { // Clase principal
  public static void main(String[] args) {
    
    int numero;
    
    //Ejercicio 1:Decir si un numero es o no Capicua.
    
    System.out.println("Introduzca un numero entero positivo: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (Funciones.Varias.esCapicua(numero)) {
      System.out.println("El numero "+numero+" es capicua");
    } else {
      System.out.println("El numero "+numero+" no es capicua");
    }
    
    
    
    //Ejercicio 2:Decir si un numero es o no primo.
    
    System.out.print("Introduce un número y te diré si es o no primo: ");
          int numeroIntroducido2 = Integer.parseInt(System.console().readLine());
          
          if (Funciones.Varias.esPrimo(numeroIntroducido2)) {
            System.out.println("El número que has introducido es primo.");
          } else {
            System.out.println("El número que has introducido no es primo");
            }
    //Ejercicio 3: Decir cual es el siguiente numero primo.
    
    System.out.println("Introduce un número y te dire cuál es el siguiente primo: ");
    int numeroIntroducido3 = Integer.parseInt(System.console().readLine());
          
    int siguiente = Funciones.Varias.siguientePrimo(numeroIntroducido3);
          
    System.out.println("El siguiente primo de " + numeroIntroducido3 + " es " + siguiente);
    
    //Ejercicio 4: A partir de una base y un exponente se muestra su potencia.
    
    System.out.print("Introduce una base: ");
    int base = Integer.parseInt(System.console().readLine());
          
    System.out.print("Ahora Introduce un exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
          
    int potencia = Funciones.Varias.potencia(base, exponente);
          
    System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + potencia);
    
    //Ejercicio 5: Cuenta los digitos de un numero introducido por teclado.
    
    System.out.print("Introduce un número y te diré cuantos dígitos tiene: ");
    int numeroIntroducido4 = Integer.parseInt(System.console().readLine());
           
    int cuentaDigito = Funciones.Varias.digitos(numeroIntroducido4);
           
    System.out.println("El " + numeroIntroducido4 + " tiene " + cuentaDigito + " dígitos");
    
    //Ejercicio 6: Voltea un numero introducido por teclado.
    
    System.out.print("Introducé un número y te lo voltearé: ");
    int numeroIntroducido5 = Integer.parseInt(System.console().readLine());
           
    int volteado = Funciones.Varias.voltea(numeroIntroducido5);
           
    System.out.println("Tu número volteado es " + volteado);
    
    //Ejercicio 7: Muestra la posicion de un digito introducido por el ususario.
    
    System.out.print("Introduce un número: ");
    int numeroIntroducido6 = Integer.parseInt(System.console().readLine());
           
    System.out.print("Introduce un numero y te dire el digito de esa posicion: ");
    int posicion = Integer.parseInt(System.console().readLine());
           
    int posicionDelDigito = Funciones.Varias.digitoN(numeroIntroducido6, posicion);
           
    System.out.println("En esa posición está el " + posicionDelDigito);
    
    //Ejercicio 8: Programa que dice la ocurrencia de un numero:
    
    System.out.print("Introduce un número: ");
    int numeroIntroducido7 = Integer.parseInt(System.console().readLine());
           
    System.out.print("Ahora introduce un número de 1 cifra: ");
    int cifra = Integer.parseInt(System.console().readLine());
           
    int ocurrencia = Funciones.Varias.posicionDeDigito(numeroIntroducido7, cifra);
           
    if(ocurrencia == -1){
      System.out.println("El número " + cifra + " no se encuentra " + ocurrencia);
      } else {
        System.out.println("El número " + cifra + " aparece primero en la posición " + ocurrencia);
      }
      
    //Ejercicio 9: Programa que quita n digitos a un numero por detras.
    
    System.out.print("Introduce un número largo: ");
    long numeroIntroducido8 = Long.parseLong(System.console().readLine());
           
    System.out.print("¿Cuántos dígitos le quieres quitar al número por detrás?: ");
    long quitarDetras = Long.parseLong(System.console().readLine());
           
    long resultadoDetras = Funciones.Varias.quitarPorDetras(numeroIntroducido8, quitarDetras);
           
    System.out.println("Este es tu número acortado: " + resultadoDetras);
    
    //Ejercicio 10: Programa que quita n digitos a un numero por delante.
    
    System.out.print("Introduce un número largo: ");
    int numeroIntroducido9 = Integer.parseInt(System.console().readLine());
           
    System.out.print("¿Cuántos dígitos le quieres quitar al número por delante?: ");
    int quitarDelante = Integer.parseInt(System.console().readLine());
           
    int resultadoDelante = Funciones.Varias.quitarPorDelante(numeroIntroducido9, quitarDelante);
           
    System.out.println("Este es tu número acortado: " + resultadoDelante);
    
    //Ejercicio 11: Programa que le añade digitos por detras a un numero.
    
    System.out.print("Introduce un número largo: ");
    int numeroIntroducido10 = Integer.parseInt(System.console().readLine());
           
    System.out.print("Escribe un dígito para pegarselo por detrás al número: ");
    int pegarDetras = Integer.parseInt(System.console().readLine());
           
    int resultadoPegaDetras = Funciones.Varias.pegaPorDetras(numeroIntroducido10, pegarDetras);
           
    System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDetras);
    
    //Ejercicio 12: Programa que le añade digitos por detras a un numero.
    
    System.out.print("Introduce un número largo: ");
    int numeroIntroducido11 = Integer.parseInt(System.console().readLine());
           
    System.out.print("Escribe un dígito para pegarselo por delante al número: ");
    int pegarDelante = Integer.parseInt(System.console().readLine());
           
    int resultadoPegaDelante = Funciones.Varias.pegaPorDelante(numeroIntroducido11, pegarDelante);
           
    System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDelante);
    
    //Ejercicio 13: Programa que trozea un numero.
    
    System.out.print("Introduce un numero: ");
    int i = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el inicio: ");
    int e = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el inicio: ");
    int j = Integer.parseInt(System.console().readLine());
    
    int x = Funciones.Varias.voltea(i);
    
    do {
     x = x / 10;
   } while ( x % 10 != e);
   
    System.out.println(x);
    int x2 = Funciones.Varias.voltea(x);
    do {
     x2 = x2 / 10;
   } while ( x2 % 10 != j);
   
    System.out.println(x2);
    
    
    
  }
}

    
    

