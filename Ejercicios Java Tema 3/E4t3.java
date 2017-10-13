/**
 * Pide 2 Numeros por pantalla y te muestra el resultado de su suma, resta,
 * multiplicación y división.
 * @author Adán
 */

public class E4t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce un numero: ");
  int primerNumero = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce otro numero: ");
  int segundoNumero = Integer.parseInt( System.console().readLine());
  
  int suma;
  suma = (primerNumero + segundoNumero);
  System.out.println(suma + " Es el resultado de la suma del primer y segundo numero");

  int resta;
  resta = (primerNumero - segundoNumero);
  System.out.println(resta + " Es el resultado de la resta del primer y segundo numero");
  
  int multiplicacion;
  multiplicacion = (primerNumero * segundoNumero);
  System.out.println(multiplicacion + " Es el resultado de la multiplicación del primer y segundo numero");
  
  int division;
  division = (primerNumero / segundoNumero);
  System.out.println(division + " Es el resultado de la division del primer y segundo numero");
  }
}
