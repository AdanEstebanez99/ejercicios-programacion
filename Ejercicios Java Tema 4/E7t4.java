/**
 * Ejercicio 7: Calcula la nota media de tres examenes.
 * 
 * @author Adán
 */

public class E7t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce la nota en el primer examen");
  int nota1 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce la nota en el segundo examen");
  int nota2 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce la nota en el tercer examen");
  int nota3 = Integer.parseInt( System.console().readLine());
  
  double media = ((nota1 + nota2 + nota3) / 3);
  System.out.println(media + " Es la nota media de tus tres examenes");
  
  if ((nota1 < 0) || (nota1 > 10)) {
    System.out.println("Tu nota 1 es incorrecta, debe ser un numero entre 0 y 10");
  }
  if ((nota2 < 0) || (nota2 > 10)) {
    System.out.println("Tu nota 2 es incorrecta, debe ser un numero entre 0 y 10");
  }
  if ((nota3 < 0) || (nota3 > 10)) {
    System.out.println("Tu nota 3 es incorrecta, debe ser un numero entre 0 y 10");
  }
  

  }
}
