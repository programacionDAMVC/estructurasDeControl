public class BucleConContinue {
    public static void main(String args[]){
    
        for (int i = 0; i < 20; i++) {
            System.out.println( "El valor de i es: " + i );
            if ( i % 2 != 0 ){
                continue;
            }
            System.out.println("Numero par");
        }
            
    }
}
