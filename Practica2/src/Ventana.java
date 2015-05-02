import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

	public class Ventana extends JFrame {
		private ImageIcon fondoMenu = new ImageIcon("Imagenes\\FondoP.jpg");
		
		public Ventana(){
	        JFrame vp = new JFrame("Torre de Hanoi");
	        JPanel panel = new JPanel();
	        panel.setLayout(null);

	        JButton b1 = new JButton("Nuevo Juego");
			b1.setBounds(20, 20, 200, 35);
	        
			JButton b2 = new JButton("Demo / Instrucciones");
			b2.setBounds(20, 70, 200, 35);
			
			JButton b3 = new JButton("Puntuaciones");
			b3.setBounds(20, 120, 200, 35);
	        
	        panel.add(b1);
	        panel.add(b2);
	        panel.add(b3);

	        vp.add(panel);
	        vp.setSize(255, 210);
	        vp.setLocationRelativeTo(null);
	        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        vp.setVisible(true);
	        vp.setResizable(true);
	        
	    }
	public static void main(String s[]) {
		Ventana a = new Ventana();
		Ven2 b = new Ven2();
		}
	}