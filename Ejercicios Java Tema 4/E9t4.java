/**
 * Ejercicio 9: Programa que resuelve una ecuación de segundo grado
 * 
 * @author Adán
 */

public class E9t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce el valor de la variable a");
  double variableA = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce el valor de la variable b");
  double variableB = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce el valor de la variable c");
  double variableC = Integer.parseInt( System.console().readLine());
  
  double Bnegativo;
  Bnegativo = (variableB - variableB - variableB);
  double discriminante;
  discriminante = ((variableB * variableB) - (4 * variableA * variableC));
  if ((discriminante < 0)) {
    System.out.println("La raiz de un nº negativo no existe");
  } else if ((variableA == 0) && (variableB == 0) && (variableC == 0)){
    System.out.println("La ecuación es una identidad");
  } else if ((variableA != 0) && (variableB != 0) && (variableC == 0)){
    System.out.println("X1 = 0");
  } else if ((variableA != 0) && (variableB != 0) && (variableC != 0)){
  double valorXmas;
  valorXmas = ((Bnegativo + (Math.sqrt(discriminante))) / (2 * variableA));
  double valorXmenos;
  valorXmenos = ((Bnegativo - (Math.sqrt(discriminante))) / (2 * variableA));
  System.out.println(valorXmas + " y " + valorXmenos + " Son los resultados de la ecuacion de 2º grado");
}


  }
}
