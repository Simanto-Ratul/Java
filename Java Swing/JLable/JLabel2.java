import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.*;

public class JLabel2 extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel label1, label2;

    public JLabel2() {
        initcomponents();
    }

    public void initcomponents() {
        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());

        label1 = new JLabel("Enter your name: ");
        label1.setBounds(50, 20, 150, 50);
        label1.setVisible(true);

        label2 = new JLabel("Enter your password: ");
        label2.setBounds(50, 70, 150, 50);
        label2.setVisible(true);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        c.add(label1);
        c.add(label2);

    }

    public static void main(String[] args) {
        JLabel2 l2 = new JLabel2();
        l2.setVisible(true);
        l2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l2.setTitle("JLabel Learning");
        l2.setBounds(500, 100, 400, 500);
        l2.setResizable(false);
    }
}
