/**
 * Ejercicio 11: Programa que muestra 20 notas al azar y te las dice con palabras
 * suficiente, notable, bien, sobresaliente...
 * @author Adán
 */

  public class E11T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Te voy a mostrar el resultado de 20 notas generadas al azar");
    final int numNotas = 20;
    
    for (int i = 0 ; i < numNotas ; i ++){
      int numero = (int)(Math.random()*5);
      String notas = "a";
      
      switch (numero){
        
        case 0:
          System.out.print("Suspenso");
          break;
        
        case 1:
          System.out.print("Aprobado");
          break;
        
        case 2:
          System.out.print("Bien");
          break;
        
        case 3:
          System.out.print("Notable");
          break;
        
        case 4:
          System.out.print("Sobresaliente");
          break;
      }
      System.out.println();
    }
  }
}
