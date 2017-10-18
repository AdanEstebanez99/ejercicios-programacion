/**
 * Ejercicio 7: Calcula la nota media de tres examenes.
 * 
 * @author Adán
 */

public class E8t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce la nota en el primer examen");
  int nota1 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce la nota en el segundo examen");
  double nota2 = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce la nota en el tercer examen");
  double nota3 = Integer.parseInt( System.console().readLine());
  
  double media = ((nota1 + nota2 + nota3) / 3);
  System.out.println(media + " Es la nota media de tus tres examenes");
  
  if ((media >= 0) && (media <= 4)){
    System.out.println("Lo siento, tu nota es insuficiente");
  }
  if ((media == 5)) {
    System.out.println("¡Por los pelos!, tu nota es un suficiente");
  }
  if ((media == 6)) {
    System.out.println("Tu nota es un bien");
  }
  if ((media >= 7) && (media <= 8)) {
    System.out.println("¡Enhorabuena!, tu nota es un notable");
  }
  if ((media >= 9) && (media <= 10)) {
    System.out.println("¡Sigue asi!, tu nota es un sobresaliente");
  } else { 
    System.out.println("Quizas una de las notas que hayas introducido sea mayor que 10");
    System.out.println("Por favor revisalo de nuevo");
  }
  

  }
}
