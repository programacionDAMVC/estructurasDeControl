public class NumeroPrimo {
    public static void main(String[] args){
        
        long posibleNumeroPrimo = 84_979;

        boolean verificacionDivisible235 = verificarDivisibilidad2o3o5( posibleNumeroPrimo );
        System.out.println(verificacionDivisible235);

        int valorEnteroRaizCuadrada = calcularEnteroRaizCuadrada( posibleNumeroPrimo );
        boolean segundaVerificacion = valorEnteroRaizCuadrada * valorEnteroRaizCuadrada == posibleNumeroPrimo;
        System.out.println(segundaVerificacion);
        boolean divisiblePrimo = verificarDivisibilidadPrimos(valorEnteroRaizCuadrada);
        System.out.println(divisiblePrimo);
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
         for (long divisor = 7 ; divisor <= numero / 2 ; divisor++ ) {
            resultado = numero % divisor == 0;
            if ( resultado ) {
                break;
            }
         }
         return resultado; 
    }


}




