
import javax.swing.JFrame;

public class NewJFrame extends JFrame {

    public NewJFrame() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 350);
        setLocationRelativeTo(null);
        setResizable(false);
        add(new NewJPanel());
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewJFrame();
    }
}
