/**
 * Ejercicio 3: Programa que muestra al azar el nombre de una carta de la baraja
 * Española.
 * @author Adán
 */

  public class E3T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Vamos a elegir una carta de la baraja Española:");
      
      int palo = (int)(Math.random()*4) + 1;
    
      switch (palo) {
      
        case 1: //ORO
        int cartaOro = (int)(Math.random()*10) + 1;
          switch (cartaOro) {
            
            case 1:
            System.out.println("As de Oro");
            break;
            
            case 2:
            System.out.println("2 de Oro");
            break;
            
            case 3:
            System.out.println("3 de Oro");
            break;
            
            case 4:
            System.out.println("4 de Oro");
            break;
            
            case 5:
            System.out.println("5 de Oro");
            break;
            
            case 6:
            System.out.println("6 de Oro");
            break;
            
            case 7:
            System.out.println("7 de Oro");
            break;
            
            case 8:
            System.out.println("Sota de Oro");
            break;
            
            case 9:
            System.out.println("Caballo de Oro");
            break;
            
            case 10:
            System.out.println("Rey de Oro");
            break;
            
          }
        
        break;
      
          case 2: //COPAS
          int cartaCopas = (int)(Math.random()*10) + 1;
          switch (cartaCopas) {
            
            case 1:
            System.out.println("As de Copas");
            break;
            
            case 2:
            System.out.println("2 de Copas");
            break;
            
            case 3:
            System.out.println("3 de Copas");
            break;
            
            case 4:
            System.out.println("4 de Copas");
            break;
            
            case 5:
            System.out.println("5 de Copas");
            break;
            
            case 6:
            System.out.println("6 de Copas");
            break;
            
            case 7:
            System.out.println("7 de Copas");
            break;
            
            case 8:
            System.out.println("Sota de Copas");
            break;
            
            case 9:
            System.out.println("Caballo de Copas");
            break;
            
            case 10:
            System.out.println("Rey de Copas");
            break;
            
          }
        
        break;
        
          case 3: //BASTO
          int cartaBasto = (int)(Math.random()*10) + 1;
          switch (cartaBasto) {
            
            case 1:
            System.out.println("As de Basto");
            break;
            
            case 2:
            System.out.println("2 de Basto");
            break;
            
            case 3:
            System.out.println("3 de Basto");
            break;
            
            case 4:
            System.out.println("4 de Basto");
            break;
            
            case 5:
            System.out.println("5 de Basto");
            break;
            
            case 6:
            System.out.println("6 de Basto");
            break;
            
            case 7:
            System.out.println("7 de Basto");
            break;
            
            case 8:
            System.out.println("Sota de Basto");
            break;
            
            case 9:
            System.out.println("Caballo de Basto");
            break;
            
            case 10:
            System.out.println("Rey de Basto");
            break;

          }
        
        break;
        
          case 4: //ESPADAS
          int cartaEspadas = (int)(Math.random()*10) + 1;
          switch (cartaEspadas) {
            
            case 1:
            System.out.println("As de Espadas");
            break;
            
            case 2:
            System.out.println("2 de Espadas");
            break;
            
            case 3:
            System.out.println("3 de Espadas");
            break;
            
            case 4:
            System.out.println("4 de Espadas");
            break;
            
            case 5:
            System.out.println("5 de Espadas");
            break;
            
            case 6:
            System.out.println("6 de Espadas");
            break;
            
            case 7:
            System.out.println("7 de Espadas");
            break;
            
            case 8:
            System.out.println("Sota de Espadas");
            break;
            
            case 9:
            System.out.println("Caballo de Espadas");
            break;
            
            case 10:
            System.out.println("Rey de Espadas");
            break;
            
          }
        
        break;

        }
    }
  }
