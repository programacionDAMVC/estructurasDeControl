/**Fichero BucleConBreak.java
  Ejemplo de funcionamiento de bucles
  usando sentencia break
  Calculamos si un nº es primo o no
  @author Manuel
  @version 1.0
  */
public class BucleConBreak {

    public static void main (String[] args) {

        //long posibleNumeroPrimo =  98764321261L;
        long posibleNumeroPrimo =  84979;
        boolean resultado = false;
        //for (int divisor = 2 ; divisor < posibleNumeroPrimo ; divisor++ ) {
        //de la mitad del posibleNuemeroPrimo hasta posibleNumeroPrimos 
        //NUNCA existirá un posible divisor, se mejora el algoritmo si
        // ponemos divisor < posibleNumeroPrimo / 2
        for (long divisor = 2 ; divisor < posibleNumeroPrimo / 2 ; divisor++ ) {
            resultado = posibleNumeroPrimo % divisor == 0;
            //if (resultado == true) {
            if ( resultado ) {
                System.out.println("Primer divisor: " + divisor);
                break;
            }
           // System.out.println(posibleNumeroPrimo + "  " + divisor + "  " + resultado); 
        }
        System.out.println("¿Es nº primo " + posibleNumeroPrimo + "? " + !resultado);

        System.out.println("¿Es nº primo " + 86201 + "? " + esNumeroPrimo ( 86201 ) );
        System.out.println("¿Es nº primo " + 86747 + "? " + esNumeroPrimo ( 86747 ) );
        System.out.println("¿Es nº primo " + 4 + "? " + esNumeroPrimo ( 4 ) );
    }


    /** Método que nos devuelve si un número
      es primo o no, pasando éste por argumento
      @param numero el dígito que se comprobará si es primo o no
      @return true o false dependiendo si es o no es número primo
    */
    public static boolean esNumeroPrimo (long numero){  
        boolean resultado = false;
        for (long divisor = 2 ; divisor <= numero / 2 ; divisor++ ) {

            resultado = numero % divisor == 0;
            if ( resultado ) {
                break;
            }

        }
        return !resultado;

    }
}


