/**
 * Ejercicio 43: Programa que parte un numero en dos partes.
 * 
 * 
 * @author Adán
 */

  public class E43T5 { // Clase principal
  public static void main(String[] args) {
  System.out.print("Introduce el numero: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posicion a partir de la cual quieres que parta el número: ");
    int pos = Integer.parseInt(System.console().readLine());
    int numBasura = numUs;
    int numDig = 0;
    int numReves = 0;
    while (numBasura > 0){
      numReves = ((numReves*10) + (numBasura % 10));
      numBasura /=10;
      numDig++;
    }
    int num1 = 0;
    for (int i = 1; i < pos; i++){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
    }
    int num2 = 0;
    for (int i = pos; pos <= numDig; pos++){
      num2 = ((num2*10) + (numReves % 10));
      numReves /=10;
    }
    System.out.print("Los números partidos son el "+num1+" y el "+num2);
  }
}
