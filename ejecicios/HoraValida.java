import java.util.*;

public class HoraValida {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora = in.nextInt();
        if (hora < 0 || hora > 23){
            System.out.println("Hora no válida");
            return;
        }
        String sHora;
        if (hora < 10) {
            sHora = "0" + hora;
        } else {
            sHora = hora + "";
        } //esto habría que repetirlo para los minutos y segundos

        System.out.println("Introduce los minutos");
        int minutos = in.nextInt();
        if (minutos < 0 || minutos > 59){
            System.out.println("Minutos no válidos");
            return;
        }

        System.out.println("Introduce los segundos");
        int segundos = in.nextInt();
        if (segundos < 0 || segundos > 59){
            System.out.println("Segundos no válidos");
            return;
        }

        in.close();
        System.out.printf("Hora válida %s:%d:%d%n", sHora, minutos, segundos);


    }
}
