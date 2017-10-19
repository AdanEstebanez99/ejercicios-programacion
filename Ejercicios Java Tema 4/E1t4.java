/**
 *  Ejercicio 1: Preguntar el dia de la semana y decir que asignatura toca a primera.
 * 
 * @author Adán
 */

public class E1t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un dia de la semana: ");
  String respuesta = System.console().readLine(). toLowerCase();
  
  if (respuesta.equals("lunes")) {
    System.out.println("Hay Sistemas Informaticos");
  }
  if (respuesta.equals("martes")) {
    System.out.println("Hay Programación");
  }
  if (respuesta.equals("miercoles")) {
    System.out.println("Hay Sistemas Informaticos");
  }
  if (respuesta.equals("jueves")) {
    System.out.println("Hay Programación");
  }
  if (respuesta.equals("viernes")) {
    System.out.println("Hay Programación");
  }
  if (respuesta.equals("sabado")) {
    System.out.println("No hay clase");
  }
  if (respuesta.equals("domingo")) {
    System.out.println("No hay clase");
  }
  }
}
