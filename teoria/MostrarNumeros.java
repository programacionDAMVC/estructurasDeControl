public class MostrarNumeros {
    public static void main(String[] args){
        mostrarNumeros(10);
        System.out.println("=================================");
        mostrarRangoNumeros(111,120);
    }

    public static void mostrarNumeros( int numero ) {
        int contador = 0;
        while ( contador <= numero ) {
            System.out.println(contador);
            contador++;
        }
        //Fuera del bucle
        System.out.println(contador);

    }

    public static void mostrarRangoNumeros( int numeroChico, int numeroGrande ) {
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande ) {
                    System.out.println(contador);
                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }
    }


}
