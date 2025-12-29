import javax.swing.*;
import java.awt.*;

public class JPasswordFieldDemo extends JFrame{
    private JPasswordField passwordField1,passwordField2;
    private Container c;

    public JPasswordFieldDemo(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,500);
        this.setResizable(false);
        this.setTitle("JPassword Learning");

        passwordField1=new JPasswordField();
        passwordField1.setBounds(50,10,150,50);
        c.add(passwordField1);

        passwordField2 = new JPasswordField();
        passwordField2.setBounds(50,80,150,50);
        c.add(passwordField2);
    }


    public static void main(String[] args) {
        JPasswordFieldDemo obj1 = new JPasswordFieldDemo();
        obj1.setVisible(true);
    }
}
