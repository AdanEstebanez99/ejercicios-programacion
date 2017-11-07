/**
 * Ejercicio 26: Programa que te pide un numero y te pide un digito y te dice el
 * numero que hay en la posición del digito introducido.
 * 
 * @author Adán
 */

public class E26T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero:");
  int numero= Integer.parseInt( System.console().readLine());
  System.out.println("Introduce un dígito:");
  int digito= Integer.parseInt( System.console().readLine());
  int digElegido = 1;
  int volteado = 0;
  
  while (numero > 0) {
    volteado = ((volteado * 10) + (numero % 10));
    numero /= 10;
  }
  
    for (int i = 1 ; i <= digito ; i ++) {
    digElegido = (((digito * 10) + (volteado % 10)) - (digito * 10));
    volteado /= 10;
  }
  System.out.println(digElegido);
   }
  }

