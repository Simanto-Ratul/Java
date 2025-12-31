import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrameDemo extends JFrame {
    private Container c;
    private Font f;
    private JLabel label1, label2;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton button1, button2;

    public LoginFrameDemo() {
        this.setTitle("Login Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Cambria", Font.BOLD, 16);

        label1 = new JLabel("Username : ");
        label1.setBounds(20, 50, 100, 40);
        label1.setFont(f);
        c.add(label1);

        label2 = new JLabel("Password : ");
        label2.setBounds(20, 100, 100, 50);
        label2.setFont(f);
        c.add(label2);

        textField1 = new JTextField();
        textField1.setBounds(130, 50, 200, 40);
        textField1.setFont(f);
        c.add(textField1);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(130, 100, 200, 40);
        passwordField1.setFont(f);
        passwordField1.setEchoChar('$');
        c.add(passwordField1);

        button1 = new JButton("Login");
        button1.setBounds(130, 160, 90, 40);
        button1.setFont(f);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = textField1.getText();
                String password = passwordField1.getText();

                if (userName.equals("simanto") && password.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Succesfully Logined");
                    //dispose();
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });
        c.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(240, 160, 90, 40);
        button2.setFont(f);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                passwordField1.setText("");
            }
        });
        c.add(button2);

    }

    public static void main(String[] args) {
        LoginFrameDemo l1 = new LoginFrameDemo();
        l1.setVisible(true);
    }
}
