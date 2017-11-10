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
  
  while (numero > 0) {
    volteado = ((volteado * 10) + (numero % 10));
    numero /= 10;
    if ((volteado % 10 == 0) || (volteado % 10 == 8)) {
    volteado /= 10;
    volteado2 = ((numero * 10) + (volteado % 10));
    volteado /= 10;
    }
  }
  System.out.println(volteado2);
  
}
}

