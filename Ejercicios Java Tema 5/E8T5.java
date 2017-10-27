/**
 * Ejercicio 8: Tabla de Multiplicar de un número introducido por teclado.
 * 
 * @author Adán
 */

public class E8T5 { // Clase principal
public static void main(String[] args) {
  System.out.println("Introduce un numero para hacerte la tabla de multiplicar");
    int tablaMulti = Integer.parseInt( System.console().readLine());
  for (int i = 0; i <= 10; i++) {
    System.out.println((i * tablaMulti) +" Es el resultado de "+tablaMulti+" x " + i);
  }
  }
}
