/**
 * Ejercicio 36: Programa que según un numero introducido por teclado te dice si
 * es capicua o no.
 * 
 * @author Adán
 */

public class E36T5 { // Clase principal
public static void main(String[] args) {
    System.out.println("Vamos a realizar un programa que nos diga si es capicua el numero introducido ");
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numero = numeroIntroducido;
    long numeroReves = 0;
     while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
    }
    if(numeroIntroducido == numeroReves){
      System.out.print("El numero es capicua ");
      }else{
        System.out.print("El numero no es capicua");
        }
  }
}
 

    
    

