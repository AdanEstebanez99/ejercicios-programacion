/**
 * Ejercicio4Examen1: Gusano que come numeros (0 y 8) y si no come lo indica
 * 
 * @author Adán
 */

public class Ejercicio4Examen1 { // Clase principal
public static void main(String[] args) {
System.out.println("Introduce un numero:");
  int numero= Integer.parseInt( System.console().readLine());
  int volteado = 0;
  int volteado2 = 0;
  boolean comer = true;
  
  while (numero > 0) {
    volteado = ((volteado * 10) + (numero % 10));
    numero /= 10;
    if ((volteado % 10 == 0) || (volteado % 10 == 8)) {
    volteado /= 10;
    comer = true;
    } else {
      comer = false;
    }
  }
  while (volteado > 0) {
    volteado2 = ((volteado2 * 10) + (volteado % 10));
    volteado /= 10;
  }
  if (comer = true) {
  System.out.println("El gusano se ha comido los numeros 8 y 0 y el resultado es: "+volteado2);
  } 
  if (comer = false) {
  System.out.println("El gusano no se ha comido ningun numero "+numero);
  }
}
}

