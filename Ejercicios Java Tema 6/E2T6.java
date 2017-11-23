/**
 * Ejercicio 2: Programa que muestra al azar el nombre de una carta de la baraja
 * francesa.
 * @author Adán
 */

  public class E2T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a elegir una carta de la baraja francesa:");
      
      int palo = (int)(Math.random()*4) + 1;
    
      switch (palo) {
      
        case 1: //picas
        int cartaPicas = (int)(Math.random()*13) + 1;
          switch (cartaPicas) {
            
            case 1:
            System.out.println("As de Picas");
            break;
            
            case 2:
            System.out.println("2 de Picas");
            break;
            
            case 3:
            System.out.println("3 de Picas");
            break;
            
            case 4:
            System.out.println("4 de Picas");
            break;
            
            case 5:
            System.out.println("5 de Picas");
            break;
            
            case 6:
            System.out.println("6 de Picas");
            break;
            
            case 7:
            System.out.println("7 de Picas");
            break;
            
            case 8:
            System.out.println("8 de Picas");
            break;
            
            case 9:
            System.out.println("9 de Picas");
            break;
            
            case 10:
            System.out.println("10 de Picas");
            break;
            
            case 11:
            System.out.println("J de Picas");
            break;
            
            case 12:
            System.out.println("Q de Picas");
            break;
            
            case 13:
            System.out.println("K de Picas");
            break;
          }
        
        break;
      
          case 2: //Corazones
          int cartaCorazones = (int)(Math.random()*13) + 1;
          switch (cartaCorazones) {
            
            case 1:
            System.out.println("As de Corazones");
            break;
            
            case 2:
            System.out.println("2 de Corazones");
            break;
            
            case 3:
            System.out.println("3 de Corazones");
            break;
            
            case 4:
            System.out.println("4 de Corazones");
            break;
            
            case 5:
            System.out.println("5 de Corazones");
            break;
            
            case 6:
            System.out.println("6 de Corazones");
            break;
            
            case 7:
            System.out.println("7 de Corazones");
            break;
            
            case 8:
            System.out.println("8 de Corazones");
            break;
            
            case 9:
            System.out.println("9 de Corazones");
            break;
            
            case 10:
            System.out.println("10 de Corazones");
            break;
            
            case 11:
            System.out.println("J de Corazones");
            break;
            
            case 12:
            System.out.println("Q de Corazones");
            break;
            
            case 13:
            System.out.println("K de Corazones");
            break;
          }
        
        break;
        
          case 3: //Diamantes
          int cartaDiamantes = (int)(Math.random()*13) + 1;
          switch (cartaDiamantes) {
            
            case 1:
            System.out.println("As de Diamantes");
            break;
            
            case 2:
            System.out.println("2 de Diamantes");
            break;
            
            case 3:
            System.out.println("3 de Diamantes");
            break;
            
            case 4:
            System.out.println("4 de Diamantes");
            break;
            
            case 5:
            System.out.println("5 de Diamantes");
            break;
            
            case 6:
            System.out.println("6 de Diamantes");
            break;
            
            case 7:
            System.out.println("7 de Diamantes");
            break;
            
            case 8:
            System.out.println("8 de Diamantes");
            break;
            
            case 9:
            System.out.println("9 de Diamantes");
            break;
            
            case 10:
            System.out.println("10 de Diamantes");
            break;
            
            case 11:
            System.out.println("J de Diamantes");
            break;
            
            case 12:
            System.out.println("Q de Diamantes");
            break;
            
            case 13:
            System.out.println("K de Diamantes");
            break;
          }
        
        break;
        
          case 4: //Treboles
          int cartaTreboles = (int)(Math.random()*13) + 1;
          switch (cartaTreboles) {
            
            case 1:
            System.out.println("As de Treboles");
            break;
            
            case 2:
            System.out.println("2 de Treboles");
            break;
            
            case 3:
            System.out.println("3 de Treboles");
            break;
            
            case 4:
            System.out.println("4 de Treboles");
            break;
            
            case 5:
            System.out.println("5 de Treboles");
            break;
            
            case 6:
            System.out.println("6 de Treboles");
            break;
            
            case 7:
            System.out.println("7 de Treboles");
            break;
            
            case 8:
            System.out.println("8 de Treboles");
            break;
            
            case 9:
            System.out.println("9 de Treboles");
            break;
            
            case 10:
            System.out.println("10 de Treboles");
            break;
            
            case 11:
            System.out.println("J de Treboles");
            break;
            
            case 12:
            System.out.println("Q de Treboles");
            break;
            
            case 13:
            System.out.println("K de Treboles");
            break;
          }
        
        break;

        }
    }
  }
