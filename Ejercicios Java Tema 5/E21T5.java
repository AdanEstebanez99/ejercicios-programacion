/**
 * Ejercicio 21: Programa que va pidiendo numeros hasta que se introduzca un
 * numero negativo y te diga la media de los impares y el mayor de los pares.
 * 
 * @author Adán
 */

public class E21T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Ve introduciendo numeros y cuando desees parar introduce");
  System.out.println("Un numero negativo");
  
  double contador = 0;
  double numero = 0;
  double suma = 0;
  double contadorImpar = 0;
  double media1 = 0;
  double parMayor = 0;
  
  while (numero >= 0){
    numero = Double.parseDouble( System.console().readLine());
    if ((numero % 2) != 0) {
      suma += numero;
      media1 = suma / contadorImpar;
      contadorImpar ++;
    } else {
        if (numero > parMayor){
           parMayor = numero;
        }
    }
    contador ++;
   }
  System.out.println("Has introducido "+contador+" numeros");
  System.out.println("La media de los numeros impares y el mayor par es: "+ (suma + parMayor) / contadorImpar);
  System.out.println("El numero par mayor es: "+parMayor);
  
 }
 }

