import javax.swing.JFrame;
public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(500,600);
        //frame.setLocationRelativeTo(null);
        // frame.setLocation(200, 100);
        frame.setBounds(200, 100, 500, 600);
        frame.setTitle("JFrame Demo");
        frame.setResizable(false);
    }
}
