import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.*;

public class FrameDesign extends JFrame {
    private ImageIcon imageIcon1;
    private Color color1, color2;
    private Container c;

    public FrameDesign() {
        initComponents();
    }

    public void initComponents() {
        this.setTitle("Frame Design Learning");
        this.setVisible(true);
        this.setBounds(350,50,600,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageIcon1 = new ImageIcon(getClass().getResource("pumpkin.png"));
        this.setIconImage(imageIcon1.getImage());

        color1 = new Color(23, 46, 88);

        c = this.getContentPane();
        c.setBackground(color1);
    }
}