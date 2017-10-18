/**
 *Ejercicio 4: Calcular sueldo con precio especial en horas extra
 * @author Adán
 */

public class E4t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el nº de horas trabajadas a la semana");
  int hsemana = Integer.parseInt( System.console().readLine());
  if ((hsemana >= 41)) {
    double sueldobase = ((double) 40 * (double) 12);
    double horasextra = ((double) hsemana - (double) 40);
    double sueldoextra = ((double) horasextra * (double) 16);
    double sueldosem = ((double) sueldoextra + (double) sueldobase);
    System.out.println(sueldosem + " Es los que has cobrado esta semana");
    System.out.println(sueldoextra + " € Es lo que has cobrado por las " + horasextra + " horas extra");
  } else {
    
    double sueldoNoExtra = ((double) hsemana * (double) 12);
    System.out.println(sueldoNoExtra + " € Es lo que has cobrado esta semana sin horas extra");
  }

  }
}
