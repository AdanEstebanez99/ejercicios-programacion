/**
 * Ejercicio 42: Programa que a partir de un numero entero positivo introducido 
 * por teclado te calcula los 5 siguientes numeros y te dice si son primos o no.
 * 
 * @author Adán
 */

  public class E42T5 { // Clase principal
  public static void main(String[] args) {
    boolean primo = true;
    System.out.print("Introduce el numero ");
    int num = Integer.parseInt(System.console().readLine());
    int cont = 0;
    while (cont < 5) {
      System.out.print(num);
      primo = true;
      for (int i = 2; i < num; i++){
        if (num%i == 0){
          primo = false;
        }
      }
      if (primo){
        System.out.println(" es primo.");
      } else {
        System.out.println(" no es primo.");
      }
      num++;  
      cont ++;
    } 
  }
}
    
