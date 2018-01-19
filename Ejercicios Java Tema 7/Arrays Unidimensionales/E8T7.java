/**
 * Ejercicio 8: Programa que a partir de los datos introducidos por el usuario
 * pinta un diagrama de barras con la temperatura media de cada mes del año.
 * 
 * @author Adán
 */

  public class E8T7 { // Clase principal
  public static void main(String[] args) {
    
    String[] meses = new String[12];
    meses[0] = "enero";
    meses[1] = "febrero";
    meses[2] = "marzo";
    meses[3] = "abril";
    meses[4] = "mayo";
    meses[5] = "junio";
    meses[6] = "julio";
    meses[7] = "agosto";
    meses[8] = "septiembre";
    meses[9] = "octubre";
    meses[10] = "noviembre";
    meses[11] = "diciembre";
    
    int[] temperatura = new int[12];
    
    for (int i = 0; i < 12; i++) {
      
      System.out.println("Introduce la temperatura media de " + meses[i] + ": ");
      temperatura[i] = Integer.parseInt(System.console().readLine());
    }
    
      System.out.println();
    
    int a = 0;
    
    for (int i = 0; i < 12; i++) {
      
      System.out.print(meses[i] + ": ");
      
      for (int r = 0; r < temperatura[a]; r++) {
        System.out.print("\033[31m**");
      }
      
       System.out.println("\033[37m");
      
      a++;
    }
  }
}


    
