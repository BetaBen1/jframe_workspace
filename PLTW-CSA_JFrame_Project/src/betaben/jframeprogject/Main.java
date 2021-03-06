package betaben.jframeprogject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		initScene();
		
	}
	
	private static void initScene() {
		
		String string = "";
		
		Random random = new Random();
		
		JFrame jframe = new JFrame();
		jframe.setLayout(null);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setTitle("Calculator");
		jframe.setSize(1280, 720);
		jframe.setBackground(Color.lightGray);

		JButton oneButton = new JButton();
		oneButton.setSize(100, 100);
		oneButton.setText("1");
		oneButton.setLocation(jframe.getWidth()/2, jframe.getHeight()/2);
		
		JButton twoButton = new JButton();
		twoButton.setSize(100, 100);
		twoButton.setText("2");
		twoButton.setLocation(jframe.getWidth()/3, jframe.getHeight()/3);
		
		JLabel display = new JLabel();
		display.setText("Hello World!");
		display.setLocation(0, 0);
		display.setOpaque(false);
		display.setSize(jframe.getWidth(), 100);
		display.setForeground(Color.black);
		display.setBackground(Color.black);
		
		oneButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			  {
			    display.setText("1");
			  }
		});
		
		twoButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				display.setText("2");
			}
		});
		
		jframe.add(oneButton);
		jframe.add(twoButton);
		jframe.add(display);
		
		oneButton.setVisible(true);
		twoButton.setVisible(true);
		display.setVisible(true);
		
		jframe.setVisible(true);
		
//		while(true){
//			jframe.getContentPane().setBackground(new Color(random.nextInt(0xFFFFFF)));
//		}
		
	}
	
}
