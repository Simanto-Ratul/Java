import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo1 extends JFrame {
    private Container c;
    private JCheckBox physicsBox, chemistryBox, matCheckBox;
    private Font f;

    public JCheckBoxDemo1() {
        this.setTitle("JCheckBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        f = new Font("Cambria", Font.BOLD, 14);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        physicsBox = new JCheckBox("Physics");
        physicsBox.setBounds(30, 50, 80, 50);
        physicsBox.setFont(f);
        c.add(physicsBox);

        chemistryBox = new JCheckBox("Chemistry");
        chemistryBox.setBounds(130, 50, 100, 50);
        chemistryBox.setFont(f);
        c.add(chemistryBox);

        matCheckBox = new JCheckBox("Math");
        matCheckBox.setBounds(240, 50, 80, 50);
        matCheckBox.setFont(f);
        c.add(matCheckBox);
    }

    public static void main(String[] args) {
        JCheckBoxDemo1 d1 = new JCheckBoxDemo1();
        d1.setVisible(true);
    }
}
