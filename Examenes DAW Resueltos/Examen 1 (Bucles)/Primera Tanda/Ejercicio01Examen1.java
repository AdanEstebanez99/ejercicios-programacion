/**
 * Ejercicio01Examen1: Factura coche electrico Ñesla.
 * 
 * 
 * @author Adán
 */

  public class Ejercicio01Examen1 { // Clase principal
  public static void main(String[] args) {
    System.out.println("Seleccione el modelo de coche:");
    System.out.println("a)Modelo 5   b)Modelo 8");
    String modelo = System.console().readLine().toLowerCase();
    
    if (modelo.equals ("a")) {
      System.out.println("Seleccione el tipo de bateria:");
      System.out.println("a)50 kWh   b)70 kWh");
      String tBateria5 = System.console().readLine().toLowerCase();
      if (tBateria5.equals ("a")) {
        double precioBase = 30000;
        double bateria = 50 * 125;
        double total = precioBase + bateria;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 5");
        System.out.println("Precio Base : 30000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
      if (tBateria5.equals ("b")) {
        double precioBase = 30000;
        double bateria = 70 * 125;
        double total = precioBase + bateria;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 5");
        System.out.println("Precio Base : 30000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
    }
    if (modelo.equals ("b")) {
      System.out.println("Seleccione el tipo de bateria:");
      System.out.println("a)80 kWh   b)120 kWh");
      String tBateria8 = System.console().readLine().toLowerCase();
      if (tBateria8.equals ("a")) {
        System.out.println("¿Quiere el modelo de conducción autonoma?:");
        System.out.println("a)si   b)no");
        String conduAuto = System.console().readLine().toLowerCase();
        
        if (conduAuto.equals ("a")) {
        double precioBase = 36000;
        double bateria = 80 * 125;
        double total = precioBase + bateria + 1800;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Precio Conducción Autonoma: 1800 €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
       }
       
       if (conduAuto.equals ("b")) {
        double precioBase = 36000;
        double bateria = 80 * 125;
        double total = precioBase + bateria;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
      }
      }
      if (tBateria8.equals ("b")) {
        System.out.println("¿Quiere el modelo de conducción autonoma?:");
        System.out.println("a)si   b)no");
        String conduAuto2 = System.console().readLine().toLowerCase();
        
        if (conduAuto2.equals ("a")) {
        double precioBase = 36000;
        double bateria = 120 * 125;
        double total = precioBase + bateria + 1800;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
        System.out.println("Gracias, aqui tiene el presupuesto de su coche: ");
        System.out.println("Modelo : Ñesla Modelo 8");
        System.out.println("Precio Base : 36000.00 €");
        System.out.println("Precio Bateria : "+bateria+" €");
        System.out.println("Precio Conducción Autonoma: 1800 €");
        System.out.println("Descuento Gobierno : -"+descGobierno+" €");
        System.out.println("Precio Final : "+totalDescuento+" €");
       }
       
       if (conduAuto2.equals ("b")) {
        double precioBase = 36000;
        double bateria = 120 * 125;
        double total = precioBase + bateria;
        double descGobierno = (5 * total) / 100;
        double totalDescuento = total - descGobierno;
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
 }


    
    

