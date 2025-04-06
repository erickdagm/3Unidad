package pacman1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pacman {

	private JFrame frame;
	private panelJuego panel = new panelJuego();
	private JButton btnReiniciar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pacman window = new pacman();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public pacman() {
		initialize();
	}

	// esta clase interna representa el panel donde se va a dibujar pacman y se mueve
	public class panelJuego extends JPanel implements KeyListener {

		private int pacmanX = 200;
		private int pacmanY = 130;
		private final int PACMAN_SIZE = 30;
		private final int MOVIMIENTO = 10;

		public panelJuego() {
			setBackground(Color.BLACK);
			setFocusable(true);
			addKeyListener(this); // se agrega el keylistener pa poder mover a pacman
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.YELLOW);
			// dibuja pacman con forma de circulo y como si tuviera la boca abierta
			g2d.fillArc(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE, 45, 270);
		}

		public void resetearPacman() {
		    pacmanX = 200;
		    pacmanY = 130;
		    repaint();
		    requestFocusInWindow(); // con esto se recupera el foco del teclado
		}

		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();

			// mueve pacman con WASD pero sin salirse del panel
			if (key == KeyEvent.VK_W && pacmanY - MOVIMIENTO >= 0) {
				pacmanY -= MOVIMIENTO;
			} else if (key == KeyEvent.VK_S && pacmanY + MOVIMIENTO + PACMAN_SIZE <= getHeight()) {
				pacmanY += MOVIMIENTO;
			} else if (key == KeyEvent.VK_A && pacmanX - MOVIMIENTO >= 0) {
				pacmanX -= MOVIMIENTO;
			} else if (key == KeyEvent.VK_D && pacmanX + MOVIMIENTO + PACMAN_SIZE <= getWidth()) {
				pacmanX += MOVIMIENTO;
			}
			repaint(); // actualiza el dibujo cada vez que se mueve
		}

		@Override
		public void keyReleased(KeyEvent e) {}

		@Override
		public void keyTyped(KeyEvent e) {}
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// panel del juego al centro
		frame.getContentPane().add(this.panel, BorderLayout.CENTER);

		// panel inferior con el boton
		JPanel panelInferior = new JPanel();
		panelInferior.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panelInferior, BorderLayout.SOUTH);

		btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.resetearPacman(); // cuando le das click al boton vuelve pacman al inicio
			}
		});
		panelInferior.add(btnReiniciar);
	}
}
