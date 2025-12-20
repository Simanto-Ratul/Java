import javax.swing.*;
import javax.swing.JFrame;

import java.awt.*;

public class JLable1 extends JFrame {
    private ImageIcon icon;
    private Container c;
    private JLabel label;

    public JLable1() {
        initcomponents();
    }

    public void initcomponents() {
        this.setVisible(true);
        this.setTitle("JFrame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 400, 500);
        this.setResizable(false);

        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        label = new JLabel();
        label.setText("Enter your name: ");
        label.setVisible(true);
        label.setBounds(100, 100, 150, 50);
        c.add(label);
    }

    public static void main(String[] args) {
        JLable1 l1 = new JLable1();
    }
}
