import java.util.Scanner;

public class Ecuaciones1 {

    static int a, b, c, d, e, f; //coeficientes de las ecuaciones
    public static void main(String[] args) {
        solicitarDatos();
        //comprobar si es resoluble
        boolean resoluble = esResoluble();
        System.out.println("¿Es resoluble el sistema? " + resoluble);
        if (resoluble) {
            double valorX = calcularX();
            System.out.printf("Solución de la X %.2f%n", valorX);
            double valorY = calcularY();
            System.out.printf("Solución de la Y %.2f%n", valorY);
        }
    }

    public static boolean esResoluble () {
        boolean resultado = (a * d) - (b * c) != 0; 
        return resultado;
    }

    public static double calcularX (){
        double resultado = (e * d - b *f) * 1.0 / (a * d - b * c); 
        return resultado;
    }

    public static double calcularY (){
        return (a * f - e * c) * 1.0 / (a * d - b * c); //refactorizado
    }

    public static void solicitarDatos() {
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
    }

}
