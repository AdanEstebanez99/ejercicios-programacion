/**
 *Ejercicio 12 Calcula la nota del segundo examen para tener la media deseada
 * @author Adán
 */

public class E12t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce la nota del primer examen");
  double examen1 = Integer.parseInt( System.console().readLine());
  System.out.println("Introduce la nota que quieres tener en el trimestre");
  double notatrimestre = Integer.parseInt( System.console().readLine());
  
  double examen2 = ((notatrimestre * 100) - (examen1 * 40)) / 60;
  System.out.println(examen2 + " Es la nota que tienes que sacar en el segundo examen para tener un " + notatrimestre + " de media");
  
}
}
