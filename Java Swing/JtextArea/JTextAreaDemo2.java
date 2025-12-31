import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo2 extends JFrame{
    private Container c;
    private Font font;
    private JTextArea textArea1;

    public JTextAreaDemo2(){
        this.setTitle("JtextArea");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font = new Font("Cambria",Font.BOLD,18);

        textArea1 = new JTextArea();
        textArea1.setBounds(20,30,350,300);
        textArea1.setFont(font);
        textArea1.setForeground(Color.WHITE);
        textArea1.setBackground(Color.DARK_GRAY);
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        c.add(textArea1);
    }

    public static void main(String[] args) {
        JTextAreaDemo2 d1 = new JTextAreaDemo2();
        d1.setVisible(true);
    }
}
