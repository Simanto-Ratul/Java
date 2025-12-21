import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListener1 extends JFrame {

    private Container c;
    private JTextField t1, t2;

    ActionListener1() {
        initComponents();
    }

    public void initComponents() {
        t1 = new JTextField();
        t1.setBounds(20, 20, 150, 50);
        t1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = t1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You didn't enter nothing.");
                } else {
                    JOptionPane.showMessageDialog(null, "You entered : " + s);
                }
            }
        });

        t2 = new JTextField();
        t2.setBounds(20, 80, 150, 50);
        t2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = t2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter your name.");
                } else {
                    JOptionPane.showMessageDialog(null, "You entered : " + s);
                }
            }
        });

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);
        c.add(t1);
        c.add(t2);
    }

    public static void main(String[] args) {
        ActionListener1 a1 = new ActionListener1();
        a1.setVisible(true);
        a1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a1.setTitle("Action Listener Learning");
        a1.setBounds(450, 100, 400, 500);
        a1.setResizable(false);
    }
}
