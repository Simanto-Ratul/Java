import java.awt.*;
import java.awt.Container;

import javax.swing.*;

public class JLabel4 extends JFrame {

    private ImageIcon icon;
    private Container c;
    private JLabel l1, l2;
    private Font f;

    public JLabel4() {
        initcomponents();
    }

    public void initcomponents() {
        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());

        f = new Font("Arial", Font.BOLD, 14);

        l1 = new JLabel("Enter your name : ");
        l1.setBounds(20, 20, 200, 50);
        l1.setFont(f);
        l1.setForeground(Color.blue);
        l1.setOpaque(true);
        l1.setBackground(Color.WHITE);

        l2 = new JLabel("Enter your password : ");
        l2.setBounds(20, 70, 200, 50);
        l1.setFont(f);
        l2.setForeground(Color.PINK);
        l2.setOpaque(true);
        l2.setBackground(Color.WHITE);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GREEN);
        c.add(l1);
        c.add(l2);

    }

    public static void main(String[] args) {
        JLabel4 l4 = new JLabel4();
        l4.setVisible(true);
        l4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l4.setTitle("JLabel Learning");
        l4.setBounds(450, 100, 400, 500);
        l4.setResizable(false);
    }
}
