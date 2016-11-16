package betaben.calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.getContentPane().setBackground(Color.DARK_GRAY);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(68, 99, 173, 72);
		contentPane.add(btnCalculate);
		
		JTextArea firstText = new JTextArea();
		firstText.setBounds(6, 6, 421, 16);
		contentPane.add(firstText);
		
		JTextArea secondText = new JTextArea();
		secondText.setBounds(6, 57, 421, 16);
		contentPane.add(secondText);
		
		JRadioButton addButton = new JRadioButton("+");
		addButton.setBounds(286, 85, 141, 23);
		addButton.setForeground(Color.WHITE);
		addButton.setSelected(true);
		contentPane.add(addButton);
		
		JRadioButton subtractButton = new JRadioButton("-");
		subtractButton.setBounds(286, 122, 141, 23);
		subtractButton.setForeground(Color.WHITE);
		contentPane.add(subtractButton);
		
		JRadioButton multiplyButton = new JRadioButton("x");
		multiplyButton.setBounds(286, 158, 141, 23);
		multiplyButton.setForeground(Color.WHITE);
		contentPane.add(multiplyButton);
		
		JRadioButton divideButton = new JRadioButton("/");
		divideButton.setBounds(286, 193, 141, 23);
		divideButton.setForeground(Color.WHITE);
		contentPane.add(divideButton);
		
		JLabel label = new JLabel("0");
		label.setBounds(6, 219, 278, 16);
		label.setForeground(Color.WHITE);
		contentPane.add(label);
		
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addButton.setSelected(true);
				subtractButton.setSelected(false);
				multiplyButton.setSelected(false);
				divideButton.setSelected(false);
			}
		});
		
		subtractButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addButton.setSelected(false);
				subtractButton.setSelected(true);
				multiplyButton.setSelected(false);
				divideButton.setSelected(false);
			}
		});
		
		multiplyButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addButton.setSelected(false);
				subtractButton.setSelected(false);
				multiplyButton.setSelected(true);
				divideButton.setSelected(false);
			}
		});
		
		divideButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				addButton.setSelected(false);
				subtractButton.setSelected(false);
				multiplyButton.setSelected(false);
				divideButton.setSelected(true);
			}
		});
		
		btnCalculate.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			  {		
				
				if(isInteger(firstText.getText())==true && isInteger(secondText.getText())==true){
					if(addButton.isSelected()){
						int addInt = Integer.valueOf(firstText.getText())+Integer.valueOf(secondText.getText());
						String addString = Integer.toString(addInt);
						label.setText(addString);
					}
					else if(subtractButton.isSelected()){
						int subtractInt = Integer.valueOf(firstText.getText())-Integer.valueOf(secondText.getText());
						String subtractString = Integer.toString(subtractInt);
						label.setText(subtractString);
					}
					else if(multiplyButton.isSelected()){
						int multiplyInt = Integer.valueOf(firstText.getText())*Integer.valueOf(secondText.getText());
						String multiplyString = Integer.toString(multiplyInt);
						label.setText(multiplyString);
					}
					else if(divideButton.isSelected()){
						int divideInt = Integer.valueOf(firstText.getText())/Integer.valueOf(secondText.getText());
						String divideString = Integer.toString(divideInt);
						label.setText(divideString);
						}
					}
			  
				else {
					label.setText("Error: The text you entered is not a number.");
				}
			  }
		});  
	
	}
	
	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}

	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
	
}