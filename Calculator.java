package java_calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Window.Type;
import java.awt.Point;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class Calculator extends JFrame {
	
	private JPanel contentPane;
	private JTextField value2;
	private JTextField value1;

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
		setLocation(new Point(500, 250));
		setResizable(false);
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 565);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		value2 = new JTextField();
		value2.setLocation(15, 52);
		value2.setSize(new Dimension(296, 84));
		value2.setEditable(false);
		value2.setBorder(null);
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 45));
		value2.setColumns(10);
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(9, 226, 75, 55);
		btnNewButton.setPreferredSize(new Dimension(43, 23));
		btnNewButton.setMinimumSize(new Dimension(43, 23));
		btnNewButton.setMaximumSize(new Dimension(43, 23));
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(9, 170, 75, 55);
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		JButton button7 = new JButton("7");
	
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 7);
			}
		});
		button7.setBackground(Color.WHITE);
		button7.setBounds(9, 282, 75, 55);
		button7.setPreferredSize(new Dimension(43, 23));
		button7.setMaximumSize(new Dimension(43, 23));
		button7.setMinimumSize(new Dimension(43, 23));
		button7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 4);
			}
		});
		button4.setBackground(Color.WHITE);
		button4.setBounds(9, 338, 75, 55);
		button4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 1);
			}
		});
		
		button1.setBackground(Color.WHITE);
		button1.setBounds(9, 394, 75, 55);
		button1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton btnNewButton_2_1_1_1 = new JButton("+/-");
		btnNewButton_2_1_1_1.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2_1_1_1.setBounds(9, 450, 75, 55);
		btnNewButton_2_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton clearEntryButton = new JButton("CE");
		clearEntryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(null);
			}
		});
		clearEntryButton.setBackground(Color.LIGHT_GRAY);
		clearEntryButton.setBounds(85, 170, 75, 55);
		clearEntryButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton squareButton = new JButton("^");
		squareButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecieved.setText("sqr");
				value2.setText(null);
			}
		});
		squareButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		squareButton.setBackground(Color.LIGHT_GRAY);
		squareButton.setBounds(85, 226, 75, 55);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 8);
				
			}
		});
		button8.setBackground(Color.WHITE);
		button8.setBounds(85, 282, 75, 55);
		button8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 5);
			}
		});
		button5.setBackground(Color.WHITE);
		button5.setBounds(85, 338, 75, 55);
		button5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 2);
			}
		});
		button2.setBackground(Color.WHITE);
		button2.setBounds(85, 394, 75, 55);
		button2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 0);
			}
		});
		button0.setBackground(Color.WHITE);
		button0.setBounds(85, 450, 75, 55);
		button0.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2.setBounds(161, 226, 75, 55);
		btnNewButton_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton btnNewButton_1_1_1 = new JButton("<--");
		btnNewButton_1_1_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_1_1.setBounds(237, 170, 75, 55);
		
		JButton clearButton = new JButton("C");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(null);
				value2.setText(null);
				actionRecieved.setText(null);
			}
		});
		clearButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		clearButton.setBackground(Color.LIGHT_GRAY);
		clearButton.setBounds(161, 170, 75, 55);
		
		JButton divideButton = new JButton("÷");
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecieved.setText("div");
				value2.setText(null);
			}
		});
		divideButton.setBackground(Color.LIGHT_GRAY);
		divideButton.setBounds(237, 226, 75, 55);
		divideButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton button9 = new JButton("9");
		button9.setBackground(Color.WHITE);
		button9.setBounds(161, 282, 75, 55);
		button9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 9);
				
			}
		});
		
		JButton multiplyButton = new JButton("×");
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecieved.setText("mult");
				value2.setText(null);
			}
		});
		multiplyButton.setBackground(Color.LIGHT_GRAY);
		multiplyButton.setBounds(237, 282, 75, 55);
		multiplyButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 6);
				
			}
		});
		button6.setBackground(Color.WHITE);
		button6.setBounds(161, 338, 75, 55);
		button6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton subtractButton = new JButton("-");
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecieved.setText("sub");
				value2.setText(null);
				
			}
		});
		subtractButton.setBackground(Color.LIGHT_GRAY);
		subtractButton.setBounds(237, 338, 75, 55);
		subtractButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value2.setText(value2.getText() + 3);
			}
		});
		button3.setBackground(Color.WHITE);
		button3.setBounds(161, 394, 75, 55);
		button3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton plusButton = new JButton("+");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1.setText(value2.getText());
				actionRecieved.setText("add");
				value2.setText(null);
			}
		});
		plusButton.setBackground(Color.LIGHT_GRAY);
		plusButton.setBounds(237, 394, 75, 55);
		plusButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		
		JButton btnNewButton_2_1_1_1_2 = new JButton(".");
		btnNewButton_2_1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1_1_1_2.setBackground(Color.WHITE);
		btnNewButton_2_1_1_1_2.setBounds(161, 450, 75, 55);
		btnNewButton_2_1_1_1_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		
		JButton equalButton = new JButton("=");
		equalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double one = Integer.parseInt(value1.getText());
				double two = Integer.parseInt(value2.getText());
				
				if (actionRecieved.getText().equals("sub")) 
				{
					double sub = one - two;
					value2.setText(String.valueOf(sub));
				}if(actionRecieved.getText().equals("add")) {
					double add = one + two;
					value2.setText(String.valueOf(add));
				}if(actionRecieved.getText().equals("div")) {
					double div = one / two;
					value2.setText(String.valueOf(div));
				}if(actionRecieved.getText().equals("mult")) {
					double mult = one * two;
					value2.setText(String.valueOf(mult));
				}if(actionRecieved.getText().equals("sqr")) {
					double sqr = (double) Math.pow(one, two);
					value2.setText(String.valueOf(sqr));
				}
					
				
			}
		});
		equalButton.setBackground(Color.ORANGE);
		equalButton.setBounds(237, 450, 75, 55);
		equalButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		contentPane.add(button4);
		contentPane.add(button1);
		contentPane.add(btnNewButton_2_1_1_1);
		contentPane.add(btnNewButton_1);
		contentPane.add(button7);
		contentPane.add(squareButton);
		contentPane.add(clearEntryButton);
		contentPane.add(button8);
		contentPane.add(button5);
		contentPane.add(button2);
		contentPane.add(button0);
		contentPane.add(btnNewButton_1_2);
		contentPane.add(btnNewButton_1_1_1);
		contentPane.add(btnNewButton_2_1_1_1_2);
		contentPane.add(button3);
		contentPane.add(button6);
		contentPane.add(button9);
		contentPane.add(clearButton);
		contentPane.add(multiplyButton);
		contentPane.add(divideButton);
		contentPane.add(subtractButton);
		contentPane.add(plusButton);
		contentPane.add(equalButton);
		contentPane.add(value2);
		
		value1 = new JTextField();
		value1.setEditable(false);
		value1.setBackground(SystemColor.control);
		value1.setBorder(null);
		value1.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 15));
		value1.setBounds(250, 34, 62, 20);
		contentPane.add(value1);
		value1.setColumns(10);
		
		actionRecieved = new JLabel("");
		actionRecieved.setVisible(false);
		actionRecieved.setBounds(266, 516, 46, 14);
		contentPane.add(actionRecieved);
	}
	private JLabel actionRecieved;
}
