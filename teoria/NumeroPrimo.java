public class NumeroPrimo {
    public static void main(String[] args){
        
        //long posibleNumeroPrimo = 98764321261L;
        long posibleNumeroPrimo = 7;

        boolean verificacionDivisible235 = verificarDivisibilidad2o3o5( posibleNumeroPrimo );
        System.out.println( "Divisible por 2, 3 ó 5 " + verificacionDivisible235);

        int valorEnteroRaizCuadrada = calcularEnteroRaizCuadrada( posibleNumeroPrimo );
        boolean segundaVerificacion = valorEnteroRaizCuadrada * valorEnteroRaizCuadrada == posibleNumeroPrimo;
        System.out.println("Raiz exacta " + segundaVerificacion);

        boolean divisiblePrimo = verificarDivisibilidadPrimos(valorEnteroRaizCuadrada);
        System.out.println("Divisible por número primos " + divisiblePrimo);

        boolean compuesto = verificacionDivisible235 || segundaVerificacion || divisiblePrimo;
        System.out.println( posibleNumeroPrimo + " ¿es compuesto? " + compuesto);

    }


    public static boolean verificarDivisibilidad2o3o5 ( long numero ) {
        boolean resultado = numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0 ;        
        return resultado;
    }
    
    public static int calcularEnteroRaizCuadrada( long numero ) {
        double raiz = Math.sqrt(numero);
        int resultado = (int) raiz;
        return resultado;
    }

    public static boolean verificarDivisibilidadPrimos( long numero ) {
         boolean resultado = false;
         for (long divisor = 7 ; divisor < numero / 2 ; divisor++ ) {
            resultado = numero % divisor == 0;
            if ( resultado ) {
                System.out.println("divisor " + divisor);
                break;
            }
         }
         return resultado; 
    }


}




