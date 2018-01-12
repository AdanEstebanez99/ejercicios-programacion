/**
 * Ejercicio 16: Programa que genera 20 numeros entre 0 y 400 y despues el 
 * programa pregunta si queremos resaltar los numeros multiplos de 5 o multiplos
 * de 7, y estos se resaltaran entre corchetes.
 * 
 * @author Adán
 */

  public class E16T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[20];
    int numero;
    
    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 401);
      n[i] = numero;
      System.out.print(numero + " ");
    }
    
    System.out.println();
    System.out.println("¿Qué números quieres resaltar? (1 - Múltiplos de 5, 2 - Múltiplos de 7): ");
    int respuesta = Integer.parseInt(System.console().readLine());
    
    switch (respuesta) {
      case 1:
      
        for (int i = 0; i < 20; i++) {
          
          if (n[i] % 5 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
         
      case 2:
        
         for (int i = 0; i < 20; i++) {
          
          if (n[i] % 7 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
       }
     }
}
