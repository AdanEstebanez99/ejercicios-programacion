/**
 * Ejercicio 11: Pide la hora con minutos y te dice los segundos que faltan hasta media noche
 * 
 * @author Adán
 */

public class E11t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Por favor introduce la hora de la hora");
  int hora = Integer.parseInt( System.console().readLine());
  
  System.out.println("Por favor introduce los minutos de la hora");
  int minutos = Integer.parseInt( System.console().readLine());
  
  int difHoras;
  difHoras = (24 - hora);
  
  int difMinutos;
  difMinutos = (60 - minutos);
  
  if ((difMinutos >= 1) && (difMinutos <= 59)) {
    int horaConMinuto;
    horaConMinuto = (difHoras - 1);
    int segundosConMinutos;
    segundosConMinutos = (horaConMinuto * 3600);
    int MinutosSegundos;
    MinutosSegundos = (difMinutos * 60);
    System.out.println((segundosConMinutos + MinutosSegundos) +" Son los segundos que quedan hasta medianoche");
  }
  if ((difMinutos == 0)) {
  System.out.println((difHoras * 60) + " Son los segundos que quedan hasta medianoche");
}

  }
}
