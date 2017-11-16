import javax.swing.JOptionPane;

public class Dialog {
    public static void main(String[] args) {
        String inputValue = JOptionPane.showInputDialog("Intruduce un número"); 
        int numero = Integer.parseInt(inputValue);
        System.out.println("El doble del valor es: " + numero * 2);
        JOptionPane.showMessageDialog(null, (numero * 2), "El valor doble", JOptionPane.PLAIN_MESSAGE);
    }
}
