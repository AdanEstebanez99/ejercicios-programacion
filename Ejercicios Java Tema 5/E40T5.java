/**
 * Ejercicio 40: Programa que dibuja un rombo hueco según una altura introducida
 * , aunque esta debe ser un numero impar mayor que tres.
 * 
 * @author Adán
 */

public class E40T5 { // Clase principal
public static void main(String[] args) {
    System.out.print("Introduce la altura (numero impar mayor o igual que 3): ");    
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = alturaIntroducida / 2;
    int hueco = 0;
    if ((alturaIntroducida < 3) || ((alturaIntroducida % 2) == 0)){
      System.out.print("Error, Introduce un numero correcto");
    } else {
        //parte superior del rombo
        while (altura <= alturaIntroducida / 2 + 1){
          for (int i = 1 ; i <= espacios ; i ++){
            System.out.print(" ");
            }
          System.out.print("*");
          
          for (int i = 1 ; i < hueco ; i ++){
            System.out.print(" ");
            }
          if (altura > 1){
          System.out.print("*");
            }
          System.out.println();
          altura ++;
          espacios --;
          hueco += 2;
        }
        //Parte inferior del rombo
        hueco = alturaIntroducida - 3;
        espacios = 1;
        altura = 0;
        while (altura < alturaIntroducida / 2){
          for (int i = 1 ; i <= espacios ; i ++){
            System.out.print(" ");
            }
          System.out.print("*");
          
          for (int i = 1 ; i < hueco ; i ++){
            System.out.print(" ");
          }
          if (altura < alturaIntroducida / 2 - 1){ 
            System.out.print("*");
            }
          System.out.println();
          altura ++;
          espacios ++;
          hueco -= 2;
        }
      }
  }
}
