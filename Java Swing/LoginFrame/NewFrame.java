import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame {
    private Container c;
    private JLabel label1;

    public NewFrame() {
        this.setTitle("New Frame");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(450, 100, 400, 400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.RED);

        label1 = new JLabel("Hello Everyone!");
        label1.setBounds(50, 50, 150, 50);
        c.add(label1);
    }

    public static void main(String[] args) {
        NewFrame f1 = new NewFrame();
        f1.setVisible(true);
    }
}
