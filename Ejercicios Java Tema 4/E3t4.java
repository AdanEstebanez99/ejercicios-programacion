/**
 *  Ejercicio 3: Introducir un numero del 1 al 7 y decir que dia de la semana es
 * 
 * @author Adán
 */

public class E3t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un Nº del 1 al 7:");
  int respuesta = Integer.parseInt( System.console().readLine());
  
  if ((respuesta == 1)) {
    System.out.println("Lunes");
  } 
  if ((respuesta == 2)) {
    System.out.println("Martes");
  }
  if ((respuesta == 3)) {
    System.out.println("Miercoles");
  }
  if ((respuesta == 4)) {
    System.out.println("Jueves");
  }
  if ((respuesta == 5)) {
    System.out.println("Viernes");
  }
  if ((respuesta == 6)) {
    System.out.println("Sabado");
  }
  if ((respuesta == 7)) {
    System.out.println("Domingo");
  }
  if ((respuesta > 7)) {
    System.out.println("Introduce un Numero entre 1 y 7");
  
  }
  }
}
