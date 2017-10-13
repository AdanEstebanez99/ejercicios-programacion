/**
 *Ejercicio 8: calcular el salario semanal de un empleado que cobra 12€ la hora.
 * @author Adán
 */

public class E8t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el nº de horas trabajadas a la semana");
  int hsemana = Integer.parseInt( System.console().readLine());
  
  double sueldosem = ((double) hsemana * (double) 12);
  double sueldodia = ((double) sueldosem / (double) 5);
  System.out.println(sueldosem + " Es lo que cobras a la semana "+ sueldodia +" Es lo que cobras al dia");

  }
}
