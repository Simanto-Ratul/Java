import javax.swing.*;
import java.awt.*;

public class JTextField1 extends JFrame {

    private Container c;
    private JLabel l1;
    private JTextField textField;

    public JTextField1() {
        initComponents();
    }

    public void initComponents() {
        l1 = new JLabel("Enter password : ");
        l1.setBounds(20, 20, 150, 50);
        l1.setForeground(Color.WHITE);

        textField = new JTextField();
        textField.setBounds(160, 20, 150, 40);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        c.add(l1);
        c.add(textField);

    }

    public static void main(String[] args) {
        JTextField1 t1 = new JTextField1();
        t1.setVisible(true);
        t1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t1.setTitle("JTextField Learning");
        t1.setBounds(450, 100, 400, 500);
        t1.setResizable(false);
    }
}
