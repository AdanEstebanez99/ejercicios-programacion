/**
 *Ejercicio 21: Calcula la nota de un trimestre de la asignatura programación.
 * @author Adán
 */

public class E21T4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce la nota del primer examen:");
  double examen1 = Integer.parseInt( System.console().readLine());
  System.out.println("Introduce la nota del segundo examen:");
  double examen2 = Integer.parseInt( System.console().readLine());
  
  double notaMedia=((examen1 + examen2) / 2);
  
  if ((notaMedia >= 5)) {
    System.out.println("Tu nota media es: " + notaMedia);
  }
  if ((notaMedia < 5)) {
  System.out.println("¿Cual ha sido el resultado de la recuperación?(apto / no apto)");
  String recuperacion =( System.console().readLine().toLowerCase());
   if (recuperacion.equals("apto")){
     System.out.println("Tu nota media es un 5");
   }
   if (recuperacion.equals("no apto")){
     System.out.println("Tu nota media es: " + notaMedia);
   }
 }
    
  
}
}
