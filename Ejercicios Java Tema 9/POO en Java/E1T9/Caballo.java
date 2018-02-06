/*Ejercicio 1 del tema 9: Definición de la clase Caballo.
 * 
 * @author adane
 */
package E1T9;

public class Caballo {

    String raza;

    String nombre;

    double peso; //peso en kilos 

    int altura;  //altura en centimentros

    String color;

    int velocidad = 0;

    Persona jinete;

    public Caballo(String nombre) {

        this.nombre = nombre;

    }

    public String getRaza() {

        return raza;

    }

    public String getNombre() {

        return nombre;

    }

    public double getPeso() {

        return peso;

    }

    public int getAltura() {

        return altura;

    }

    public String getColor() {

        return color;

    }

    public int getVelocidad() {

        return velocidad;

    }

    public void setRaza(String raza) {

        this.raza = raza;

    }

    public void setPeso(double peso) {

        this.peso = peso;

    }

    public void setAltura(int altura) {

        this.altura = altura;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;

    }

    public Persona getJinete() {

        return jinete;

    }

    public void setJinete(Persona jinete) {

        this.jinete = jinete;

    }

    @Override

    public String toString() {

        return "Caballo\n---------\n" + "Raza: " + raza + "\nNombre: " + nombre + "\nPeso: " + peso + "\nAltura: " + altura + "\nColor: " + color + "\nVelocidad: " + velocidad + "\nJinete :" + jinete;

    }

}
