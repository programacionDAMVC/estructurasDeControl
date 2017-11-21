public class Ejercicio1 {
    public static void main(String[] arg) {
        String cadena = "puede ser una frase ";
        boolean contiene = cadena.contains(" una ");
       // System.out.println(contiene);
        System.out.printf("¿La cadena \"%s\" contiene %s? %b%n", cadena, " una ", contiene);

        boolean acaba = cadena.endsWith("rase");
        System.out.println("\"cadena +\"  ¿acaba en \"rase\"? " + acaba);

        String cadena1 = "hola";
        String cadena2 = "Hola";
        boolean igualIgnorando = cadena1.equalsIgnoreCase(cadena2);
        System.out.printf("La cadena \"%s\" ¿es igual a la cadena %s? %b%n",
                            cadena1, cadena2, igualIgnorando);

        System.out.printf("La cadena \"%s\" ¿es cadena vacía? %B%n" , cadena2, 
                                cadena2.isEmpty());

        System.out.printf("La cadena \"%s\" ¿empieza por ho? %b%n" , cadena2, 
                                cadena2.startsWith("ho"));

        //String cadena = "puede ser una frase ";
        int indice = 19;
        char caracter = cadena.charAt(indice);
        System.out.printf("La cadena \"%s\" tiene en el índice %d como caracter %c%n", cadena, indice, caracter);
        System.out.printf("La longitud de la cadena \"%s\" es %d %n",
                cadena, cadena.length());

        System.out.println("hola mundo".replace(' ', '_'));
        
        String cadenaMinuscula = "hello world";
        String cadenaMayuscula = cadenaMinuscula.toUpperCase();
        System.out.printf("Cadena \"%s\" en mayúsculas es \"%s\"%n",
                            cadenaMinuscula, cadenaMayuscula);                       
        System.out.printf("Cadena \"%s\" en minúscula es \"%s\"%n",
                cadenaMayuscula, cadenaMayuscula.toLowerCase());
        
        System.out.println("Subcadena de la cadena anterior: " + 
                cadenaMayuscula.substring(6));
        System.out.println("Subcadena de la cadena anterior: " + 
                cadenaMayuscula.substring(6,8));
        

    }
}
