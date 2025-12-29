import javax.swing.*;
import java.awt.*;

public class JButtonDemo1 extends JFrame {
    private Container c;
    private Color c1;
    private Font f1;
    private JButton button1, button2;

    public JButtonDemo1() {
        initComponents();
    }

    public void initComponents() {

        c1 = new Color(15, 12, 91);
        f1 = new Font("Arial", Font.BOLD, 14);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(c1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JButton Learning.");
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        button1 = new JButton("SUBMIT");
        button1.setBounds(100, 100, 100, 30);
        button1.setFont(f1);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        c.add(button1);

        button2 = new JButton("CONFIRM");
        button2.setBounds(210, 100, 100, 30);
        button2.setFont(f1);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        c.add(button2);
    }

    public static void main(String[] args) {
        JButtonDemo1 a1 = new JButtonDemo1();
        a1.setVisible(true);
    }
}
