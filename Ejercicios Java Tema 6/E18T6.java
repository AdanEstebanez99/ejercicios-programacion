/**
 * Ejercicio 18: Programa que te dice tres colores aleatorios para pintar tres
 * habitaciones, y estos no se pueden repetir.
 * 
 * @author Adán
 */

  public class E18T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Voy a decirte tres colores para tus habitaciones:");
    int habitacion1 = (int)(Math.random() * 6) + 1;
    int habitacion2 = (int)(Math.random() * 6) + 1;
    int habitacion3 = (int)(Math.random() * 6) + 1;
    
    while ((habitacion1 == habitacion2) || (habitacion1 == habitacion3) || (habitacion2 == habitacion3)) {
      habitacion1 = (int)(Math.random() * 6) + 1;
      habitacion2 = (int)(Math.random() * 6) + 1;
      habitacion3 = (int)(Math.random() * 6) + 1;
    }
      switch (habitacion1) {
        case 1:
        System.out.println("Habitacion 1: rojo");
        break;
        
        case 2:
        System.out.println("Habitacion 1: azul");
        break;
        
        case 3:
        System.out.println("Habitacion 1: verde");
        break;
        
        case 4:
        System.out.println("Habitacion 1: amarillo");
        break;
        
        case 5:
        System.out.println("Habitacion 1: violeta");
        break;
        
        case 6:
        System.out.println("Habitacion 1: naranja");
        break;
      }
      
      switch (habitacion2) {
        case 1:
        System.out.println("Habitacion 2: rojo");
        break;
        
        case 2:
        System.out.println("Habitacion 2: azul");
        break;
        
        case 3:
        System.out.println("Habitacion 2: verde");
        break;
        
        case 4:
        System.out.println("Habitacion 2: amarillo");
        break;
        
        case 5:
        System.out.println("Habitacion 2: violeta");
        break;
        
        case 6:
        System.out.println("Habitacion 2: naranja");
        break;
      }
      
      switch (habitacion3) {
        case 1:
        System.out.println("Habitacion 3: rojo");
        break;
        
        case 2:
        System.out.println("Habitacion 3: azul");
        break;
        
        case 3:
        System.out.println("Habitacion 3: verde");
        break;
        
        case 4:
        System.out.println("Habitacion 3: amarillo");
        break;
        
        case 5:
        System.out.println("Habitacion 3: violeta");
        break;
        
        case 6:
        System.out.println("Habitacion 3: naranja");
        break;
      }
    }
  }


    
