import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo1 extends JFrame {
    private Container c;
    private JCheckBox physicsBox, chemistryBox, matCheckBox;
    private Font f;
    private ButtonGroup group;

    public JCheckBoxDemo1() {
        this.setTitle("JCheckBox");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(450, 100, 400, 500);
        this.setResizable(false);

        f = new Font("Cambria", Font.BOLD, 14);
        group = new ButtonGroup();

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        physicsBox = new JCheckBox("Physics");
        physicsBox.setBounds(30, 50, 80, 50);
        physicsBox.setFont(f);
        physicsBox.setBackground(Color.CYAN);
        c.add(physicsBox);

        chemistryBox = new JCheckBox("Chemistry");
        chemistryBox.setBounds(130, 50, 100, 50);
        chemistryBox.setFont(f);
        chemistryBox.setBackground(Color.CYAN);
        c.add(chemistryBox);

        matCheckBox = new JCheckBox("Math");
        matCheckBox.setBounds(240, 50, 80, 50);
        matCheckBox.setFont(f);
        matCheckBox.setBackground(Color.CYAN);
        c.add(matCheckBox);

        group.add(physicsBox);
        group.add(chemistryBox);
        group.add(matCheckBox);
    }

    public static void main(String[] args) {
        JCheckBoxDemo1 d1 = new JCheckBoxDemo1();
        d1.setVisible(true);
    }
}
