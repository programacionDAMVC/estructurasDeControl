public class EjemploIF1 {
    public static void main(String[] args){

        System.out.println("Has introducido " + args.length + " argumentos");
        if ( args.length > 1 ) {
            System.out.println("El primer argumento es  " + args[0]);
            System.out.println("El primer argumento es  " + args[1]);
        }

    }
}
