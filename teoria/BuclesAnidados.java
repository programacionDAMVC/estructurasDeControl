public class BuclesAnidados {
    public static void main(String[] args) {
    
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0)
                continue;
            for (int j = 0; j < 5; j++){
                for (int k = 0; k < 5; k++) {
                    System.out.println( "Valor de i: " + i + " ----- Valor de j: " +
                            j + " ---- Valor de k: " + k  );
                    if (k % 2 != 0)
                        break;
                }
            }
        }

    }
}
