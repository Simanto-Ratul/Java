import javax.swing.*;
import java.awt.*;

public class JPasswordFieldDemo extends JFrame{
    private JPasswordField passwordField1,passwordField2;
    private Container c;
    private Font f1;

    public JPasswordFieldDemo(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        f1 = new Font("Times New Roman", Font.BOLD, 25);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,500);
        this.setResizable(false);
        this.setTitle("JPassword Learning");

        passwordField1=new JPasswordField();
        passwordField1.setBounds(50,10,150,50);
        passwordField1.setFont(f1);
        passwordField1.setEchoChar('$');
        passwordField1.setForeground(Color.green);
        c.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(50,80,150,50);
        passwordField2.setFont(f1);
        passwordField2.setEchoChar('$');
        passwordField2.setForeground(Color.YELLOW);
        c.add(passwordField2);
    }


    public static void main(String[] args) {
        JPasswordFieldDemo obj1 = new JPasswordFieldDemo();
        obj1.setVisible(true);
    }
}
