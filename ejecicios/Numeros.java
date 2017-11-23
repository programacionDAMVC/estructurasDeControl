public class Numeros{
    public static void main(String[] args){

        imprimirPrimerosDieznumeros ();
        System.out.println("______________");
        imprimirDelVeinteAlOchentaDeCincoEnCinco ();
        System.out.println("______________");
        imprimirDelCienAlCiencuentaDeDiezEnDiez ();

    }

    public static void imprimirPrimerosDieznumeros () {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void imprimirDelVeinteAlOchentaDeCincoEnCinco () {
        for (int i = 20; i <= 80; i = i + 5) {
            System.out.println(i);
        }
    }

    public static void imprimirDelCienAlCiencuentaDeDiezEnDiez () {
        for (int i = 100; i >= 50; i = i - 10) {
            System.out.println(i);
        }
    }





}
