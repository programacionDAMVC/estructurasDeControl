public class EjemploSwitch{
    public static void main(String[] args) {
        char diaDeLaSemana = 'J';
        switch ( Character.toLowerCase( diaDeLaSemana ) ) {
            case 'l' :
                System.out.println("Hoy es lunes");
                break;
            case 'm' :
                System.out.println("Hoy es martes");
                break;
            case 'x' :
                System.out.println("Hoy es miércoles");
                break;
            case 'j' :
                System.out.println("Hoy es jueves");
                break;
            case 'v' :
                System.out.println("Hoy es viernes");
                break;
            case 's' :
                System.out.println("Hoy es sábado");
                break;
            case 'd' :
                System.out.println("Hoy es domingo");
                break;
            default  :
                System.out.println("No corresponde esa letra " + diaDeLaSemana);
        }
    }
}
