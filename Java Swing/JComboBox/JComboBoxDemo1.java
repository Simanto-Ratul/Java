import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo1 extends JFrame{
    private Container c;
    private JComboBox<String> comboBox;
    private String[] subject = {"PHYSICS", "MATH", "CHEMISTRY", "BIOLOGY"};

    public JComboBoxDemo1(){
        this.setTitle("JComboBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450,100,400,500);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        comboBox = new JComboBox<>(subject);
        comboBox.setBounds(50,150,100,30);
        comboBox.setEditable(true);
        c.add(comboBox);
    }

    public static void main(String[] args) {
        JComboBoxDemo1 d1 = new JComboBoxDemo1();
        d1.setVisible(true);
    }
}
