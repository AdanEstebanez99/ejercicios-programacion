/**
 * Ejercicio 4: Programa que usa 3 arrays de 20 valores, el primero son numeros
 * aleatorios, el segundo es el cuadrado de eso numeros y el tercero son los
 * numeros al cubo.
 * 
 * @author Adán
 */

  public class E4T7 { // Clase principal
  public static void main(String[] args) {

    //Array Numero:
    int [] numero;
    numero = new int[20];
    
    for (int num = 0; num <= 19 ; num ++) {
      numero[num] = (int)(Math.random() * 100) + 1;
    
    //Array Cuadrado:
    int [] cuadrado;
    cuadrado = new int[20];
      cuadrado[num] = (numero[num] * numero[num]);
    
    //Array Cubo:
    int [] cubo;
    cubo = new int[20];
      cubo[num] = (numero[num] * numero[num] * numero[num]);
      System.out.println(num+"-Numero: "+numero[num]+"| Cuadrado: "+cuadrado[num]+"| Cubo: "+cubo[num]);
    }
  }
}


    
