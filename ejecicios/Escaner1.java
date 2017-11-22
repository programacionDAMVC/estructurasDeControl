import java.util.Scanner;

public class Escaner1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Leyendo números");
        int suma = 0;
        while (in.hasNextInt()) {
            suma += in.nextInt();
        }
        in.close();
        System.out.println("La suma de los nº vale " + suma);

    }
}
