public class EjemploIF {
    public static void main(String[] arg) { 

        int numero = 15 * 7 * 11;

        if ( numero % 7 == 0 ) {
            System.out.println( numero + " es divisible por 7");
        }

        if ( numero % 11 == 0) {
            System.out.println( numero + " es divisible por 11");
        }

        if ( numero % 3 == 0 && numero % 5 == 0 ) {
            System.out.println( numero + " es divisible por 15");
        }

        System.out.println("Fin de programa");
    }
}
