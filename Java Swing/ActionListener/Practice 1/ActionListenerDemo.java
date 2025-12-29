import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerDemo extends JFrame{
    private Container c;
    private JLabel label1, label2;
    private Font f1;
    private JTextField textField1, textField2;

    public ActionListenerDemo(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f1 = new Font("Cambria", Font.BOLD + Font.ITALIC, 14);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Action Listener Learning.");
        this.setBounds(420,100,500,600);
        this.setResizable(false);

        label1 = new JLabel();
        label1.setText("Enter Username: ");
        label1.setFont(f1);
        label1.setForeground(Color.BLACK);
        label1.setBounds(10,10,150,50);
        c.add(label1);

        label2 = new JLabel();
        label2.setText("Enter Password: ");
        label2.setFont(f1);
        label2.setForeground(Color.BLACK);
        label2.setBounds(10,60,50,50);
        c.add(label2);

        textField1 = new JTextField();
        textField1.setBounds(160,10,200,40);
        textField1.setFont(f1);
        textField1.setBackground(Color.GRAY);
        textField1.setForeground(Color.MAGENTA);
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s = textField1.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please, Enter your name");
                }else{
                    JOptionPane.showMessageDialog(null,"Welcome Mr."+s);
                }
            }
        });
        textField1.setToolTipText("Enter correct name");
        c.add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(160,60,200,40);
        textField2.setFont(f1);
        textField2.setBackground(Color.GRAY);
        textField2.setForeground(Color.MAGENTA);
        textField2.setHorizontalAlignment(JTextField.CENTER);
        textField2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s = textField2.getText();
                if(s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Wrong Password!");
                }else{
                    JOptionPane.showMessageDialog(null, "You entered *******");
                }
            }
        });
        textField2.setToolTipText("Enter correct password");
        c.add(textField2);
    }

    public static void main(String[] args) {
        ActionListenerDemo a1 = new ActionListenerDemo();
        a1.setVisible(true);
    }
}
