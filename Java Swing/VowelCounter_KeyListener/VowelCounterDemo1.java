import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class VowelCounterDemo1 extends JFrame {

    private Container c;
    private JLabel label1, vowLabel, aJLabel, eJLabel, iJLabel, oJLabel, uJLabel;
    private JTextField textField;
    private JScrollPane scrollPane;
    int total_vowel = 0;
    int latter_a = 0;
    int latter_e = 0;
    int latter_i = 0;
    int latter_o = 0;
    int latter_u = 0;

    public VowelCounterDemo1() {
        this.setTitle("Vowel Counter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.MAGENTA);

        label1 = new JLabel("Enter the text : ");
        label1.setBounds(30, 50, 120, 30);
        c.add(label1);

        
        textField = new JTextField();
        // textField.setLineWrap(true);
        // textField.setWrapStyleWord(true);

        scrollPane = new JScrollPane(textField);
        scrollPane.setBounds(140, 50, 200, 100);
        c.add(scrollPane);

        vowLabel = new JLabel();
        vowLabel.setBounds(50, 70, 100, 30);
        c.add(vowLabel);

        aJLabel = new JLabel();
        aJLabel.setBounds(50, 100, 100, 30);
        c.add(aJLabel);

        eJLabel = new JLabel();
        eJLabel.setBounds(50, 130, 100, 30);
        c.add(eJLabel);

        iJLabel = new JLabel();
        iJLabel.setBounds(50, 160, 100, 30);
        c.add(iJLabel);

        oJLabel = new JLabel();
        oJLabel.setBounds(50, 190, 100, 30);
        c.add(oJLabel);

        uJLabel = new JLabel();
        uJLabel.setBounds(50, 220, 100, 30);
        c.add(uJLabel);

        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ke) {

            }

            public void keyPressed(KeyEvent ke) {
                if (ke.getSource() == textField) {
                    String s = textField.getText();
                    if (s.equals("a")) {
                        total_vowel++;
                        latter_a++;
                    } else if (s.equals("e")) {
                        total_vowel++;
                        latter_e++;
                    } else if (s.equals("i")) {
                        total_vowel++;
                        latter_i++;
                    } else if (s.equals("o")) {
                        total_vowel++;
                        latter_o++;
                    } else if (s.equals("u")) {
                        total_vowel++;
                        latter_u++;
                    }
                }
                vowLabel.setText("Total number of vowels : " + total_vowel);
                aJLabel.setText("Total number of a : " + latter_a);
                eJLabel.setText("Total number of e : " + latter_e);
                iJLabel.setText("Total number of i : " + latter_i);
                oJLabel.setText("Total number of o : " + latter_o);
                uJLabel.setText("Total number of u : " + latter_u);
            }

            public void keyReleased(KeyEvent ke) {

            }
        });
        c.add(textField);
    }

    public static void main(String[] args) {
        VowelCounterDemo1 v1 = new VowelCounterDemo1();
        v1.setVisible(true);
    }
}
