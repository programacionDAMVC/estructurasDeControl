public class MostrarNumeros {
    public static void main(String[] args){
        mostrarNumeros(10);
        System.out.println("=================================");
        mostrarRangoNumeros(111,120);
        System.out.println("Imprimir pares  ================================");
        mostrarRangoNumeros(111,120,'p'); //imprimir pares (p)
        System.out.println("Imprimir impares  ================================");
        mostrarRangoNumeros(111,120,'I'); //imprimir impares (I)
        System.out.println("Imprimir todos  ================================");
        mostrarRangoNumeros(111,120,'z'); //imprimir todos
    }

    public static void mostrarNumeros( int numero ) {
        int contador = 0;
        while ( contador <= numero ) {
            System.out.println(contador);
            contador++;
        }
        //Fuera del bucle
        System.out.println("Valor del contandor fuera del bucle: " + contador);

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

    public static void mostrarRangoNumeros( int numeroChico, int numeroGrande, char parOImpar) {
        if ( numeroChico < numeroGrande ) {

            int contador = numeroChico;
                while ( contador <= numeroGrande ) {
                    if ( (parOImpar == 'p' || parOImpar == 'P') && contador % 2 == 0 ) { //imprimir pares
                        System.out.println(contador);
                    }
                    else if ( (parOImpar == 'i' || parOImpar == 'I') && contador % 2 != 0 ) { //imprimir impares                 
                        System.out.println(contador);
                    }
                    else if (parOImpar != 'i' && parOImpar != 'I' && parOImpar != 'p' && parOImpar != 'P')  { //imprime todos, pues no he pasado p,P,i,I
                        System.out.println(contador);
                    }

                    contador++;
                }

        } else {
            System.out.println(numeroChico + " es mas grande o igual que " + numeroGrande);
        }
    }


}
