import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class Ven2 extends JFrame{
	public static void main(String s[]) {

        JFrame frame = new JFrame("Torre de Hanoi");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();

        b1.setText("Jugar");
        b2.setText("Demo");
        b3.setText("Instrucciones");
        
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        frame.add(panel);

        frame.setSize(500, 500);

        frame.setLocationRelativeTo(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(false);
	}
}
