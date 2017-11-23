public class DoceNumeros {
    public static void main(String[] args){

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Nº uno");
        double numeroUno = sc.nextDouble();
        System.out.println("Nº dos");
        double numeroDos = sc.nextDouble();
        System.out.println("Nº tres");
        double numeroTres = sc.nextDouble();
        System.out.println("Nº cuatro");
        double numeroCuatro = sc.nextDouble();
        System.out.println("Nº cinco");
        double numeroCinco = sc.nextDouble();
        System.out.println("Nº seis");
        double numeroSeis = sc.nextDouble();
        System.out.println("Nº siete");
        double numeroSiete = sc.nextDouble();
        System.out.println("Nº ocho");
        double numeroOcho = sc.nextDouble();
        System.out.println("Nº nueve");
        double numeroNueve = sc.nextDouble();
        System.out.println("Nº diez");
        double numeroDiez = sc.nextDouble();
        System.out.println("Nº Once");
        double numeroOnce = sc.nextDouble();
        System.out.println("Nº Doce");
        double numeroDoce = sc.nextDouble();
        sc.close();
        System.out.printf("%10.2f %10.2f %10.2f%n", numeroUno, numeroDos,numeroTres);
        System.out.printf("%10.2f %10.2f %10.2f%n", numeroCuatro, numeroCinco,numeroSeis);
        System.out.printf("%10.2f %10.2f %10.2f%n", numeroSiete, numeroOcho,numeroNueve);
        System.out.printf("%10.2f %10.2f %10.2f%n", numeroDiez, numeroOnce,numeroDoce);

    }
}
