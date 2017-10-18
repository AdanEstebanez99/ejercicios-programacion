/**
 *  Ejercicio 2: Introducir horas y decirte en que momento del dia estas.
 * 
 * @author Adán
 */

public class E2t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce una hora (sin minutos): ");
  int respuesta = Integer.parseInt( System.console().readLine());
  
  if ((respuesta >= 6) && (respuesta <= 12)) {
    System.out.println("Buenos Días");
  } 
  if ((respuesta >= 13) && (respuesta <= 20)) {
    System.out.println("Buenas Tardes");
  }
  if ((respuesta < 6) || (respuesta > 20) && !(respuesta > 23)) {
    System.out.println("Buenas Noches");
  }else {
  System.out.println("El numero introducido no es valido");
  System.out.println("Por Favor introduce un numero entre 0 y 23");
  }
  }
}
