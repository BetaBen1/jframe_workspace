package betaben.calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(6, 6, 421, 16);
		contentPane.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(6, 57, 421, 16);
		contentPane.add(textArea_1);
		
		JRadioButton addButton = new JRadioButton("+");
		addButton.setBounds(286, 85, 141, 23);
		contentPane.add(addButton);
		
		JRadioButton subtractButton = new JRadioButton("-");
		subtractButton.setBounds(286, 122, 141, 23);
		contentPane.add(subtractButton);
		
		JRadioButton multiplyButton = new JRadioButton("x");
		multiplyButton.setBounds(286, 158, 141, 23);
		contentPane.add(multiplyButton);
		
		JRadioButton divideButton = new JRadioButton("/");
		divideButton.setBounds(286, 193, 141, 23);
		contentPane.add(divideButton);
		
		JLabel label = new JLabel("0");
		label.setBounds(126, 219, 61, 16);
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
				label.setText("1");
			  }
		});
	}
}
