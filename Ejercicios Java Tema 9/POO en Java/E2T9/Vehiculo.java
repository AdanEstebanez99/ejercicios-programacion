/*
 *Ejercicio 2 del tema 9: Definicion de la clase Vehiculo 
 *
 *
 * @author Adan
 */
package E2T9;

public class Vehiculo {

// atributos de las clases
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;

  // atributos de instancia
  
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }
}
        
