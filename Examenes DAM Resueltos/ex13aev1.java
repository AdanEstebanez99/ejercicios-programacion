/**
 * Ex13aev1: Coches Ñesla.
 * 
 * 
 * @author Adán
 */

public class Ex13aev1 { // Clase principal
public static void main(String[] args) {
  System.out.println("Seleccione el modelo de coche:");
    System.out.println("a)Modelo 5   b)Modelo 8");
    String modelo = System.console().readLine().toLowerCase();
    if (respuesta.equals ("a")) {
      System.out.println("Seleccione el tipo de bateria:");
      System.out.println("a)50 kWh   b)70 kWh");
      String tBateria5 = System.console().readLine().toLowerCase();
      if (respuesta.equals ("a")) {
        int precioBase = 30000;
        int bateria = 50 * 125;
        int total = precioBase + bateria;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 5");
        System.out.println("Precio Base : 30000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
      if (respuesta.equals ("b")) {
        int precioBase = 30000;
        int bateria = 70 * 125;
        int total = precioBase + bateria;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 5");
        System.out.println("Precio Base : 30000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
    }
    if (respuesta.equals ("b")) {
      System.out.println("Seleccione el tipo de bateria:");
      System.out.println("a)80 kWh   b)120 kWh");
      String tBateria8 = System.console().readLine().toLowerCase();
      if (respuesta.equals ("a")) {
        System.out.println("¿Quiere el modelo de conducción autonoma?:");
        System.out.println("a)si   b)no");
        String conduAuto = System.console().readLine().toLowerCase();
        
        if (respuesta.equals ("a")) {
        int precioBase = 36000;
        int bateria = 80 * 125;
        int total = precioBase + bateria + 1800;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Precio Conducción Autonoma: 1800 €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
       }
       
       if (respuesta.equals ("b")) {
        int precioBase = 36000;
        int bateria = 80 * 125;
        int total = precioBase + bateria;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
      }
      if (respuesta.equals ("b")) {
        System.out.println("¿Quiere el modelo de conducción autonoma?:");
        System.out.println("a)si   b)no");
        String conduAuto = System.console().readLine().toLowerCase();
        
        if (respuesta.equals ("a")) {
        int precioBase = 36000;
        int bateria = 120 * 125;
        int total = precioBase + bateria + 1800;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Precio Conducción Autonoma: 1800 €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
       }
       
       if (respuesta.equals ("b")) {
        int precioBase = 36000;
        int bateria = 120 * 125;
        int total = precioBase + bateria;
        int descGobierno = (5 * total) / 100;
        int totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
      }
  }
}
