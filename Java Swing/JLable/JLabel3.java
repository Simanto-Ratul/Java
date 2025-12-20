import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.*;

public class JLabel3 extends JFrame {

    private Container c;
    private ImageIcon icon;
    private JLabel label3, label4;
    private Font f;

    public JLabel3() {
        initcomponents();
    }

    public void initcomponents() {

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JLabel practice");
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());

        f = new Font("Arial", Font.ITALIC, 14);

        label3 = new JLabel("Enter your name: ");
        label3.setBounds(20, 10, 200, 50);
        label3.setFont(f);

        label4 = new JLabel("Enter your password: ");
        label4.setBounds(20, 60, 200, 50);
        label4.setFont(f);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);
        c.add(label3);
        c.add(label4);
    }

    public static void main(String[] args) {
        JLabel3 l3 = new JLabel3();
    }
}
