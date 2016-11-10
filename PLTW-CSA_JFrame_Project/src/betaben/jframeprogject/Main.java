package betaben.jframeprogject;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		JFrame jframe = new JFrame();
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setTitle("Calculator");
		jframe.setSize(720, 1280);
		jframe.setBackground(Color.black);
		jframe.setVisible(true);

		JButton jbutton = new JButton();
		jbutton.setLocation(5, 5);
		jbutton.setSize(500, 500);
		jbutton.setBackground(Color.BLACK);
		jbutton.setVisible(true);
		
		JLabel display = new JLabel();
		display.setText("Hello World!");
		display.setLocation(500, 500);
		display.setSize(100, 100);
		display.setForeground(Color.black);
		display.setBackground(Color.black);
		display.setVisible(true);
		
		jframe.add(jbutton);
		jframe.add(display);
		
	}

}