import java.util.Scanner; // 1º importamos la clase Scanner

public class NombreLeido {
    public static void main(String[] args){

        System.out.println("Nombre y apellidos");
        Scanner sc = new Scanner(System.in); // 2º abrimos Scanner
        String nombreCompleto = sc.nextLine(); // 3º leemos la línea completa
        sc.close(); // 4º cerramos Scanner
        System.out.printf("Hola %s%n", nombreCompleto);

    }
}
