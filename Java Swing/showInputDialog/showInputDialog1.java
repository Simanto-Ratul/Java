import javax.swing.JOptionPane;

public class showInputDialog1 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, name + " Welcome to Java Swing.");
    }
}
