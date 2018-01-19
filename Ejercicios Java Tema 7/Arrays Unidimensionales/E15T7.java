/**
 * Ejercicio 15: Funcionamiento de un Restaurante.
 * 
 * 
 * @author Adán
 */

  public class E15T7 { // Clase principal
  public static void main(String[] args) {
    
    int mesa;
    int[] ocupaciones = new int[11];
    boolean ocupada = false;
    boolean mesaVacia = false;
    boolean haySitio = true;
    int disponibilidad = 0;
    int plazasDisponibles;
  
  
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.print("│Mesa nº: ");
      for (int i = 1; i < 11; i++) {
        System.out.printf("│ %2d ", i);
      }
      System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación");
      for (int i = 1; i < 11; i++) {
        mesa = (int)(Math.random() * 5);
        ocupaciones[i] = mesa;
        System.out.printf("│ %2d ", mesa);
      }
      System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
  
  System.out.println("¿Cuántos son? ");
  int comensales = Integer.parseInt(System.console().readLine());
  
  switch (comensales) {
    case 1:
        
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntese en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 1) {
              ocupaciones[i] += 1;
              ocupada = true;
              System.out.println("Tendrá que compartir mesa. Siéntese en la mesa número " + i + ".");
              } else {
                disponibilidad++;
                
              }
            }
          }
      break;
    case 2:
      
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 2) {
              ocupaciones[i] += 2;
              ocupada = true;
              System.out.println("Tendrán que compartir mesa. Siéntense en la mesa número " + i + ".");
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    case 3:
    
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 3) {
              ocupaciones[i] += 3;
              ocupada = true;
              System.out.println("Tendrán que compartir mesa. Siéntense en la mesa número " + i + ".");
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    case 4:
        
        for (int i = 1; i < 11; i++) {
          
          if (ocupaciones[i] == 0) {
            mesaVacia = true;
          }
        }
        
        if (mesaVacia == true) {
          
          for (int i = 1; ocupada == false; i++) {
            if (ocupaciones[i] == 0) {
              ocupaciones[i] = comensales;
              ocupada = true;
              System.out.println("Por favor, siéntense en la mesa " + i + ".");
              }
            }
          }
            
        if (mesaVacia == false) {
          
          for (int i = 1; (ocupada == false) && (disponibilidad < 10); i++) {
            plazasDisponibles = 4 - ocupaciones[i];
            
            if (plazasDisponibles >= 4) {
              ocupaciones[i] += 4;
              ocupada = true;
              } else {
                disponibilidad++;
              }
            }
          }
      break;
    default:
      System.out.println("Lo siento, no admitimos grupos de " + comensales + " personas.");
      System.out.println("Haga grupos de 4 personas como máximo e inténtelo de nuevo.");
      break;
    }
    
    if (comensales <= 4) {
      
      if (disponibilidad == 10) {
        System.out.println("Lo siento, en estos momentos no queda sitio.");
        } else {
      
          System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
          System.out.print("│Mesa nº: ");
            for (int i = 1; i < 11; i++) {
              System.out.printf("│ %2d ", i);
            }
          System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
          System.out.print("│Ocupación");
            for (int i = 1; i < 11; i++) {
              System.out.printf("│ %2d ", ocupaciones[i]);
            }
          System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
        }
      }
    }
}
