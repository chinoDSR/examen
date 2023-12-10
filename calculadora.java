package examen2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora extends JFrame {
int num1,num2;
String signo;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabell = new JLabel("");
		jLabell.setBounds(25, 10, 399, 23);
		contentPane.add(jLabell);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"1");

			}
		});
		btnNewButton.setBounds(10, 53, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"2");

			}
		});
		btnNewButton_1.setBounds(10, 93, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"3");

			}
		});
		btnNewButton_2.setBounds(10, 127, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"4");

			}
		});
		btnNewButton_3.setBounds(10, 161, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"5");

			}
		});
		btnNewButton_4.setBounds(10, 195, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"6");

			}
		});
		btnNewButton_5.setBounds(10, 229, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"7");

			}
		});
		btnNewButton_6.setBounds(109, 53, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"8");

			}
		});
		btnNewButton_7.setBounds(109, 93, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"9");

			}
		});
		btnNewButton_8.setBounds(109, 127, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"0");
			}
		});
		btnNewButton_9.setBounds(109, 161, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText("");

			}
		});
		btnC.setBounds(109, 195, 89, 23);
		contentPane.add(btnC);
		
		JButton btnNewButton_10_1 = new JButton("+");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="+";
				jLabell.setText("");

			}
		});
		btnNewButton_10_1.setBounds(109, 229, 89, 23);
		contentPane.add(btnNewButton_10_1);
		
		JButton btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="-";
				jLabell.setText("");

			}
		});
		btnNewButton_10.setBounds(196, 53, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_2 = new JButton("*");
		btnNewButton_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="*";
				jLabell.setText("");

			}
		});
		btnNewButton_10_2.setBounds(196, 93, 89, 23);
		contentPane.add(btnNewButton_10_2);
		
		JButton btnNewButton_10_3 = new JButton("/");
		btnNewButton_10_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="/";
				jLabell.setText("");
			}
		});
		btnNewButton_10_3.setBounds(196, 127, 89, 23);
		contentPane.add(btnNewButton_10_3);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(jLabell.getText());
				switch(signo) {
				case "+":
				jLabell.setText(Integer.toString(num1+num2));
				break;
				case "-":
					jLabell.setText(Integer.toString(num1-num2));
					break;
				case "*":
					jLabell.setText(Integer.toString(num1*num2));
					break;
				case "/":
					jLabell.setText(Integer.toString(num1/num2));
					break;				

				
				
				}
			}
		});
		btnNewButton_11.setBounds(196, 161, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("aga click para la areas y perimetro");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
					areas_perimetro c= new areas_perimetro();
				c.setVisible(true);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_12.setBounds(208, 205, 197, 45);
		contentPane.add(btnNewButton_12);
	}

}
