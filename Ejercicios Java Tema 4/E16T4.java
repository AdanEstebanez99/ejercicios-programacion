/**
 *Ejercicio 16: Test de Fidelidad
 * @author Adán
 */

public class E16T4 { // Clase principal
  public static void main(String[] args) {
    String respuesta;
    int puntos = 0;
    System.out.println("Test de Fidelidad");
    System.out.println("Escribe V(verdadero) o F(falso) para responder a las siguientes preguntas");
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("2. Ha aumentado sus gastos de vestuario: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }  
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("9. Has notado que últimamente se perfuma más: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigov: \n");
    respuesta = System.console().readLine().toLowerCase();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    if ( puntos <= 10 ) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel. Mejor ve revisando esa autoestima, posible clave de tu desconfianza.");
    }
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia. De hecho, yo iría pillando calcio, nunca se sabe...");    
    }
    if ( puntos >= 22 ) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza, y sino, contacto 0 y apúntate al gym.");
    }
  }
}
  
