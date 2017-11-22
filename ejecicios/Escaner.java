import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Leyendo dos palabras, un entero y un doble:");
        String palabraLeida1    = in.next();
        String palabraLeida2    = in.next();
        int numeroEnteroLeido   = in.nextInt();
        double numeroDobleLeido = in.nextDouble();
        in.close(); //cierre del scanner
        System.out.printf( "Palabra leida1: %s, palabra leida2 %s, numero entero leido %d y numero doble leido %.2f%n", palabraLeida1, palabraLeida2, numeroEnteroLeido, numeroDobleLeido );

    }
}
