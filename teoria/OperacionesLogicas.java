public class OperacionesLogicas {
    public static void main(String[] args){
        boolean variable1 = 5 > 4 * 3;
        System.out.println("Debe dar false : " + variable1 );
        variable1 = 7 * 3 >= 5 / 1;
        System.out.println("Debe dar true : " + variable1 );
        variable1 = variable1 && !(5 > 3 * 7);
        System.out.println("Debe dar true : " + variable1 );
        variable1 = variable1 || 5 > 3 * 7;
        System.out.println("Debe dar true : " + variable1 );
        variable1 = variable1 | 5 > 3 * 7;
        System.out.println("Debe dar true : " + variable1 );
        variable1 = !variable1 && !(5 > 3 * 7);
        System.out.println("Debe dar false : " + variable1 );
        variable1 = variable1 & !(5 > 3 * 7);
        System.out.println("Debe dar false : " + variable1 );
    }
}
