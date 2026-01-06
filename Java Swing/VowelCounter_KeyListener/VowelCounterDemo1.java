import javax.swing.*;
import java.awt.*;

public class VowelCounterDemo1 extends JFrame{

    private Container c;
    private JLabel label1;
    private JTextField textField;
    private JTextArea textArea;

    public VowelCounterDemo1(){
        this.setTitle("Vowel Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,500);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);

        label1 = new JLabel("Enter A-Z : ");
        label1.setBounds(30,50,120,30);
        c.add(label1);

        textField = new JTextField();
        textField.setBounds(150,50,150,30);
        c.add(textField);

        textArea = new JTextArea();
        textArea.setBounds(70,120,250,250);
        textArea.setBackground(Color.MAGENTA);
        c.add(textArea);
    }
    
    public static void main(String[] args) {
        VowelCounterDemo1 v1 = new VowelCounterDemo1();
        v1.setVisible(true);
    }
}
