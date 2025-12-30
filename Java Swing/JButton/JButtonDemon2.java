import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemon2 extends JFrame{
    private Container c;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private Font f1;

    public JButtonDemon2(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f1 = new Font("Arial",Font.BOLD,14);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JButton Action Listener Add");
        this.setBounds(450,100,400,500);
        this.setResizable(false);

        label1 = new JLabel();
        label1.setText("Enter your address : ");
        label1.setFont(f1);
        label1.setBounds(10,20,150,50);
        c.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(160,20,150,50);
        c.add(textField1);

        button1 = new JButton("Clear");
        button1.setBounds(150,100,80,30);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textField1.setText("");
            }
        });
        c.add(button1);
    }

    public static void main(String[] args) {
        JButtonDemon2 b1 = new JButtonDemon2();
        b1.setVisible(true);
    }
}
    
