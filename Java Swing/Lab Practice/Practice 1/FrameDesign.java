import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDesign extends JFrame {
    private ImageIcon imageIcon1;

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
    }
}