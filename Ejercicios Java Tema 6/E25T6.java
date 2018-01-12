/**
 * Ejercicio 25: Programa que muestra 100 numeros aleatorios entre 10 y 200
 * ambos incluidos y que los numeros primos deben aparecer entre almohadillas
 * y los multiplos de 5 entre corchetes.
 * 
 * @author Adán
 */

  public class E25T6 { // Clase principal
  public static void main(String[] args) {
    int num;
    boolean primo;
    int cont;
    for (int i = 0; i < 100; i++) {
      num = (int) (Math.random() * (200 - 10 + 1) + 10);
      cont = 2;
      primo = true;
      while (cont < num) {
        if (num % cont == 0) {
          primo = false;
        }
        cont++;
      }
      if (primo) {
        System.out.print("#" + num + "# ");
      } else if (num % 5 == 0) {
        System.out.print("[" + num + "] ");   
      } else {
        System.out.print(num + " ");
      }
    }
  }
}

    
