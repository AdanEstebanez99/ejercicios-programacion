package Funciones;

/**
 *
 * @author adane
 */
public class tratamiento {

  /**
   * Evalúa si un número <code>n</code> es capicúa o no.
   * <p>
   * Un número capicúa es aquel que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   *
   * @param n número a evaluar
   * @return <code>true</code> si el número es capicúa o <code>false</code> en
   * caso contrario.
   */
    
  public static Boolean esCapicua(long n) {
    return n == voltea(n);
  }

  /**
   * Evalúa si un número <code>n</code> es capicúa o no.
   * <p>
   * Un número capicúa es aquel que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   *
   * @param n número a evaluar
   * @return <code>true</code> si el número es capicúa o <code>false</code> en
   * caso contrario.
   */

  public static Boolean esCapicua(int n) {
    return esCapicua((long) n);
  }

  /**
   * Evalúa si un número <code>n</code> es primo o no.
   * <p>
   * Un número primo es un número natural mayor que 1 y divisible únicamente
   * entre el mismo y entre 1.
   *
   * @param n número a evaluar.
   * @return <code>true</code> si el número es primo o <code>false</code> en
   * caso contrario.
   */

  public static Boolean esPrimo(long n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Evalúa si un número <code>n</code> es primo o no.
   * <p>
   * Un número primo es un número natural mayor que 1 y divisible únicamente
   * entre el mismo y entre 1.
   *
   * @param n número a evaluar.
   * @return <code>true</code> si el número es primo o <code>false</code> en
   * caso contrario.
   */

  public static Boolean esPrimo(int n) {
    return esPrimo((long) n);
  }

  /**
   * Busca el número primo inmediato al número dado <code>n</code>.
   *
   * @param n número de referencia.
   * @return número primo inmediato.
   */

  public static long siguientePrimo(long n) {
    n++;
    while (!esPrimo(n)) {
      n++;
    }
    return n;
  }

  /**
   * Busca el número primo inmediato al número dado <code>n</code>.
   *
   * @param n número de referencia.
   * @return número primo inmediato.
   */

  public static int siguientePrimo(int n) {
    return (int) siguientePrimo((long) n);
  }

  /**
   * Calcula la potencia <code>exponente</code> de un número.
   *
   * @param base
   * @param exponente
   * @return <code>base</code>^<code>exponente</code>.
   */

  public static double potencia(int base, int exponente) {

    if (exponente < 0) {
      return 1 / potencia(base, -exponente);
    }
    if (exponente == 0) {
      return 1;
    }
    int n = 1;
    for (int i = 0; i < exponente; i++) {
      n = n * base;
    }
    return n;
  }

  /**
   * Cuenta cuantos dígitos tiene un número.
   *
   * @param n número a evaluar.
   * @return número de dígitos que tiene <code>n</code>.
   */

  public static int digitos(long n) {

    int i;
    for (i = 0; Math.abs(n) > 0; i++) {
      n /= 10;
    }
    return i;
  }

  /**
   * Cuenta cuantos dígitos tiene un número.
   *
   * @param n número a evaluar
   * @return número de dígitos que tiene <code>n</code>.
   */

  public static int digitos(int n) {
    return digitos((long) n);
  }

  /**
   * Da la vuelta a un número <code>n</code>.
   *
   * @param n número a voltear.
   * @return <code>n</code> invertido.
   */

  public static long voltea(long n) {
    long nuevo = 0;
    int dig = digitos(n);
    for (int i = 0; i < dig; i++) {
      nuevo = nuevo * 10 + n % 10;
      n /= 10;
    }
    return nuevo;
  }

  /**
   * Da la vuelta a un número <code>n</code>.
   *
   * @param n número a voltear.
   * @return <code>n</code> invertido.
   */

  public static int voltea(int n) {
    return (int) voltea((long) n);
  }

  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param n número a evaluar.
   * @param posicion posición dentro de <code>n</code>.
   * @return digito que está en la posición <code>posición</code> de
   * <code>n</code>.
   */

  public static long digitoN(long n, int posicion) {
    n = voltea(n);
    for (int i = 0; i < posicion; i++) {
      n /= 10;
    }
    return n % 10;
  }

  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param n número a evaluar.
   * @param posicion posición dentro de <code>n</code>.
   * @return digito que está en la posición <code>posición</code> de
   * <code>n</code>.
   */

  public static int digitoN(int n, int posicion) {
    return (int) digitoN((long) n, posicion);
  }

  /**
   * Devuelve la posición en la que se encuentra un dígito. Se empieza contando
   * por el 0 de izquierda a derecha.
   *
   * @param n número a evaluar.
   * @param digito dígito a buscar
   * @return int <code>posición</code> de la primera ocurrencia. <code>-1</code>
   * si no se encuentra dentro de <code>n</code>.
   */

  public static long posicionDeDigito(long n, int digito) {
    int i;
    for (i = 0; (i < digitos(n)) && (digitoN(n, i) != digito); i++) {
    }
    return i == digitos(n) ? i : -1;
  }

  /**
   * Devuelve la posición en la que se encuentra un dígito. Se empieza contando
   * por el 0 de izquierda a derecha.
   *
   * @param n número a evaluar.
   * @param digito dígito a buscar
   * @return int <code>posición</code> de la primera ocurrencia. <code>-1</code>
   * si no se encuentra dentro de <code>n</code>.
   */

  public static int posicionDeDigito(int n, int digito) {
    return (int) posicionDeDigito((long) n, digito);
  }

  /**
   * Le quita a un número <code>n</code> la <code>cantidad</code> de dígitos por
   * detrás (por la derecha).
   *
   * @param n número a evaluar.
   * @param cantidad cantidad de dígitos a eliminar
   * @return <code>n</code> con los dígitos quitados.
   */

  public static long quitaPorDetras(long n, int cantidad) {
    for (int i = 0; i < cantidad; i++) {
      n /= 10;
    }
    return n;
  }

  /**
   * Le quita a un número <code>n</code> la <code>cantidad</code> de dígitos por
   * detrás (por la derecha).
   *
   * @param n número a evaluar.
   * @param cantidad cantidad de dígitos a eliminar
   * @return <code>n</code> con los dígitos quitados.
   */

  public static int quitaPorDetras(int n, int cantidad) {
    return (int) quitaPorDetras((long) n, cantidad);
  }



  /**
   * Le quita a un número <code>n</code> la <code>cantidad</code> de dígitos por
   * delante (por la izquierda).
   *
   * @param n número a evaluar.
   * @param cantidad cantidad de dígitos a eliminar
   * @return <code>n</code> con los dígitos quitados.
   */

  public static long quitaPorDelante(long n, int cantidad) {
    n = voltea(n);
    for (int i = 0; i < cantidad; i++) {
      n /= 10;
    }
    return voltea(n);
  }

  /**
   * Le quita a un número <code>n</code> la <code>cantidad</code> de dígitos por
   * delante (por la izquierda).
   *
   * @param n número a evaluar.
   * @param cantidad cantidad de dígitos a eliminar
   * @return <code>n</code> con los dígitos quitados.
   */

  public static int quitaPorDelante(int n, int cantidad) {
    return (int) quitaPorDelante((long) n, cantidad);
  }

  /**
   * Añade un dígito a un número <code>n</code> por detrás.
   *
   * @param n número a evaluar.
   * @param digito dígito(s) que se va a añadir.
   * @return <code>n</code> con los dígitos añadidos.
   */

  public static long pegaPorDetras(long n, long digito) {
    return juntaNumeros(n, digito);
  }

  /**
   * Añade un dígito a un número <code>n</code> por detrás.
   *
   * @param n número a evaluar.
   * @param digito dígito(s) que se va a añadir.
   * @return <code>n</code> con los dígitos añadidos.
   */

  public static int pegaPorDetras(int n, int digito) {
    return (int) pegaPorDetras((long) n, (long) digito);
  }

  /**
   * Añade un dígito a un número <code>n</code> por delante.
   *
   * @param n número a evaluar.
   * @param digito dígito(s) que se va a añadir.
   * @return <code>n</code> con los dígitos añadidos.
   */
  
  public static long pegaPorDelante(long n, long digito) {
    return juntaNumeros(digito, n);
  }

  /**
   * Añade un dígito a un número <code>n</code> por delante.
   *
   * @param n número a evaluar.
   * @param digito dígito(s) que se va a añadir.
   * @return <code>n</code> con los dígitos añadidos.
   */

  public static int pegaPorDelante(int n, int digito) {
    return (int) pegaPorDelante((long) n, (long) digito);
  }

  /**
   * Recorta <code>n</code> usando una posición inicial y final.
   *
   * @param n número a evaluar.
   * @param inicio posición de inicio.
   * @param fin posición de fin.
   * @return devuelve el trozo correspondiente.
   */

  public static long trozoDeNumero(long n, int inicio, int fin) {
    n = quitaPorDelante(n, inicio);
    n = quitaPorDetras(n, digitos(n) - fin - 1);
    return n;
  }

  /**
   * Recorta <code>n</code> usando una posición inicial y final.
   *
   * @param n número a evaluar.
   * @param inicio posición de inicio.
   * @param fin posición de fin.
   * @return devuelve el trozo correspondiente.
   */

  public static int trozoDeNumero(int n, int inicio, int fin) {
    return (int) trozoDeNumero((long) n, inicio, fin);
  }

  /**
   * Junta dos números para formar uno.
   *
   * @param n1 número 1.
   * @param n2 número 2.
   * @return número nuevo generado.
   */

  public static long juntaNumeros(long n1, long n2) {
    if (n2 == 0) {
      return n1 * 10;
    }
    return n1* (long) (potencia(10, digitos(n2))) + n2;
  }

  /**
   * Junta dos números para formar uno.
   *
   * @param n1 número 1.
   * @param n2 número 2.
   * @return número nuevo generado.
   */

  public static int juntaNumeros(int n1, int n2) {
    return (int) juntaNumeros((long) n1, (long) n2);
  }
}
