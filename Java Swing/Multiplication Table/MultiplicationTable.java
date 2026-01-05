import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiplicationTable extends JFrame {
    private Container c;
    private JLabel imglLabel1, textLabel;
    private JTextArea textArea1;
    private JTextField textField1;
    private Color c1;
    private Font f1;
    private ImageIcon imageIcon1, imageIcon2;
    private JButton button;
    private Cursor cursor;

    public MultiplicationTable() {

        c1 = new Color(7, 14, 69);
        f1 = new Font("Cambria", Font.BOLD, 18);
        imageIcon1 = new ImageIcon("photo.jpg");
        imageIcon2 = new ImageIcon("coffee.png");
        cursor = new Cursor(Cursor.HAND_CURSOR);

        this.setTitle("Multiplication Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 30, 330, 700);
        this.setResizable(false);
        this.setIconImage(imageIcon2.getImage());

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(c1);

        imglLabel1 = new JLabel(imageIcon1);
        imglLabel1.setBounds(0, 0, imageIcon1.getIconWidth(), imageIcon1.getIconHeight());
        c.add(imglLabel1);

        textLabel = new JLabel("Enter your number  : ");
        textLabel.setBounds(10, 250, 180, 50);
        textLabel.setForeground(Color.WHITE);
        textLabel.setFont(f1);
        c.add(textLabel);

        textField1 = new JTextField();
        textField1.setBounds(195, 262, 80, 30);
        textField1.setFont(f1);
        textField1.setBackground(Color.LIGHT_GRAY);
        textField1.setToolTipText("Enter an integer number");
        textField1.setHorizontalAlignment(JTextField.CENTER);
        textField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = textField1.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please, Enter any number!");
                } else {
                    textArea1.setText("");
                    int num = Integer.parseInt(textField1.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String increment = String.valueOf(i);

                        textArea1.append(n + " x " + increment + " = " + r + "\n");
                    }
                }
            }
        });
        c.add(textField1);

        button = new JButton("Clear");
        button.setBounds(195, 300, 80, 30);
        button.setFont(f1);
        button.setCursor(cursor);
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textArea1.setText("");
            }
        });
        c.add(button);

        textArea1 = new JTextArea();
        textArea1.setBounds(23, 350, 270, 300);
        textArea1.setFont(f1);
        textArea1.setBackground(Color.LIGHT_GRAY);
        c.add(textArea1);
    }
}
