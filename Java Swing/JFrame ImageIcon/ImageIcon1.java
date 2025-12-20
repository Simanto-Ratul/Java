import java.awt.*;

import javax.swing.*;
public class ImageIcon1 extends JFrame{
    private ImageIcon icon;
    private Container c;

    public ImageIcon1(){
        initcomponents();
    }

    public void initcomponents(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,100,400,500);
        this.setResizable(false);
        this.setTitle("JFrame Demo");
        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setBackground(Color.yellow);
    }

    public static void main(String[] args) {
        ImageIcon1 i2 = new ImageIcon1();
    }
}
