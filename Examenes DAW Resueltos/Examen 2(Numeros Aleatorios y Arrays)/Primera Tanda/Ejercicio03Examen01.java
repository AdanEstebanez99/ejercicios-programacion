/**
 * Ejercicio03Examen01: Programa que pinte un portal de belen con el niño Jesus
 * entre San José y la Virgen.
 * 
 * @author Adán
 */

  public class Ejercicio03Examen01 { // Clase principal
  public static void main(String[] args) {
    int espacios = 11;
    int i = 0;
    int jesus = (int)(Math.random()*3) + 4;
    int maria = (int)(Math.random()*9) + 1;
    int jose = (int)(Math.random()*9) + 1;
    
    System.out.println("  * * * * * * *");
    System.out.println("  *           *");
    System.out.print("  *");
    
    for (i = 1; i <= espacios; i ++) {
      
      if (jesus == i) {
        System.out.print("o");
      } else {
        System.out.print(" ");
      }
      
      if (maria == jesus) {
        maria = (int)(Math.random()*9) + 1;
        } else {
          if (maria == i) {
            System.out.print("V");
            espacios --;
          }
        }
        
        
      if ((jose == jesus) || (jose == maria)) {
        jose = (int)(Math.random()*9) + 1;
        } else {
          if (((jose < jesus) && (maria < jesus)) || ((jose > jesus) && (maria > jesus))) {
            jose = (int)(Math.random()*9) + 1;
          } else {
            if (jose == i) {
              System.out.print("J");
              espacios --;
            }
          }
        }
        
        
    }
      
      
    System.out.print("*");
    System.out.println();
    System.out.println("-----------------");
  
  
  
  }
}
