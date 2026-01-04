import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerDemo1 extends JFrame {

    private Container c;
    private JTextField textField;
    private JTextArea textArea;

    public KeyListenerDemo1() {
        this.setTitle("Key Listener");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        textField = new JTextField();
        textField.setBounds(50, 30, 150, 50);
        c.add(textField);

        textArea = new JTextArea();
        textArea.setBounds(50, 100, 250, 300);
        textArea.setBackground(Color.RED);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        c.add(textArea);

        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent ke) {
                textArea.append("Key Typed : " + ke.getKeyChar() + "\n");
            }

            public void keyPressed(KeyEvent ke) {
                textArea.append("Key Pressed : " + ke.getKeyChar() + "\n");
            }

            public void keyReleased(KeyEvent ke) {
                textArea.append("Key Released : " + ke.getKeyChar() + "\n");
            }
        });
    }

    public static void main(String[] args) {
        KeyListenerDemo1 k1 = new KeyListenerDemo1();
        k1.setVisible(true);
    }
}
