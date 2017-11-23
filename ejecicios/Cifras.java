import java.util.Scanner;

public class Cifras {
    public static void main(String[] args){

        System.out.println("Introduce un nº de tres cifras");
        Scanner sc = new Scanner(System.in);
        int nTresCifras = sc.nextInt();
        sc.close();
        //comprobamos si es negativo, si lo es lo paso a positivo
        if ( nTresCifras < 0) {
            nTresCifras *= -1;
        }
        //comprobamos que tiene tres cifras
        if ( nTresCifras < 100  || nTresCifras > 999) {
            //no hacemos nada, y salimos del programa
            System.out.println("No es un nº de tres cifras"); 
        } else {
            //código para el caso de tres cifras
            System.out.println("Es un nº de tres cifras");
            //convertir a cadena, para poder recorrer los tres caracteres
            //TRUCO: concatenar el int a cadena vacía
            String nCadena = nTresCifras + "";  //casting a cadena
            for ( int i = 0; i < 3; i++ ) {
                System.out.println("Cifra: " + nCadena.charAt(i));
        }

        }
    }
}
    
