public class Numeros{
    public static void main(String[] args){

        imprimirPrimerosDieznumeros ();
        System.out.println("______________");
        imprimirDelVeinteAlOchentaDeCincoEnCinco ();
        System.out.println("______________");
        imprimirDelCienAlCiencuentaDeDiezEnDiez ();
        System.out.println("______________");
        int numero = 10;
        int suma = calcularSumaDe1aN(numero);
        System.out.printf("La de suma de los %d primeros números vale %d\n", 
                            numero, suma);
        int sumaCuadrados = calcularSumaDe1aNCuadrados(numero);
        System.out.printf("La de suma de los %d primeros números al cuadrado vale %d\n", numero, sumaCuadrados);
        imprimirSumaParesYSumaImpares(numero);


    }

    public static void imprimirPrimerosDieznumeros () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void imprimirDelVeinteAlOchentaDeCincoEnCinco () {
        for (int i = 20; i <= 80; i = i + 5) {
            System.out.println(i);
        }
    }

    public static void imprimirDelCienAlCiencuentaDeDiezEnDiez () {
        /*for (int i = 100; i >= 50; i -= 10) {
            System.out.println(i);
        }*/
        int contador = 100;
        do {
            System.out.println(contador);
            contador -= 10;
       } while (contador >= 50);
    }

    public static int calcularSumaDe1aN(int numero) {
        int contador = 0;
        int suma     = 0;
        while ( contador <= numero ) {
            suma += contador;
            contador ++;
        }
        return suma;
    }

    public static int calcularSumaDe1aNCuadrados(int numero) {
        int contador = 0;
        int suma     = 0;
        while ( contador <= numero ) {
            suma += contador * contador;
            contador ++;
        }
        return suma;
    }

    public static void imprimirSumaParesYSumaImpares(int numero) {
        int sumaPares   = 0;
        int sumaImpares = 0;
        for (int i = 0; i <= numero ; i++) {
            if ( i % 2 == 0) {
                sumaPares   += i;
            } else {
                sumaImpares += i;
            }
        }
        System.out.printf("La suma de 0 a %d, para los nº pares vale %d, para los impares vale %d%n", numero, sumaPares, sumaImpares);
    }    

}
