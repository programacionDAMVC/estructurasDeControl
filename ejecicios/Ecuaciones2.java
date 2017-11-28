/** Clase Ecuaciones 2
  que contiene los métodos 
  para resolver un sistema de 
  dos ecuaciones con dos incognitas
  @author Manuel
  @version 1.0
  */
public class Ecuaciones2 {
   
        /** Método esResoluble que nos dice si tiene o no tiene soluciones el sistema de ecuaciones
          @param a int coeficiente x de la primera ecuación
          @param b int coeficiente y de la primera ecuación
          @param c int coeficiente x de la segunda ecuación
          @param d int coeficiente y de la segunda ecuación
          @return resultado que es true si es resoluble, false al contrario
          */

        public static boolean esResoluble (int a, int b, int c, int d) {
            boolean resultado = (a * d) - (b * c) != 0; 
            return resultado;
        }

        /** Método calcularX que nos da el valor de x del sistema de ecuaciones
          @param a int coeficiente x de la primera ecuación
          @param b int coeficiente y de la primera ecuación
          @param c int coeficiente x de la segunda ecuación
          @param d int coeficiente y de la segunda ecuación
          @param e int coeficiente independiente de la primera ecuación
          @param f int coeficiente independiente de la segunda ecuación
          @return resultado de tipo double que es el valor de x
          */
        public static double calcularX (int a, int b, int c, int d, int e, int f){
            double resultado = (e * d - b *f) * 1.0 / (a * d - b * c); 
            return resultado;
        }

        /** Método calcularY que nos da el valor de y del sistema de ecuaciones
          @param a int coeficiente x de la primera ecuación
          @param b int coeficiente y de la primera ecuación
          @param c int coeficiente x de la segunda ecuación
          @param d int coeficiente y de la segunda ecuación
          @param e int coeficiente independiente de la primera ecuación
          @param f int coeficiente independiente de la segunda ecuación
          @return resultado de tipo double que es el valor de y
          */

        public static double calcularY (int a, int b, int c, int d, int e, int f){
            return (a * f - e * c) * 1.0 / (a * d - b * c); //refactorizado
        }

}
