import javax.swing.*;
public class Imageicon extends JFrame{

    private ImageIcon icon;

    public Imageicon(){
        initcomponents();  
    }

    public void initcomponents(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500, 100, 400, 500);
        this.setResizable(false);
        this.setTitle("JFrame Demo");
        icon = new ImageIcon(getClass().getResource("bonfire.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        Imageicon i1 = new Imageicon();
    }
}
