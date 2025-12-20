import java.awt.*;

import javax.swing.*;

public class JLabel5 extends JFrame{

    private ImageIcon icon;
    private Container c;
    private JLabel label;
    private Font f;

    public JLabel5(){
        initcomponents();
    }

    public void initcomponents(){
        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());

        f = new Font("Arial", Font.ITALIC, 16);

        label = new JLabel("Enter password : ");
        label.setFont(f);
        label.setBounds(20,20,200,50);
        label.setForeground(Color.WHITE);
        label.setToolTipText("Enter a strong password.");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        c.add(label);
    }
    public static void main(String[] args) {
        JLabel5 l2 = new JLabel5();
        l2.setVisible(true);
        l2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l2.setTitle("JLabel learning");
        l2.setBounds(450,100,400,500);
        l2.setResizable(false);
    }
}
