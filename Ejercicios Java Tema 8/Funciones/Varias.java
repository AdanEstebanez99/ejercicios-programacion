/**
 * Funciones varias para los ejercicios del tema 8
 * 
 * @author Adán
 */

  package Funciones;
  public class Varias {
  
  //Numero primo:
  
    public static boolean esPrimo(int x) {
      for (int i = 2;i < x; i ++) {
        if ((x % i) == 0) {
          return false;
        }
      }
      return true;
    }
    
  //Numero capicua:
  
    public static boolean esCapicua(int x) {
      return x == voltea(x);
      }
      
  //Siguiente numero primo:
    
    public static int siguientePrimo(int n){
      int nextPrimo = n;
      
      do{
        nextPrimo++;
      }while(!esPrimo(nextPrimo));
      return nextPrimo;
      }
  
  //Segun base y exponente devolver la potencia:
    
    public static int potencia(int b, int e){
     int potencia = 1;
     
     for (int i = 0; i < e; i++){
       potencia = potencia * b;
     }
     
     return potencia;
     }
    
  //Contador de Digitos:
  
    public static int digitos(int n){
      int digitos = 1;
      
      while(n > 9) {
        n = n / 10;
        digitos++;
      }
      return digitos;
      }
      
  //Voltea el numero:
  
    public static int voltea(int n){
     int volteado = 0;
     
     while(n > 0){
       volteado = volteado * 10 + n % 10;
       n = n / 10;
     }
     
     return volteado;
     }
     
  //Devuelve el digito en el que esta la posicion de un numero entero:
  
    public static int digitoN(int n, int x){
      int aux = voltea(n);
      
      if (x == 1){
        return aux % 10;
      }else{
        for(int i = 0; i < x; i++){
          aux = aux / 10;
        }
        
        return aux % 10;
      }
      }
      
  //Posicion de la primera ocurrencia de un digito:
  
    public static int posicionDeDigito(int numero, int digito) {
       int volteado = voltea(numero);
       int i = 0;
       while (volteado >= 1) {
         if (digito == volteado % 10) {
          return i;
         }
         volteado = volteado/10;
         i++;
       }
       return -1;
       
      }
      
  //Quita n digitos a un numero por detras:
  
    public static long quitarPorDetras(long n, long x) {
       int contador = 0;
       
       while(contador < x){
         n = n/10;
         contador++;
       }
       return n;
      }
      
  //Quita n digitos a un numero por delante:
  
    public static int quitarPorDelante(int n, int x) {
      n = voltea(n);
      int contador = 0;

      while(contador < x){
        
        n = n/10;
        contador++;
      }
      n = voltea(n);
      return n;
    }
    
  //Añade un digito a un numero por detras:
  
    public static int pegaPorDetras(int n, int x) {
     n = n*10;
     n = n + x;
    
     return n;
    }
    
  //Añade un digito a un numero por delante:
  
    public static int pegaPorDelante(int n, int x) {
     n = voltea(n);
     
     n = n*10;
     n = n + x;
     
     return n = voltea(n);
    }
}
