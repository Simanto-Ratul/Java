import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
//import java.awt.event.ActionEvent;

public class JCheckBoxDemo1 extends JFrame {
    private Container c;
    private JCheckBox physicsBox, chemistryBox, matCheckBox;
    private Font f;
    private ButtonGroup group;
    private JLabel label;

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

        chemistryBox = new JCheckBox("Chemistry",true);
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

        label = new JLabel();
        label.setBounds(50,100,250,200);
        label.setBackground(Color.CYAN);
        label.setFont(f);
        c.add(label);

        Handler handel = new Handler();
        physicsBox.addItemListener(handel);
        chemistryBox.addItemListener(handel);
        matCheckBox.addItemListener(handel);
    }

    public class Handler implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            if(physicsBox.isSelected()){
                label.setText("You have seleceted PHYSICS.");
            }else if(chemistryBox.isSelected()){
                label.setText("You have seleted CHEMISTRY.");
            }else{
                label.setText("You have selected MATH.");
            }
        }
    }

    public static void main(String[] args) {
        JCheckBoxDemo1 d1 = new JCheckBoxDemo1();
        d1.setVisible(true);
    }
}
