import javax.swing.JFrame;

public class JFrameDemo2 extends JFrame{

    public JFrameDemo2(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 100, 400, 500);
        setTitle("JFrame Demo");
        setResizable(false);
    }
    public static void main(String[] args) {
        JFrameDemo2 frame = new JFrameDemo2();
    }
}
