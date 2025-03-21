import java.awt.EventQueue;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;

public class memorama {

	

	private JFrame frame;
	public ArrayList<JButton> cartas;
	/*declaro el arraylist en la clase principal para que sea un atributo global, se 
	convierte un atributo de la clase memorama. Y lo necesito para almacenar todos los
	botones del juego. ArrayList es una coleccion que nos permite guardar objetos del 
	mismo tipo usando un indice. Y puedo utilizar el arraylist en cualquier metodo de la clase.
	//declarar el arraylist solo reserva el espacio para la referencia pero no crea la 
	lista en la memoria aun en esta linea de codigo. Para eso debo inicializarlo  con new
	ArrayList<>() para que este listo para almacenar los botones*/
	
	
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(4, 4, 5, 5));
		
		
		cartas=new ArrayList<JButton>();
		/*Entonces declarar el arraylist en la clase memorama solo reserva el espacio pero no crea la lista en memoria
		 * por lo tanto debemos inicializarlo con new ArrayList<>() para que podamos almacenar los botones. Pero este debe
		 * hacerse antes de agregar los botones para que no haya errores. Es necesario declararlo en el initialize 
		 * porque se encarga de la parte grafica y organiza los botones*/
		
		
		for(int i=0;i<=15;i++) {//ciclo para crear y agregar las cartas al panel
			JButton carta=new JButton();
			carta.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/back.jpg")));
			cartas.add(carta);
			carta.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton carta_seleccionada=(JButton) e.getSource();
					/*Necesito saber cual boton fue presionado para cambiar su imagen, 
					 * por eso utilizo getSource."e" es el objeto de tipo actionEvent 
					 * que contiene informacion sobre el click del boton. y  getSource 
					 * devuelve el objeto que acciona el evento. Fue necesario hacer
					 * la conversion de tipo, porque getSource devuelve un objeto de tipo
					 * generico, pero como el evento proviene de un JButton es necesario
					 * convertirlo a ese tipo para poder utilizar metodos especificos
					 * de ese tipo de objeto, o sea el setIcon*/
					carta_seleccionada.setBackground(new Color(0, 128, 128));
					carta_seleccionada.setOpaque(false);
					carta_seleccionada.setIcon(new ImageIcon(memorama.class.getResource("/imagenes/cereza.jpg")));
				}
			});
			Collections.shuffle(cartas);
			/*Utilizo collections.shuffle para organizar aleatoriamente
			 * las cartas. Solo funciona con colecciones como arraylist, list, etc. 
			 * Pero primero debo agregar las cartas al array y despues mezclo el array
			 * antes de agregarlas al panel*/
			
			for(JButton carta1:cartas) {
				panel_1.add(carta1);
			}
			/*utilizo ciclo for each para recorrer los elementos de la lista
			 * y agregarlos al panel. Solo lo necesito si necesito acceder a los 
			 * elementos de una lista o un array pero no voy a modificarlos
			 * ni controlar su posicion*/
			
		}
			
			
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("New label");
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New label");
		panel.add(lblNewLabel_1_1);
		
	
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
	
	public class Carta extends JButton{
		boolean boca_abajo = true;
		boolean clicked_button = false;
		
		
		
		
		
		
		
		

		
		
		
	}

}
