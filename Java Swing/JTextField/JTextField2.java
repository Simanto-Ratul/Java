import javax.swing.*;
import java.awt.*;

public class JTextField2 extends JFrame {

    private Container c;
    private ImageIcon icon1;
    private JLabel l1, l2, l3, l4;
    private Font f, f1;
    private JTextField t1, t2, t3, t4;

    public JTextField2() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTextField Learning");
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);
        initComponents();
    }

    public void initComponents() {

        icon1 = new ImageIcon(getClass().getResource("lion.png"));
        this.setIconImage(icon1.getImage());

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 12);
        f1 = new Font("Arial",Font.HANGING_BASELINE + Font.BOLD, 12);

        l1 = new JLabel("Enter your name : ");
        l1.setBounds(20, 20, 150, 30);
        l1.setFont(f);
        l1.setForeground(Color.WHITE);

        l2 = new JLabel("Enter your password : ");
        l2.setBounds(20, 60, 150, 30);
        l2.setFont(f);
        l2.setForeground(Color.WHITE);

        l3 = new JLabel("Enter your ID : ");
        l3.setBounds(20, 100, 150, 30);
        l3.setFont(f);
        l3.setForeground(Color.WHITE);

        l4 = new JLabel("Enter your account : ");
        l4.setBounds(20, 140, 150, 30);
        l4.setFont(f);
        l4.setForeground(Color.WHITE);

        t1 = new JTextField();
        t1.setBounds(170, 20, 150, 30);
        t1.setBackground(Color.RED);
        t1.setForeground(Color.BLACK);
        t1.setFont(f1);
        t1.setHorizontalAlignment(JTextField.CENTER);

        t2 = new JTextField();
        t2.setBounds(170, 60, 150, 30);
        t2.setBackground(Color.RED);
        t2.setForeground(Color.BLACK);
        t2.setFont(f1);
        t2.setHorizontalAlignment(JTextField.CENTER);

        t3 = new JTextField();
        t3.setBounds(170, 100, 150, 30);
        t3.setBackground(Color.RED);
        t3.setForeground(Color.BLACK);
        t3.setFont(f1);
        t3.setHorizontalAlignment(JTextField.CENTER);

        t4 = new JTextField();
        t4.setBounds(170, 140, 150, 30);
        t4.setBackground(Color.RED);
        t4.setForeground(Color.BLACK);
        t4.setFont(f1);
        t4.setHorizontalAlignment(JTextField.CENTER);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.black);
        c.add(l1);
        c.add(l2);
        c.add(l3);
        c.add(l4);
        c.add(t1);
        c.add(t2);
        c.add(t3);
        c.add(t4);

    }

    public static void main(String[] args) {
        JTextField2 t2 = new JTextField2();
        System.out.println(t2.getTitle());
    }
}
