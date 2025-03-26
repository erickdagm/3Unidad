package examen2U;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JTable;

public class examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
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
	public examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 2, 786, 93);
		panel_1.setBackground(new Color(64, 128, 128));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(64, 128, 128));
		panel_1.add(panel);
		panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Factura en Java");
		lblNewLabel.setHorizontalAlignment((int) Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Nunito",Font.BOLD,20));
		lblNewLabel.setForeground(Color.white);
		panel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 95, 786, 93);
		panel_2.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_2);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setBounds(10, 11, 108, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre(s):");
		lblNewLabel_2.setBounds(10, 36, 67, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno:");
		lblNewLabel_3.setBounds(245, 36, 108, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno:");
		lblNewLabel_4.setBounds(482, 36, 108, 14);
		panel_2.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(84, 36, 138, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(351, 36, 108, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(593, 36, 119, 20);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Domicilio:");
		lblNewLabel_5.setBounds(10, 68, 77, 14);
		panel_2.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 65, 200, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Teléfono:");
		lblNewLabel_6.setBounds(324, 68, 64, 14);
		panel_2.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(398, 65, 119, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("RFC:");
		lblNewLabel_11.setBounds(559, 68, 49, 14);
		panel_2.add(lblNewLabel_11);
		
		textField_5 = new JTextField();
		textField_5.setBounds(603, 65, 109, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 188, 786, 93);
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));

		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Datos de factura");
		lblNewLabel_7.setBounds(10, 11, 99, 14);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Folio fiscal: ");
		lblNewLabel_8.setFont(new Font("",Font.BOLD,12));
		lblNewLabel_8.setBounds(10, 36, 86, 14);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("20004-yydjldnh-19h87hu3773");
		lblNewLabel_9.setBounds(92, 36, 178, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Emisor:");
		lblNewLabel_10.setFont(new Font("",Font.BOLD,12));
		lblNewLabel_10.setBounds(10, 61, 49, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9_1 = new JLabel("Servicios de limpieza \"AquaClean\"");
		lblNewLabel_9_1.setBounds(92, 61, 226, 14);
		panel_3.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_12 = new JLabel("Fecha:");
		lblNewLabel_12.setBounds(342, 37, 49, 14);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("25 Marzo del 2025");
		lblNewLabel_13.setBounds(401, 37, 113, 14);
		panel_3.add(lblNewLabel_13);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 281, 786, 93);
		panel_4.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("Ver facturas emitidas");
		btnNewButton.setBackground(Color.white);
		btnNewButton.setIcon(new ImageIcon(examen.class.getResource("/Sprites/lista.png")));
		btnNewButton.setBounds(0, 0, 211, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Añadir");
		btnNewButton_1.setBackground(Color.white);
		btnNewButton_1.setIcon(new ImageIcon(examen.class.getResource("/Sprites/anadir.png")));
		btnNewButton_1.setBounds(452, 0, 156, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBackground(Color.white);
		btnNewButton_2.setIcon(new ImageIcon(examen.class.getResource("/Sprites/eliminar.png")));
		btnNewButton_2.setBounds(651, 0, 125, 23);
		panel_4.add(btnNewButton_2);
		
		String title[] = { "Folio","Cliente", "Fecha", "Subtotal", "Total" };
		String data[][] = {	{ "200874-aanffj9f8r9-ajs93u", "2021-08-10", "Maria Cabrera", "$1828.76" ,"$2090.25"},
							{ "200874-aanffj9f8r9-j7s7hs", "2021-08-10", "Maria Cadena", "$15,397" ,"$17,220.50"},
							{ "200874-jjd8f899f88-ueue8", "2021-08-10", "Maria Cardenas", "$726.55" ,"$850.15"},
							{ "200874-aanffj9f8r9-ajs93u", "2021-08-10", "Maria Lopez", "$220.00" ,"$250.00"}};

		JTable tabla = new JTable(data, title);
		JScrollPane scroll=new JScrollPane(tabla);
		scroll.setSize(700,65);
		scroll.setLocation(40,34);
//		tabla.setSize(700, );
//		tabla.setLocation(25, 41);

		panel_4.add(scroll);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 374, 786, 93);
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY,1));

		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_14 = new JLabel("Subtotal: ");
		lblNewLabel_14.setBounds(10, 11, 49, 14);
		panel_5.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("% Descuento:");
		lblNewLabel_15.setBounds(10, 32, 80, 14);
		panel_5.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("IVA 16%:");
		lblNewLabel_16.setBounds(10, 57, 49, 14);
		panel_5.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Total");
		lblNewLabel_17.setBounds(10, 79, 49, 14);
		panel_5.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("$1,289.00");
		lblNewLabel_18.setBounds(115, 11, 62, 14);
		panel_5.add(lblNewLabel_18);
		
		JLabel lblNewLabel_18_1 = new JLabel("10");
		lblNewLabel_18_1.setBounds(115, 32, 49, 14);
		panel_5.add(lblNewLabel_18_1);
		
		JLabel lblNewLabel_18_1_1 = new JLabel("$190.56");
		lblNewLabel_18_1_1.setBounds(115, 57, 49, 14);
		panel_5.add(lblNewLabel_18_1_1);
		
		JLabel lblNewLabel_19 = new JLabel("$1489.56");
		lblNewLabel_19.setBounds(115, 79, 62, 14);
		panel_5.add(lblNewLabel_19);
		
		JButton btnNewButton_3 = new JButton("Generar factura");
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(302, 481, 130, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Limpiar");
		btnNewButton_4.setBackground(new Color(255, 255, 128));
		btnNewButton_4.setForeground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(327, 515, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
	}
}
