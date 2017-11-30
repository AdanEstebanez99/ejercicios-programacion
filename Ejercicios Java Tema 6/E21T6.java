/**
 * Ejercicio 21: Programa que simula el lanzamiento de una secuencias de monedas
 * al aire y te dice cara o cruz.
 * 
 * @author Adán
 */

  public class E21T6 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Simulacro de lanzamiento de 5 monedas:");
    int numMonedas = 8;
    int lanzadas = 5;
    String posicion = "";
    String moneda = "";
    for (int i = 0; i < lanzadas; i++){
      int numPosicion = (int)(Math.random() * 2) + 1;
      switch (numPosicion){
        case 1:
          posicion = "cara";
          break;
        case 2:
          posicion = "cruz";
          break;
      }
      int valorMoneda = (int)(Math.random() * 7) + 1;
      switch (valorMoneda){
        case 0:
          moneda = "1 céntimo";
          break;
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "5 céntimos";
          break;
        case 3:
          moneda = "10 céntimos";
          break;
        case 4:
          moneda = "20 céntimos";
          break;
        case 5:
          moneda = "50 céntimos";
          break;
        case 6:
          moneda = "1 Euro";
          break;
        case 7:
          moneda = "2 Euros";
          break;
      }
      System.out.println(moneda + " - " + posicion);
    }
  }
}


    
