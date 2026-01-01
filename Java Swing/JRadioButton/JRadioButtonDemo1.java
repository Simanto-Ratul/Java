import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo1 extends JFrame {
    private Container c;
    private JRadioButton button1, button2;

    public JRadioButtonDemo1() {
        this.setTitle("JRadioButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        button1 = new JRadioButton("Male");
        button1.setBounds(20, 50, 100, 50);
        button1.setBackground(Color.ORANGE);
        c.add(button1);

        button2 = new JRadioButton("Female");
        button2.setBounds(150, 50, 100, 50);
        button2.setBackground(Color.ORANGE);
        c.add(button2);
    }

    public static void main(String[] args) {
        JRadioButtonDemo1 b1 = new JRadioButtonDemo1();
        b1.setVisible(true);
    }
}
