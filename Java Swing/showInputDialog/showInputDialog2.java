import javax.swing.JOptionPane;

public class showInputDialog2 {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog(null, "Enter you first name : ", "This is title",
                JOptionPane.QUESTION_MESSAGE);
        String lastName = JOptionPane.showInputDialog(null, "Enter you last name: ", JOptionPane.WARNING_MESSAGE);

        String name = firstName + " " + lastName;
        JOptionPane.showMessageDialog(null, "Your full name is : " + name);
    }
}
