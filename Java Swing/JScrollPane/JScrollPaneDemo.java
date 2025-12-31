import javax.swing.*;
import java.awt.*;

public class JScrollPaneDemo extends JFrame {
    private Container c;
    private JTextArea textArea1;
    private JScrollPane scrollPane1;

    public JScrollPaneDemo() {
        this.setTitle("JScrollPane");
        this.setBounds(450, 100, 400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);

        textArea1 = new JTextArea();
        // textArea1.setBounds(20,50,100,100);
        textArea1.setForeground(Color.WHITE);
        textArea1.setBackground(Color.DARK_GRAY);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        // c.add(textArea1);

        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(20, 50, 100, 100);
        c.add(scrollPane1);

    }
}
