package Paint;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Teclado {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 808, 602);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Ingresa texto");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 11, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Q");
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.magenta));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("W");
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("E");
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_1.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("R");
		lblNewLabel_2_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_2.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("T");
		lblNewLabel_2_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_3.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("T");
		lblNewLabel_2_4.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_4.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Y");		
		lblNewLabel_2_5.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_5.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("U");
		lblNewLabel_2_6.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_6.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("I");
		lblNewLabel_2_7.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_7.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("O");
		lblNewLabel_2_8.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_8.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_5 = new JLabel("Backspace");
		lblNewLabel_5.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);

		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_9 = new JLabel("P");
		lblNewLabel_2_9.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_9.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_10 = new JLabel("A");
		lblNewLabel_2_10.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_10.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_10);
		
		JLabel lblNewLabel_2_11 = new JLabel("S");
		lblNewLabel_2_11.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_11.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_11);
		
		JLabel lblNewLabel_2_12 = new JLabel("D");
		lblNewLabel_2_12.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_12.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_12);
		
		JLabel lblNewLabel_2_13 = new JLabel("F");
		lblNewLabel_2_13.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_13);
		
		JLabel lblNewLabel_2_13_1 = new JLabel("G");
		lblNewLabel_2_13_1.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_1.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_1);
		
		JLabel lblNewLabel_2_13_2 = new JLabel("H");
		lblNewLabel_2_13_2.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_2.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_2);
		
		JLabel lblNewLabel_2_13_3 = new JLabel("J");
		lblNewLabel_2_13_3.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_3.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_3);
		
		JLabel lblNewLabel_2_13_4 = new JLabel("K");
		lblNewLabel_2_13_4.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_4.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_4);
		
		JLabel lblNewLabel_2_13_5 = new JLabel("L");
		lblNewLabel_2_13_5.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_5.setBorder(BorderFactory.createLineBorder(Color.magenta));
		panel_1.add(lblNewLabel_2_13_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter");
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_13_6 = new JLabel("Z");
		lblNewLabel_2_13_6.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_2_13_6.setHorizontalAlignment(JLabel.CENTER);

		panel_1.add(lblNewLabel_2_13_6);
		
		JLabel lblNewLabel_2_13_7 = new JLabel("X");
		lblNewLabel_2_13_7.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_2_13_7.setHorizontalAlignment(JLabel.CENTER);

		panel_1.add(lblNewLabel_2_13_7);
		
		JLabel lblNewLabel_2_13_8 = new JLabel("C");
		lblNewLabel_2_13_8.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_2_13_8.setHorizontalAlignment(JLabel.CENTER);

		panel_1.add(lblNewLabel_2_13_8);
		
		JLabel lblNewLabel_2_13_9 = new JLabel("V");
		lblNewLabel_2_13_9.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_9.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_13_9);
		
		JLabel lblNewLabel_2_13_10 = new JLabel("B");
		lblNewLabel_2_13_10.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_10.setBorder(BorderFactory.createLineBorder(Color.magenta));

		panel_1.add(lblNewLabel_2_13_10);
		
		JLabel lblNewLabel_2_13_11 = new JLabel("N");
		lblNewLabel_2_13_11.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_11.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_11);
		
		JLabel lblNewLabel_2_13_12 = new JLabel("M");
		lblNewLabel_2_13_12.setHorizontalAlignment(JLabel.CENTER);
		lblNewLabel_2_13_12.setBorder(BorderFactory.createLineBorder(Color.magenta));


		panel_1.add(lblNewLabel_2_13_12);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 128));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("↓");
		lblNewLabel_8.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_8.setHorizontalAlignment(JLabel.CENTER);

		
		lblNewLabel_8.setBounds(21, 132, 27, 29);
		panel_3.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("→");
		lblNewLabel_9.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_9.setHorizontalAlignment(JLabel.CENTER);

		lblNewLabel_9.setBounds(33, 110, 49, 14);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("←");
		lblNewLabel_10.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_10.setHorizontalAlignment(JLabel.CENTER);

		lblNewLabel_10.setBounds(-11, 110, 49, 14);
		panel_3.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("↑");
		lblNewLabel_11.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_11.setHorizontalAlignment(JLabel.CENTER);

		lblNewLabel_11.setBounds(10, 93, 49, 14);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_7 = new JLabel("Shift");
		lblNewLabel_7.setBorder(BorderFactory.createLineBorder(Color.magenta));

		lblNewLabel_7.setHorizontalAlignment(JLabel.CENTER);

		panel_1.add(lblNewLabel_7);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		panel_2.add(lblNewLabel_4);
	}
}
