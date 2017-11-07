public class EjemploIF2 {
    public static void main(String[] args) {

        int numero = (int) ( Math.random() * 10_000 );
        if ( numero % 2 == 0) {
            System.out.println( numero + " es par" );
            if ( numero >= 5001 ) {
                System.out.println( numero + " es mayor que 5000" );
            } else {
                System.out.println( numero + " es menor o igual que 5000" );
            }

        } else {
            System.out.println( numero + " es impar" );
            if ( numero % 3 == 0)
                System.out.println( numero + " también es divisible por 3" );
        }

    }
}
            


