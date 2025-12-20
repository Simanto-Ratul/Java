import javax.swing.JOptionPane;

public class showConfirmDialog1 {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null, "Enter your first name : ", "This is title",
                JOptionPane.WARNING_MESSAGE);
        String lastNmae = JOptionPane.showInputDialog(null, "Enter your last mname :", JOptionPane.QUESTION_MESSAGE);

        String name = firstName + " " + lastNmae;
        JOptionPane.showMessageDialog(null, "Your full name is : " + name);

        int choose = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "This is title",
                JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "You have clicked no.");
            ;
        }

    }
}
