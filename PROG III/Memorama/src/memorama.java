import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class memorama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					memorama window = new memorama();
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
	public memorama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.EAST);
		panel.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		panel.add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 5, 5));
		
		JButton btnNewButton_3_9 = new JButton("New button");
		btnNewButton_3_9.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_9);
		
		JButton btnNewButton_3_8 = new JButton("New button");
		btnNewButton_3_8.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_8);
		
		JButton btnNewButton_3_7 = new JButton("New button");
		btnNewButton_3_7.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/2148383543.jpg")));
		panel_1.add(btnNewButton_3_7);
		
		JButton btnNewButton_3_6 = new JButton("New button");
		panel_1.add(btnNewButton_3_6);
		
		JButton btnNewButton_3_5 = new JButton("New button");
		btnNewButton_3_5.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_5);
		
		JButton btnNewButton_3_4 = new JButton("New button");
		btnNewButton_3_4.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_4);
		
		JButton btnNewButton_3_3 = new JButton("New button");
		btnNewButton_3_3.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/389442171_4a827c5c-28ea-4255-a473-fb29c296e29d.jpg")));
		panel_1.add(btnNewButton_3_3);
		
		JButton btnNewButton_3_3_4 = new JButton("New button");
		panel_1.add(btnNewButton_3_3_4);
		
		JButton btnNewButton_3_3_3 = new JButton("New button");
		btnNewButton_3_3_3.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_3_3);
		
		JButton btnNewButton_3_3_2 = new JButton("New button");
		btnNewButton_3_3_2.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_3_2);
		
		JButton btnNewButton_3_3_1 = new JButton("New button");
		panel_1.add(btnNewButton_3_3_1);
		
		JButton btnNewButton_3_2 = new JButton("New button");
		panel_1.add(btnNewButton_3_2);
		
		JButton btnNewButton_3_1 = new JButton("New button");
		btnNewButton_3_1.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_3_5 = new JButton("New button");
		btnNewButton_3_3_5.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
		panel_1.add(btnNewButton_3_3_5);
		
		JButton btnNewButton_3_3_5_1 = new JButton("New button");
		panel_1.add(btnNewButton_3_3_5_1);
		
		JButton btnNewButton_3_3_5_1_1 = new JButton("New button");
		panel_1.add(btnNewButton_3_3_5_1_1);
		
		JLabel lblNewLabel = new JLabel("Juego de memoria");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setFont(new Font("Nunito",Font.BOLD,18));
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);;
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnNewButton_4 = new JButton("Reiniciar tablero");
		frame.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
	}

}
