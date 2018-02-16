/*
 *Ejercicio 4 del tema 9: Ejercicio de la clase UsaFraccion.
 *
 * @author Adan
 */
package E4T9;

public class UsaFraccion {
    private int signo;
    private int numerador;
    private int denominador;

    public UsaFraccion(int n, int d) {
        if (d == 0) {
            System.out.println("El numero 0 no puede ser el denominador en una fraccion");
        } else {
            if (n*d < 0) {
                this.signo = -1;
            } else {
                this.signo = 1;
            }
            this.numerador = Math.abs(n);
            this.denominador = Math.abs(d);
        }
    }
    int getNumerador() {
        return this.numerador;
    }
    int getDenominador() {
        return this.denominador;
    }
    public String toString() {
        if (signo == -1) {
            return "-" + this.numerador + "/" + this.denominador;
        } else {
            return this.numerador + "/" + this.denominador;
        }
    }
    
    //Aqui invertimos la fraccion:
    
    public UsaFraccion invertir() {
        return new UsaFraccion(this.signo * this.denominador, this.numerador);
    }
    
    //Aqui se multiplica la fraccion por un numero:
    
    public UsaFraccion multiplicar(int n) {
        return new UsaFraccion(this.signo * this.numerador * n, this.denominador);
    }
    
    //Aqui se multiplica la fraccion por otra fraccion establecida como parametro:
    
    public UsaFraccion multiplicar(UsaFraccion f) {
        return new UsaFraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
    }
    
    //Aqui se divide la fraccion por un numero:
    
    public UsaFraccion dividir(int n) {
        return new UsaFraccion(this.signo * this.numerador, this.denominador * n);
    }

    //Aqui se divide la fraccion con otra fraccion establecida como parametro:
    
    public UsaFraccion divide(UsaFraccion f) {
        return new UsaFraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
    }

    //Aqui se simplifica la fraccion:
    
    public UsaFraccion simplificar() {
        int s = this.signo;
        int n = this.numerador;
        int d = this.denominador;
        
        for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
            while (((n % i) == 0) && ((d % i) == 0)) {
                n /= i;
                d /= i;
            }
        }
        return new UsaFraccion(s * n, d);
    }
}
