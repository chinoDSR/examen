package examen2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class areas_perimetro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					areas_perimetro frame = new areas_perimetro();
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
	public areas_perimetro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ir a calculadora");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setvisible(false);
				calculadora p= new calculadora();
				p.setVisible(true);
			}

			private void setvisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(159, 238, 265, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("triangulo");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLado = new JLabel("lado1");
		lblLado.setBounds(10, 42, 46, 14);
		contentPane.add(lblLado);
		
		JLabel lblLado_1 = new JLabel("lado2");
		lblLado_1.setBounds(10, 67, 46, 14);
		contentPane.add(lblLado_1);
		
		JLabel lblLado_2 = new JLabel("lado3");
		lblLado_2.setBounds(10, 103, 46, 14);
		contentPane.add(lblLado_2);
		
		JLabel lblNewLabel_4 = new JLabel("altura");
		lblNewLabel_4.setBounds(10, 131, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("base");
		lblNewLabel_5.setBounds(10, 156, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("area");
		lblNewLabel_6.setBounds(10, 181, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("perimetro");
		lblNewLabel_7.setBounds(10, 213, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(48, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(48, 64, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(48, 100, 86, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(48, 128, 86, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(48, 156, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(48, 181, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(66, 207, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblNewLabel_1 = new JLabel("cuadrado");
		lblNewLabel_1.setBounds(172, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("lado 1");
		lblNewLabel_1_1.setBounds(144, 42, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("area");
		lblNewLabel_1_2.setBounds(144, 70, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("perimetro");
		lblNewLabel_1_3.setBounds(144, 103, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(182, 39, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(172, 64, 86, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(196, 100, 86, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_2 = new JLabel("circulo");
		lblNewLabel_2.setBounds(337, 21, 63, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("radio");
		lblNewLabel_3.setBounds(288, 42, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("perimetro");
		lblNewLabel_3_1.setBounds(288, 67, 46, 14);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("area");
		lblNewLabel_3_2.setBounds(288, 103, 46, 14);
		contentPane.add(lblNewLabel_3_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(338, 39, 86, 20);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(338, 67, 86, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(338, 100, 86, 20);
		contentPane.add(textField_12);
		
		JButton btnNewButton_1 = new JButton("calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area, perimetro, lado1, lado2, lado3, base, altura;
				base=Double.valueOf(textField_4.getText());
				altura=Double.valueOf(textField_3.getText());
				lado1=Double.valueOf(textField.getText());
				lado2=Double.valueOf(textField_1.getText());
				lado3=Double.valueOf(textField_2.getText());
				
				area=base*altura;
				perimetro= lado1+lado2+lado3;
				
				textField_5.setText(String.valueOf(area));
				textField_6.setText(String.valueOf(perimetro));
				
				
				
				
				
			}
		});
		btnNewButton_1.setBounds(45, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("calcular2");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
Double area, perimetro, lado1;				
				
lado1=Double.valueOf(textField_7.getText());


perimetro=lado1*4;
area=lado1*lado1;


textField_8.setText(String.valueOf(area));
textField_9.setText(String.valueOf(perimetro));


			}
		});
		btnNewButton_1_1.setBounds(182, 156, 89, 23);
		contentPane.add(btnNewButton_1_1);
	}
}
