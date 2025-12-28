import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class FrameDesign extends JFrame {
    private ImageIcon imageIcon1;
    private Color color1, color2;
    private Container c;
    private JLabel label1;
    private Font font1;

    public FrameDesign() {
        initComponents();
    }

    public void initComponents() {
        this.setTitle("Frame Design Learning");
        this.setVisible(true);
        this.setBounds(350, 50, 600, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageIcon1 = new ImageIcon(getClass().getResource("pumpkin.png"));
        this.setIconImage(imageIcon1.getImage());

        color1 = new Color(23, 46, 88);
        color2 = new Color(255, 255, 255);
        font1 = new Font("Cambria", Font.BOLD, 30);

        label1 = new JLabel("Frame Design");
        label1.setFont(font1);
        label1.setBounds(180, 10, 200, 50);
        label1.setVisible(true);

        c = this.getContentPane();
        c.setBackground(color1);
        c.add(label1);
    }
}