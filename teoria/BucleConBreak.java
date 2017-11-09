public class BucleConBreak {
    public static void main (String[] args) {

        int posibleNumeroPrimo = 12345559;
        boolean resultado = false;
        for (int divisor = 2 ; divisor < posibleNumeroPrimo ; divisor++ ) {
            resultado = posibleNumeroPrimo % divisor == 0;
            if (resultado == true) {
                System.out.println("Primer divisor: " + divisor);
                break;
            }
           // System.out.println(posibleNumeroPrimo + "  " + divisor + "  " + resultado); 
        }
        System.out.println("¿Es nº primo " + posibleNumeroPrimo + "? " + !resultado);
    }
}


