/**
 * Ejercicio 10: calcular la media de x numeros introducidos por teclado.
 * 
 * @author Adán
 */

public class E10T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce numeros para decirte la media de esos numeros");
  System.out.println("Cuando desees parar introduce un numero negativo");
  double contador = 0;
  double numero = 0;
  double suma = 0;
  
  while (numero >= 0){
    numero = Double.parseDouble( System.console().readLine());
    suma += numero;
    double media = suma / contador;
    contador ++;
   }
  System.out.println("Tu media es: "+ (((suma) - (numero)) / (contador - 1)));
  }
}
