import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.*;

public class JTextAreaDemo1 extends JFrame{
    private Container c;
    private Font font;
    private JTextArea textArea1;

    public JTextAreaDemo1(){
        this.setTitle("JText Area");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font = new Font("Cambria",Font.BOLD,18);

        textArea1 = new JTextArea();
        textArea1.setFont(font);
        textArea1.setBounds(20,20,300,300);
        textArea1.setForeground(Color.white);
        textArea1.setBackground(Color.DARK_GRAY);
        c.add(textArea1);
    }
    public static void main(String[] args) {
        JTextAreaDemo1 t1 = new JTextAreaDemo1();
        t1.setVisible(true);
    }
}
