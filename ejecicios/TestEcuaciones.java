import java.util.Scanner;
public class TestEcuaciones {

 public static void main(String[] args) {
        int a, b, c, d, e, f; //coeficientes de las ecuaciones
        //lectura por scanner de los coeficientes
        System.out.println("Introduce los coeficientes de las ecuaciones");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        sc.close(); 
        System.out.println(a +"·x + " + b + "·y = " + e);
        System.out.println(c +"·x + " + d + "·y = " + f);
        //comprobar si es resoluble
        boolean resoluble = Ecuaciones2.esResoluble(a, b, c, d);
        System.out.println("¿Es resoluble el sistema? " + resoluble);
        if (resoluble) {
            double valorX = Ecuaciones2.calcularX(a, b, c, d, e, f);
            System.out.printf("Solución de la X %.2f%n", valorX);
            double valorY = Ecuaciones2.calcularY(a, b, c, d, e, f);
            System.out.printf("Solución de la Y %.2f%n", valorY);
        }
    }

}
