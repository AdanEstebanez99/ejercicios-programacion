/**
 * Ejercicio 12: Examen tipo test que te da la puntuación.
 * 
 * @author Adán
 */

public class E12t4 { // Clase principal
  public static void main(String[] args) {
  System.out.println("Pregunta 1: El sistema de numeración binario esta formado por...");
  System.out.println("a) 1 y 2     b) 0 y 1");
  System.out.println("c) 9 y 5     d) dragones y mazmorras");
  String respuesta1 = ( System.console().readLine(). toLowerCase());
  int notatotal = 0;
   
  if (respuesta1.equals("b")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 2: ¿Como se llama la mascota de Linux?");
  System.out.println("a) Tux     b) Rodrigo Piruleta");
  System.out.println("c) Timmy   d) A ti que te importa");
  String respuesta2 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta2.equals("a")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 3: ¿Cual de estas NO es una etiqueta de HTML?");
  System.out.println("a) <strong>     b) <em>");
  System.out.println("c) <p>          d) <blabla>");
  String respuesta3 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta3.equals("d")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 4: ¿Cuanto vale 1Mb en Kb?");
  System.out.println("a) 1024Kb    b) 888888Kb");
  System.out.println("c) dosKb     d) Muchos Numeros");
  String respuesta4 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta4.equals("a")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 5: ¿Cual es el simbolo de Java?");
  System.out.println("a) Una Tetera    b) Una Cuchara");
  System.out.println("c) Un Cucharon   d) Una Taza");
  String respuesta5 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta5.equals("d")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 6: ¿Que es la mascota de Linux?");
  System.out.println("a) Un lobo    b) Un dragon");
  System.out.println("c) Un animal  d) Un pinguino");
  String respuesta6 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta6.equals("d")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 7: ¿Qué es linux?");
  System.out.println("a) Un Sistema Operativo    b) Batman");
  System.out.println("c) Un Hardware moderno     d) Un ordenador antiguo");
  String respuesta7 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta7.equals("a")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 8: ¿Que programa usamos en HTML?");
  System.out.println("a) Sensational text    b) Increible text");
  System.out.println("c) Sublime text        d) Ningun text");
  String respuesta8 = ( System.console().readLine(). toLowerCase());
  if (respuesta8.equals("c")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 9: ¿Qué programa es muy usado en base de datos?");
  System.out.println("a) Super Ultra DB    b) Virtual Machine");
  System.out.println("c) Nose DB           d) My SQL");
  String respuesta9 = ( System.console().readLine(). toLowerCase());
  
  if (respuesta9.equals("d")){
    notatotal = (notatotal + 1);
  }
  System.out.println("Pregunta 10: ¿Como se llama el creador de Linux?");
  System.out.println("a) Linus Torvalds    b) Peter Pan");
  System.out.println("c) Linux Tux         d) Don Linux");
  String respuesta10 = ( System.console().readLine(). toLowerCase());
  if (respuesta10.equals("a")){
    notatotal = (notatotal + 1);
  }
  System.out.println(notatotal + " Es tu nota total");

  }
}
