import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JRadioButtonDemo1 extends JFrame {
    private Container c;
    private JRadioButton button1, button2;
    private ButtonGroup buttonGroup;
    private Font font;
    private JTextArea textArea1;

    public JRadioButtonDemo1() {
        this.setTitle("JRadioButton");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 400);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        font = new Font("Cambria",Font.BOLD,16);
        buttonGroup = new ButtonGroup();

        button1 = new JRadioButton("Male");
        button1.setBounds(20, 50, 100, 50);
        button1.setBackground(Color.ORANGE);
        button1.setFont(font);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s = button1.getText();
                if(s.equals("Male")){
                    textArea1.append("You have selected male.\n");
                }
            }
        });
        c.add(button1);

        button2 = new JRadioButton("Female");
        button2.setBounds(150, 50, 100, 50);
        button2.setBackground(Color.ORANGE);
        button2.setFont(font);
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s = button2.getText();
                if(s.equals("Female")){
                    textArea1.append("You have selected female.\n");
                }
            }
        });
        c.add(button2);

        buttonGroup.add(button1);
        buttonGroup.add(button2);

        textArea1 = new JTextArea();
        textArea1.setBounds(50,100,200,200);
        textArea1.setFont(font);
        textArea1.setBackground(Color.DARK_GRAY);
        textArea1.setForeground(Color.WHITE);
        c.add(textArea1);
    }

    public static void main(String[] args) {
        JRadioButtonDemo1 b1 = new JRadioButtonDemo1();
        b1.setVisible(true);
    }
}
