package betaben.jframeprogject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		initScene();
		
	}
	
	private static void initScene() {
		
		String string = "";
		
		JFrame jframe = new JFrame();
		jframe.setLayout(null);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setTitle("Calculator");
		jframe.setSize(720, 1280);
		jframe.setBackground(Color.lightGray);

		JButton jbutton = new JButton();
		jbutton.setSize(100, 100);
		jbutton.setText("1");
		jbutton.setLocation(jframe.getWidth()/2, jframe.getHeight()/2);
		jbutton.setBackground(Color.BLACK);
		
		JLabel display = new JLabel();
		display.setText("Hello World!");
		display.setLocation(0, 0);
		display.setOpaque(false);
		display.setSize(jframe.getWidth(), 100);
		display.setForeground(Color.black);
		display.setBackground(Color.black);
		
		jbutton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			  {
			    display.setText("1");
			  }
		});
		
		jframe.add(jbutton);
		jframe.add(display);
		
		jbutton.setVisible(true);
		display.setVisible(true);
		
		jframe.setVisible(true);
		
	}
	
}
