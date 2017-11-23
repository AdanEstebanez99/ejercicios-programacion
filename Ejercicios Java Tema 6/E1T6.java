/**
 * Ejercicio 1: Muestra la tirada de 3 dados y la suma de estos tres.
 * 
 * @author Adán
 */

  public class E1T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a tirar 3 dados:");
    int suma = 0;
    String dadoFigura = "";
  
    for (int i = 1 ; i <= 3 ; i ++) {
      int dado = (int)(Math.random()*6) + 1;
    
      switch (dado) {
      
        case 1:
        System.out.print(" ⚀ ");
        break;
      
        case 2:
        System.out.print(" ⚁ ");
        break;
      
        case 3:
        System.out.print(" ⚂ ");
        break;
      
        case 4:
        System.out.print(" ⚃ ");
        break;
      
        case 5:
        System.out.print(" ⚄ ");
        break;
      
        case 6:
        System.out.print(" ⚅ ");
        break;
        }
    
      suma += dado;
    
    }
    System.out.println();
    System.out.println("La suma de los tres dados es: "+suma);
  
    }
  }
