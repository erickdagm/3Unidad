import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;

public class Ventana5 {

	private JFrame frame;
	private JTextField txtRegistroDeUsuario;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtErick;
	private JTextField txtGonzalez;
	private JTextField txtMartinez;
	private JPanel panel_7;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_6;
	private JPanel panel_8;
	private JComboBox comboBox_3;
	private JPanel panel_9;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel_7;
	private JPanel panel_10;
	private JPanel panel_11;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JPanel panel_12;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana5 window = new Ventana5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 910, 558);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		txtRegistroDeUsuario = new JTextField();
		txtRegistroDeUsuario.setBackground(new Color(255, 255, 255));
		txtRegistroDeUsuario.setText("Registro de usuario");
		panel.add(txtRegistroDeUsuario, BorderLayout.NORTH);
		txtRegistroDeUsuario.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 128));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(201, 213, 191));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setForeground(new Color(255, 255, 255));
		panel_6.setBackground(new Color(201, 213, 191));
		panel_3.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(6, 2, 10, 10));
		
		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(201, 213, 191));
		lblNewLabel.setOpaque(true);
		panel_6.add(lblNewLabel);
		
		txtErick = new JTextField();
		txtErick.setText("Erick");
		panel_6.add(txtErick);
		txtErick.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Apellido paterno");
		panel_6.add(lblNewLabel_1);
		
		txtGonzalez = new JTextField();
		txtGonzalez.setText("Gonzalez");
		panel_6.add(txtGonzalez);
		txtGonzalez.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Apellido materno");
		panel_6.add(lblNewLabel_2);
		
		txtMartinez = new JTextField();
		txtMartinez.setText("Martinez");
		panel_6.add(txtMartinez);
		txtMartinez.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Fecha de nacimiento");
		panel_6.add(lblNewLabel_3);
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(201, 213, 191));
		panel_6.add(panel_7);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		panel_7.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
		panel_7.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989"}));
		panel_7.add(comboBox_2);
		
		lblNewLabel_4 = new JLabel("Nacionalidad");
		panel_6.add(lblNewLabel_4);
		
		panel_8 = new JPanel();
		panel_8.setBackground(new Color(201, 213, 191));
		panel_6.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"México", "Perú", "Estados Unidos", "Europa"}));
		panel_8.add(comboBox_3, BorderLayout.NORTH);
		
		lblNewLabel_5 = new JLabel("Sexo");
		panel_6.add(lblNewLabel_5);
		
		panel_9 = new JPanel();
		panel_9.setBackground(new Color(201, 213, 191));
		panel_9.setOpaque(true);
		panel_6.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(new Color(201, 213, 191));
		panel_9.add(rdbtnNewRadioButton, BorderLayout.NORTH);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(201, 213, 191));
		panel_9.add(rdbtnNewRadioButton_1, BorderLayout.SOUTH);
		
		lblNewLabel_6 = new JLabel("Datos Generales");
		lblNewLabel_6.setBackground(new Color(201, 213, 191));
		panel_3.add(lblNewLabel_6, BorderLayout.NORTH);
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(64, 128, 128));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_7 = new JLabel("Perfil de usuario");
		lblNewLabel_7.setBackground(new Color(165, 209, 209));
		lblNewLabel_7.setOpaque(true);
		panel_4.add(lblNewLabel_7, BorderLayout.NORTH);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(165, 209, 209));
		panel_4.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(new BorderLayout(0, 0));
		
		panel_11 = new JPanel();
		panel_10.add(panel_11, BorderLayout.SOUTH);
		panel_11.setLayout(new BorderLayout(0, 0));
		
		chckbxNewCheckBox = new JCheckBox("New check box");
		panel_11.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox_1.setBackground(new Color(165, 209, 209));
		chckbxNewCheckBox_1.setSelected(true);
		panel_11.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_2.setBackground(new Color(165, 209, 209));
		chckbxNewCheckBox_2.setSelected(true);
		panel_11.add(chckbxNewCheckBox_2, BorderLayout.SOUTH);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\Usuario2.png"));
		panel_10.add(lblNewLabel_8, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(219, 219, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_9 = new JLabel("Datos Opcionales");
		lblNewLabel_9.setBackground(new Color(219, 219, 255));
		panel_2.add(lblNewLabel_9, BorderLayout.NORTH);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(219, 219, 255));
		panel_2.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new GridLayout(2, 2, 10, 10));
		
		lblNewLabel_10 = new JLabel("Descripción");
		panel_12.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		panel_12.add(lblNewLabel_11);
		
		textArea = new JTextArea();
		panel_12.add(textArea);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_5);
	}

}
