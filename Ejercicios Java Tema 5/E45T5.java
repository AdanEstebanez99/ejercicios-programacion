/**
 * Ejercicio 45: Programa igual que el ejercicio 46 solo que cuenta los digitos
 * de izquierda a derecha.
 * 
 * @author Adán
 */

  public class E45T5 { // Clase principal
  public static void main(String[] args) {
  System.out.print("Introduce el numero: ");
    int numUs = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce la posicion de dígito que quiere cambiar: ");
    int pos = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el dígito: ");
    int dig = Integer.parseInt(System.console().readLine());
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
    num1 = ((num1*10) + dig);
    numReves /=10;
    while (pos < numDig){
      num1 = ((num1*10) + (numReves % 10));
      numReves /=10;
      pos++;
    }
    System.out.print("El número resultante es "+num1);
  }
}
