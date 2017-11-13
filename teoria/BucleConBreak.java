public class BucleConBreak {
    public static void main (String[] args) {

        long posibleNumeroPrimo =  98764321261L;
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

        // System.out.println("¿Es nº primo " + posibleNumeroPrimo + "? " + esNumeroPrimo (posibleNumeroPrimo ) );
    }
    // public static boolean esNumeroPrimo (long numero)  
}


