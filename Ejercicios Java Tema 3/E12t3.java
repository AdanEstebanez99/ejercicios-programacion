/**
 *Ejercicio 12 Calcula la nota del segundo examen para tener la media deseada
 * @author Adán
 */

public class E12t3 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Introduce la nota del primer examen");
  int examen1 = Integer.parseInt( System.console().readLine());
  System.out.println("Introduce la nota que quieres tener en el trimestre");
  int notatrimestre = Integer.parseInt( System.console().readLine());
  
  double nota2 = ((double) notatrimestre * (int) 100) - ((double) examen1 * (int) 40) / ((int) 60);
  System.out.println(nota2 + " Es la nota que tienes que sacar en el segundo examen para tener un " + notatrimestre + " de media");
  
}
}
