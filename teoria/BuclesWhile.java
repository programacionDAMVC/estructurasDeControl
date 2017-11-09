public class BuclesWhile {
    public static void main (String[] args){

        int numero   = -9;

        int contador1 = 0;
        while (contador1 < numero){
            System.out.println(contador1);
            contador1++;
        }
        
        int contador2 = 0;
        do {
            System.out.println(contador2); //estas sentencias se ejecuta al menos
            contador2++;                   //una vez
        } while (contador2 < numero);

        System.out.println("Valor de contador1: " + contador1);
        System.out.println("Valor de contador2: " + contador2);
    }
}
