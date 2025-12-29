import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class imageIcon2 extends JFrame {
    private ImageIcon icon;

    public imageIcon2() {
        initcomponents();
    }

    public void initcomponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Image Icon Test");
        this.setBounds(450, 50, 400, 500);
        this.setResizable(false);

        icon = new ImageIcon("bonfire.png");
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        imageIcon2 i1 = new imageIcon2();
        i1.setVisible(true);
    }
}
