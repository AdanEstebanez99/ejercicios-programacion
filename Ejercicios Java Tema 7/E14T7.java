/**
 * Ejercicio 14: Programa que pide 8 palabras y despues te las ordena mostrando
 * primero las palabras que se refieran a colores.
 * 
 * @author Adán
 */

  public class E14T7 { // Clase principal
  public static void main(String[] args) {
    
    String[] colores = new String[9];
    colores[0] = ("verde");
    colores[1] = ("rojo");
    colores[2] = ("azul");
    colores[3] = ("amarillo");
    colores[4] = ("naranja");
    colores[5] = ("rosa");
    colores[6] = ("negro");
    colores[7] = ("blanco");
    colores[8] = ("morado");
    String[] palabras = new String[8];
    String[] coloresDichos = new String[8];
    String[] palabrasRestantes = new String[8];
    int numero;
    int i = 0;
    int j = 0;
    int m = 0;
    int contadorColores = 0;
    int contadorPalabras = 0;
    
    System.out.println("Introduce 8 palabras seguidas (al menos un color)");
    
    for (i = 0; i < 8; i ++) {
      String respuesta = (System.console().readLine().toLowerCase());
      palabras[i] = respuesta;
      
      for (j = 0; j < 8; j ++) {
        
        if (respuesta.equals (colores[j])) {
          coloresDichos[j] = respuesta;
          contadorColores ++;
        } else {
            palabrasRestantes[j] = respuesta;
            contadorPalabras ++;
        }
      }
    }
    System.out.println();
    System.out.println("Array Original:");
    System.out.println();
    
    for (i = 0; i < 8; i ++) {
      System.out.print(palabras[i]+"  ");
    }
    System.out.println();
    System.out.println();
    System.out.println("Array Cambiado:");
    System.out.println();
    
    for (int x = 0; x < contadorColores; x ++) {
      System.out.print(coloresDichos[x]+" ");
    }
    for (int k = 0; k < contadorPalabras; k ++) {
      System.out.print(palabrasRestantes[k]+" ");
    }
  }
}
    


    
