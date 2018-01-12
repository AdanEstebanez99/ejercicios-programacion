/**
 * Ejercicio 13: Programa que rellene un array con 100 numeros comprendidos
 * entre 0 y 500 y que a continuacion pregunte si quiere ver el maximo o el
 * minimo y el programa volvera a escribir el array conla opcion elegida
 * destacandola entre asteriscos.
 * 
 * @author Adán
 */

  public class E13T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[100];
    int numero;
    int i = 0;
    long mayor = 0;
    long menor = 9999999;
    
    System.out.println("Numeros aleatorios generados");
    System.out.println();
    
    for (i = 0; i < 100; i++) {
      numero = (int)(Math.random() * 501);
      n [i] = numero;
      System.out.print(numero + " ");
      
      if (mayor <= numero) {
        mayor = numero;
      }
      
      if (menor >= numero) {
        menor = numero;
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("¿Que numero quieres ver?");
    System.out.println("a)Mayor      b)Menor");
    System.out.println();
    String respuesta = (System.console().readLine().toLowerCase());
    
    if (respuesta.equals ("a")) {
      
      for (i = 0; i < 100; i++) {
          
          if (n[i] == mayor) {
            System.out.print("**"+n[i]+"** ");
          } else {
            System.out.print(n[i]+" ");
          }
      }
    }
    if (respuesta.equals ("b")) {
      for (i = 0; i < 100; i++) {
          
          if (n[i] == menor) {
            System.out.print("**"+n[i]+"** ");
          } else {
            System.out.print(n[i]+" ");
          }
      }
    }
    
    
  }
}
    


    
