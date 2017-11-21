public class ContarVocales {
    public static void main(String[] args) {
        String palabraLeida = args[0].toLowerCase();
        int contador = 0;
        for (int i = 0; i < palabraLeida.length(); i++) {
            if (palabraLeida.charAt(i) == 'a' ||
                palabraLeida.charAt(i) == 'e' || 
                palabraLeida.charAt(i) == 'i' || 
                palabraLeida.charAt(i) == 'o' || 
                palabraLeida.charAt(i) == 'u' ||
                palabraLeida.charAt(i) == 'á' ||
                palabraLeida.charAt(i) == 'é' ||
                palabraLeida.charAt(i) == 'í' ||
                palabraLeida.charAt(i) == 'ó' ||
                palabraLeida.charAt(i) == 'ú') {

                contador++;
            }
        }
        System.out.println("Nº de vocales encontradas: " + contador);
    }
}
