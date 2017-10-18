/**
 *  Ejercicio 1: Preguntar el dia de la semana y decir que asignatura toca a primera.
 * 
 * @author Adán
 */

public class E1t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce un dia de la semana: ");
  String respuesta = Integer.parseInt( System.console().readLine());
  
  if (respuesta.equals("Lunes")||("Miercoles")) {
    System.out.println("Hay Sistemas Informaticos");
  } else {
  System.out.println("Hay Programación");
  }
  }
}
