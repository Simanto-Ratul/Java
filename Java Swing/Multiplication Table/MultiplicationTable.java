import javax.swing.*;
import java.awt.*;

public class MultiplicationTable extends JFrame {
    private Container c;
    private JLabel imglLabel1, textLabel;
    private JTextArea textArea1;
    private JTextField textField1;
    private Color c1;
    private Font f1;
    private ImageIcon imageIcon1, imageIcon2;
    private JButton button;

    public MultiplicationTable() {

        c1 = new Color(7, 14, 69);
        f1 = new Font("Cambria", Font.BOLD, 18);
        imageIcon1 = new ImageIcon("photo.jpg");
        imageIcon2 = new ImageIcon("coffee.png");

        this.setTitle("Multiplication Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 50, 330, 700);
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
        textField1.setHorizontalAlignment(JTextField.CENTER);
        c.add(textField1);

        button = new JButton("Clear");
        button.setBounds(195, 300, 80, 30);
        button.setFont(f1);
        button.setBackground(Color.LIGHT_GRAY);
        c.add(button);

        textArea1 = new JTextArea();
        textArea1.setBounds(23, 350, 270, 300);
        textArea1.setFont(f1);
        textArea1.setBackground(Color.LIGHT_GRAY);
        c.add(textArea1);
    }
}
