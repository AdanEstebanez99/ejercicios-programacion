/**
 * Ejercicio 19: Programa que te diga 50 numeros entre el -100 y el 200 y te
 * diga el numero maximo de los pares, el minimo de los impares y la media de
 * los numeros generados.
 * 
 * @author Adán
 */

  public class E19T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Voy a decirte 50 numeros entre el -100 y el 200:");
    int numero = 0;
    int pares = 0;
    int maxPares = 0;
    int impares = 0;
    int minImpares = 0;
    int suma = 0;
    int numPar = 0;
    int numImpar = 0;
    
    for (int i = 1 ; i <= 50 ; i ++) {
      numero = (int)(Math.random() * 300) - 100;
      System.out.print(numero+"  ");
      suma += numero;
      
      if (numero % 2 == 0){
        numPar = numero;
        pares ++;
        if (numPar > numPar) {
          maxPares = numPar;
        }
      } else {
        numImpar = numero;
        impares ++;
        if (numImpar < numImpar) {
          minImpares = numImpar;
        }
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("Se han generado "+pares+" numeros pares");
    System.out.println("Se han generado "+impares+" numeros impares");
    System.out.println();
    System.out.println("El mayor numero de los pares vale: "+maxPares);
    System.out.println("El menor numero de los impares vale: "+minImpares);
    System.out.println();
    System.out.println("La media de los numeros generados vale: "+(suma/50));
    }
  }


    
