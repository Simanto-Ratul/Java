import java.awt.*;

import javax.swing.*;

public class JLabel6 extends JFrame{

    private ImageIcon icon1, icon2;
    private Container c;
    private JLabel label1;

    public JLabel6(){
        initcomponents();
    }

    public void initcomponents(){
        icon1 = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon1.getImage());

        icon2 = new ImageIcon(getClass().getResource("icon2.png"));
        this.setIconImage(icon2.getImage());
        label1 = new JLabel(icon2);
        label1.setBounds(0,0,icon2.getIconWidth(),icon2.getIconHeight());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        c.add(label1);
    }
    public static void main(String[] args) {
        JLabel6 l1 = new JLabel6();
        l1.setVisible(true);
        l1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setTitle("JLabel Learning");
        l1.setBounds(0,0,400,500);
        l1.setResizable(false);
    }
}
