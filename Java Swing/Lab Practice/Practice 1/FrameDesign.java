import javax.swing.JFrame;

public class FrameDesign extends JFrame {
    public FrameDesign() {
        initComponents();
    }

    public void initComponents() {
        this.setTitle("Frame Design Learning");
        this.setVisible(true);
        this.setBounds(350,50,600,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}