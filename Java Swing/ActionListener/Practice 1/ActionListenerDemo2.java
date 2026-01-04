import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo2 extends JFrame implements ActionListener {
    private Container c;
    private JButton button1, button2, button3;

    public ActionListenerDemo2() {
        this.setTitle("Action Listener 3rd approach");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        button1 = new JButton("RED");
        button1.setBounds(100, 50, 100, 50);
        button1.setBackground(Color.RED);
        c.add(button1);

        button2 = new JButton("GREEN");
        button2.setBounds(100, 120, 100, 50);
        button2.setBackground(Color.GREEN);
        c.add(button2);

        button3 = new JButton("BLUE");
        button3.setBounds(100, 200, 100, 50);
        button3.setBackground(Color.BLUE);
        button3.setForeground(Color.WHITE);
        c.add(button3);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            c.setBackground(Color.RED);
        } else if (e.getSource() == button2) {
            c.setBackground(Color.GREEN);
        } else if(e.getSource() == button3){
            c.setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args) {
        ActionListenerDemo2 d1 = new ActionListenerDemo2();
        d1.setVisible(true);
    }
}
