
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
//

public class Ventana extends JFrame {

	public Ventana() {

		this.setVisible(true);//
		this.setSize(1000, 700);// atributo para modificar el tamano
		this.setLocationRelativeTo(null);// atributo para centrar, relative to sirve para colocar en una ubicacion
											// especifica de otro objeto, pero como no hay objeto, pues lo centramos con
											// null

		this.setTitle("Inicio de sesion");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// this.setResizable(false); si quiero que sea redimensionable le coloco true

		this.setMaximumSize(new Dimension(800, 400));
		this.setMinimumSize(new Dimension(400, 400));

		this.add(this.login());// add permite agregar todo lo que queremos dentrod e la ventana, entonces
									// estamos pidiendo agregar el objeto login a Ventana
		// this.add(this.registro());//add permite agregar todo lo que queremos dentrod
		// e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		// this.add(this.users());//add permite agregar todo lo que queremos dentrod e
		// la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		//

		JMenuBar barra = new JMenuBar();

		JMenu Cuenta = new JMenu("Cuenta");
		barra.add(Cuenta);

		JMenuItem login = new JMenuItem("Ir a login");
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");

			}
		});
		Cuenta.add(login);

		JMenuItem registro = new JMenuItem("Ir a registro");
		registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Registro");
			}
		});
		Cuenta.add(registro);
		//

		JMenuItem recuperar = new JMenuItem("Recuperar contraseña");
		recuperar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Recuperar contraseña");
			}
		});
		Cuenta.add(recuperar);

		JMenu Usuarios = new JMenu("Usuarios");
		barra.add(Usuarios);

		JMenuItem alta = new JMenuItem("Alta de usuario");
		alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Alta de usuario");
			}
		});
		Usuarios.add(alta);

		JMenuItem baja = new JMenu("Baja de usuario");
		baja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Baja de usuario");
			}
		});
		Usuarios.add(baja);

		JMenuItem users = new JMenuItem("Consultar usuario");
		users.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Consulta de usuario");
			}
		});
		Usuarios.add(users);

		JMenu ayuda = new JMenu("Ayuda");

		JMenuItem createUser = new JMenuItem("¿Cómo crear un usuario?");
		createUser.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Cómo crear un usuario?");
			}
		});
		ayuda.add(createUser);

		JMenuItem accessSystem = new JMenuItem("¿Cómo acceder al sistema?");
		accessSystem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Cómo acceder al sistema?");
			}
		});
		ayuda.add(accessSystem);

		JMenuItem forgotPass = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		forgotPass.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Qué pasa si olvidé mi contraseña?");
			}
		});
		ayuda.add(forgotPass);

		barra.add(ayuda);

		this.setJMenuBar(barra);

		this.repaint();
		this.revalidate();

	}

	public void router(String route) {
		this.getContentPane().removeAll();
		if (route.equals("Registro")) {
			this.add(this.registro());

		}
		if (route.equals("Login")) {
			this.add(this.login());
		}

		if (route.equals("Recuperar contraseña")) {
			this.add(this.recuperar());
		}
		if (route.equals("Alta de usuario")) {
			this.add(this.alta());
		}
		if (route.equals("Baja de usuario")) {
			this.add(this.baja());
		}
		if (route.equals("Consulta de usuario")) {
			this.add(this.users());
		}
		if (route.equals("¿Cómo crear un usuario?")) {
			this.add(this.createUser());
		}
		if (route.equals("¿Qué pasa si olvidé mi contraseña?")) {
			this.add(this.forgotPass1());
		}
		if (route.equals("¿Cómo acceder al sistema?")) {
			this.add(this.accessSystem());
		}
		

		this.repaint();
		this.revalidate();
	}

	public JPanel forgotPass1() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");
			}
		});
		
		JLabel lblNewLabel = new JLabel("Tutorial para recuperar contraseña");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(6, 0, 0, 0));
		
		JTextArea txtrPasoAbrir = new JTextArea();
		txtrPasoAbrir.setText("Paso 1: Abrir el Programa\nInicia el programa desde el ícono en tu escritorio o desde el menú de inicio.");
		panel_1.add(txtrPasoAbrir);
		
		JTextArea txtrPasoIr = new JTextArea();
		txtrPasoIr.setText("Paso 2: Ir a la Pantalla de Inicio de Sesión\nEn la pantalla donde se ingresa el usuario y contraseña, busca el enlace que dice:\n👉 \"¿Olvidaste tu contraseña?\"");
		panel_1.add(txtrPasoIr);
		
		JTextArea txtrPasoHacer = new JTextArea();
		txtrPasoHacer.setText("Paso 3: Hacer Clic en \"¿Olvidaste tu Contraseña?\"\nHaz clic en el enlace para abrir la ventana de recuperación de contraseña.");
		panel_1.add(txtrPasoHacer);
		
		JTextArea txtrPasoIngresar = new JTextArea();
		txtrPasoIngresar.setText("Paso 4: Ingresar Información para Recuperar la Contraseña\nDependiendo del sistema, puede pedirte una de estas opciones:\n\nCorreo electrónico: Ingresa tu correo registrado para recibir un enlace de recuperación.\nPregunta de seguridad: Responde correctamente la pregunta configurada al momento de tu registro.");
		panel_1.add(txtrPasoIngresar);
		
		JTextArea txtrPasoVerificar = new JTextArea();
		txtrPasoVerificar.setText("Paso 5: Verificar y Restablecer la Contraseña\nSi elegiste correo electrónico, revisa tu bandeja de entrada y sigue el enlace para crear una nueva contraseña.\nSi usaste la pregunta de seguridad, el sistema te permitirá ingresar una nueva contraseña tras responder correctamente.");
		panel_1.add(txtrPasoVerificar);
		
		JTextArea txtrPasoConfirmar = new JTextArea();
		txtrPasoConfirmar.setText("Paso 6: Confirmar la Nueva Contraseña\nCrea una nueva contraseña segura y confírmala. Luego, haz clic en \"Guardar\" para finalizar el proceso.");
		panel_1.add(txtrPasoConfirmar);
		
		return (JPanel) frame.getContentPane();
		
	}
	
	public JPanel createUser() {
		JPanel mipanel = new JPanel(); // ESTE BLOQUE MODIFICA LO RELACIONADO CON EL PANEL DE LOGIN
		mipanel.setBackground(Color.decode("0x415C95"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(800, 600);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);
		mipanel.revalidate();
		mipanel.repaint();

		JLabel head1 = new JLabel("¿Cómo crear un usuario?");
		head1.setOpaque(false);
		head1.setBounds(400, 100, 200, 40);
		head1.setForeground(Color.white);
		mipanel.add(head1);
		return mipanel;
	}

	public JPanel forgotPass() {
		JPanel mipanel = new JPanel(); // ESTE BLOQUE MODIFICA LO RELACIONADO CON EL PANEL DE LOGIN
		mipanel.setBackground(Color.decode("0x415C95"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(800, 600);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);
		mipanel.revalidate();
		mipanel.repaint();

		JLabel head1 = new JLabel("¿Olvidaste tu contraseña?");
		head1.setOpaque(false);
		head1.setBounds(400, 100, 200, 40);
		head1.setForeground(Color.white);
		mipanel.add(head1);
		return mipanel;
	}

	public JPanel accessSystem() {
		JPanel mipanel = new JPanel(); // ESTE BLOQUE MODIFICA LO RELACIONADO CON EL PANEL DE LOGIN
		mipanel.setBackground(Color.decode("0x415C95"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(800, 600);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);
		mipanel.revalidate();
		mipanel.repaint();

		JLabel head1 = new JLabel("¿Cómo acceder al sistema?");
		head1.setOpaque(false);
		head1.setBounds(400, 100, 200, 40);
		head1.setForeground(Color.white);
		mipanel.add(head1);
		return mipanel;
	}

	public JPanel alta() {
		JFrame frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_1 = new JButton("Inicio");
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton_1);
		
		JTextField txtAltaDeUsuario = new JTextField();
		txtAltaDeUsuario.setText("ALTA DE USUARIO");
		txtAltaDeUsuario.setHorizontalAlignment(0);
		txtAltaDeUsuario.setOpaque(false);	
		txtAltaDeUsuario.setColumns(15);
		panel.add(txtAltaDeUsuario);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(113, 7, 136, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox_1.setBounds(113, 33, 167, 23);
		panel_2.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\Usuario2.png"));
		panel_1.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setForeground(Color.WHITE);
		panel_3.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(8, 2, 10, 10));
		
		JLabel lblNewLabel_8 = new JLabel("Numero de empleado");
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBackground(Color.WHITE);
		panel_3.add(lblNewLabel_8);
		
		JTextField textField_3 = new JTextField();
		textField_3.setText("20239802");
		textField_3.setColumns(10);
		panel_3.add(textField_3);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		panel_3.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setText("Erick");
		textField.setColumns(10);
		panel_3.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido paterno");
		panel_3.add(lblNewLabel_3);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText("Gonzalez");
		textField_1.setColumns(10);
		panel_3.add(textField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido materno");
		panel_3.add(lblNewLabel_4);
		
		JTextField textField_2 = new JTextField();
		textField_2.setText("Martinez");
		textField_2.setColumns(10);
		panel_3.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de nacimiento");
		panel_3.add(lblNewLabel_5);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_4);
		
		JComboBox comboBox = new JComboBox();
		panel_4.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		panel_4.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		panel_4.add(comboBox_2);
		
		JLabel lblNewLabel_6 = new JLabel("Nacionalidad");
		panel_3.add(lblNewLabel_6);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_5);
		panel_5.setSize(50,20);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"México", "Perú", "Estados Unidos"}));
		comboBox_3.setMaximumRowCount(0);
		comboBox_3.setSize(20,10);
		panel_5.add(comboBox_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo");
		panel_3.add(lblNewLabel_7,BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setOpaque(true);
		panel_6.setBackground(new Color(201, 213, 191));
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		panel_6.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(new Color(255, 255, 255));
		panel_6.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setOpaque(true);
		btnNewButton.setSize(20,10);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(44, 158, 61));
		panel_3.add(btnNewButton,BorderLayout.NORTH);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");				
			}
		});
		
		
		return (JPanel) frame.getContentPane();
	}

	public JPanel baja() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("Inicio");
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Baja de usuario");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JTextArea txtrIngresaElNmero = new JTextArea();
		txtrIngresaElNmero.setEditable(false);
		txtrIngresaElNmero.setOpaque(false);
		txtrIngresaElNmero.setText("Ingresa el número de empleado \npara dar de baja");
		txtrIngresaElNmero.setBounds(301, 172, 179, 58);
		panel_1.add(txtrIngresaElNmero);
		
		JTextField textField = new JTextField();
		textField.setBounds(301, 230, 179, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(196, 186, 9));
		btnNewButton.setBounds(335, 261, 115, 23);
		panel_1.add(btnNewButton);
		
		return (JPanel) frame.getContentPane();
	}

	public JPanel login() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion

		Font fuente = new Font("Nunito", Font.BOLD, 16);

		JPanel loginCont = new JPanel();
		loginCont.setLayout(null);
		loginCont.setBackground(Color.decode("0xDDDBC0"));
		loginCont.setBounds(40, 80, 380, 490);
		loginCont.setOpaque(true);
		loginCont.setVisible(true);
		loginCont.repaint();

		JPanel mipanel = new JPanel(); // ESTE BLOQUE MODIFICA LO RELACIONADO CON EL PANEL DE LOGIN
		mipanel.setBackground(Color.decode("0x415C95"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(1000, 700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);
		mipanel.revalidate();
		mipanel.repaint();
		;
		// mipanel.setLayout(null);

		JLabel etiqueta1 = new JLabel("¡Bienvenido!");// ESTE BLOQUE ES LA ETIQUETE DEL HEADER
		etiqueta1.setSize(100, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(40, 30);
		// etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		etiqueta1.setForeground(Color.BLACK);
		mipanel.add(etiqueta1);

		ImageIcon icon2 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\Logo.png");// instancio un
																										// objeto de
																										// tipo
																										// imageicon, y
																										// especificamaos
																										// la ruta para
																										// cargar el
																										// archivo
		Image img2 = icon2.getImage();// obtenemos la imagen
		Image imgScaled2 = img2.getScaledInstance(300, 300, Image.SCALE_SMOOTH);// escalamos la imagen
		ImageIcon iconScaled2 = new ImageIcon(imgScaled2);// creamos un ImageIcon con la imagen escalada, se hizo de
															// esta forma porque no se puede modificar el tamano de la
															// imagen dentro del JLAbel directamente

		JLabel logo = new JLabel();
		logo.setBounds(540, 180, 300, 300);
		logo.setVisible(true);
		logo.setIcon(iconScaled2);

		mipanel.add(logo);

		//////////////////////////////////////////////////// USUARIO/////////////////////////////////////////////////////////////////////////////

		JLabel etiqueta2 = new JLabel("Ingresa tu correo");
		etiqueta2.setSize(300, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta2.setLocation(40, 115);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta2.setFont(fuente);
		etiqueta2.setForeground(Color.BLACK);
		mipanel.add(etiqueta2);

		JPanel userCont = new JPanel();
		userCont.setLayout(null);
		Border borde = BorderFactory.createLineBorder(Color.black, 2);
		userCont.setBorder(borde);
		userCont.setLocation(40, 150);

		userCont.setSize(300, 40);
		userCont.setBackground(Color.WHITE);
		// userCont.setPreferredSize(getPreferredSize());;
		userCont.setOpaque(true);
		userCont.setVisible(true);

		mipanel.add(userCont);

		ImageIcon icon = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\usuario.png");// instancio un
																										// objeto de
																										// tipo
																										// imageicon, y
																										// especificamaos
																										// la ruta para
																										// cargar el
																										// archivo
		Image img = icon.getImage();// obtenemos la imagen
		Image imgScaled = img.getScaledInstance(25, 30, Image.SCALE_SMOOTH);// escalamos la imagen
		ImageIcon iconScaled = new ImageIcon(imgScaled);// creamos un ImageIcon con la imagen escalada, se hizo de esta
														// forma porque no se puede modificar el tamano de la imagen
														// dentro del JLAbel directamente

		JLabel usuario = new JLabel();// se crea una etiqueta para insertar la imagen dentro
		usuario.setIcon(iconScaled);
		usuario.setLocation(0, 6);
		usuario.setSize(30, 30);
		usuario.setVisible(true);
		usuario.repaint();
		// usuario.setBounds(0, 5, 15, 15);

		JTextField email = new JTextField();
		email.setSize(272, 36);
		email.setLocation(26, 3);
		email.setColumns(20);
		email.setOpaque(false);
		email.setBackground(Color.white);
		email.setFont(new Font("Nunito", Font.BOLD, 14));
		email.setVisible(true);
		// email.setBounds(40, 150, 300, 40);

		userCont.add(usuario);
		userCont.add(email);
		email.requestFocus();

		System.out.println("userCont bounds: " + userCont.getBounds());
		System.out.println("email bounds: " + email.getBounds());// esto lo imrpimi para saber en donde se estaba
																	// imrpimiendo el panel y el field de email

		////////////////////////////////////////////////////////////////////// CONTRASENA/////////////////////////////////////////////////////

		JLabel etiqueta3 = new JLabel("Ingresa tu contraseña");
		etiqueta3.setSize(300, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta3.setLocation(40, 220);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta3.setFont(fuente);
		etiqueta3.setForeground(Color.BLACK);
		mipanel.add(etiqueta3);

		JPanel passCont = new JPanel();
		passCont.setLayout(null);
		// Border borde=BorderFactory.createLineBorder(Color.red,2);
		passCont.setBorder(borde);
		passCont.setLocation(40, 255);

		passCont.setSize(300, 40);
		passCont.setBackground(Color.WHITE);
		// userCont.setPreferredSize(getPreferredSize());;
		passCont.setOpaque(true);
		passCont.setVisible(true);

		mipanel.add(passCont);

		ImageIcon icon1 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\contrasena.png");// instancio
																											// un objeto
																											// de tipo
																											// imageicon,
																											// y
																											// especificamaos
																											// la ruta
																											// para
																											// cargar el
																											// archivo
		Image img1 = icon1.getImage();// obtenemos la imagen
		Image imgScaled1 = img1.getScaledInstance(25, 30, Image.SCALE_SMOOTH);// escalamos la imagen
		ImageIcon iconScaled1 = new ImageIcon(imgScaled1);// creamos un ImageIcon con la imagen escalada, se hizo de
															// esta forma porque no se puede modificar el tamano de la
															// imagen dentro del JLAbel directamente

		JLabel password = new JLabel();// se crea una etiqueta para insertar la imagen dentro
		password.setIcon(iconScaled1);
		password.setLocation(0, 6);
		password.setSize(30, 30);
		password.setVisible(true);
		password.repaint();
		// usuario.setBounds(0, 5, 15, 15);

		JPasswordField contrasena = new JPasswordField();
		contrasena.setSize(272, 36);
		contrasena.setLocation(26, 2);
		contrasena.setColumns(20);
		contrasena.setOpaque(false);
		contrasena.setBackground(Color.white);
		contrasena.setFont(new Font("Nunito", Font.BOLD, 14));
		contrasena.setVisible(true);
		// email.setBounds(40, 150, 300, 40);

		passCont.add(password);
		passCont.add(contrasena);
		// email.requestFocus();

		System.out.println("userCont bounds: " + userCont.getBounds());
		System.out.println("email bounds: " + email.getBounds());// esto lo imrpimi para saber en donde se estaba
																	// imrpimiendo el panel y el field de
																	// email///////////////////////////////////////////////////////////////CONTRASENA////////////////////////////////////////////////////////////////

		/////////////////////////////////////////////////////////// CONTRASENA//////////////////////////////////////////////////////////////////

		JCheckBox miCheck = new JCheckBox();
		miCheck.setOpaque(false);
		miCheck.setText("Recordar mis credenciales");
		miCheck.setVisible(true);
		miCheck.setForeground(Color.BLACK);
		miCheck.setBackground(Color.decode("0xDDDEBC"));
		miCheck.setFont(new Font("Nunito", Font.PLAIN, 12));
		miCheck.setBounds(37, 323, 200, 30);
		mipanel.add(miCheck);

		JLabel recordar2 = new JLabel("¿Olvidaste tu contraseña?");
		recordar2.setSize(300, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		recordar2.setLocation(215, 282);
		recordar2.setForeground(Color.BLACK);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar2.setFont(new Font("Nunito", Font.BOLD, 10));
		mipanel.add(recordar2);

		JButton boton = new JButton("Iniciar sesión");
		boton.setBackground(Color.decode("0x93CEEA"));
		boton.setSize(200, 40);
		boton.setLocation(40, 400);
		boton.setLayout(null);
		boton.setForeground(Color.BLACK);
		boton.setVisible(true);
		boton.setFont(fuente);
		mipanel.add(boton);

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean flag1 = false, flag2 = false;
				// TODO Auto-generated method stub
				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red, 5));
				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					flag1 = true;
				}

				String passw = new String(contrasena.getPassword());
				if (passw.equals("")) {
					contrasena.setBorder(BorderFactory.createLineBorder(Color.red, 5));

				} else {
					contrasena.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					flag2 = true;
				}

				if (flag1 && flag2) {
					if (email.getText().equals("erickdagm"))
						if (password.equals("contrasena1")) {
							JOptionPane.showMessageDialog(null, "Bienvenido", ".", JOptionPane.WARNING_MESSAGE);

						} else {
							JOptionPane.showMessageDialog(null, "Verifique los datos de inicio de sesion", ".",
									JOptionPane.ERROR_MESSAGE);

						}

				}
			}
		});

		loginCont.add(etiqueta1);
		loginCont.add(recordar2);
		loginCont.add(miCheck);
		loginCont.add(passCont);
		loginCont.add(etiqueta3);
		loginCont.add(userCont);
		loginCont.add(etiqueta2);
		loginCont.add(boton);

		mipanel.add(loginCont);

		JButton ir_registro = new JButton("Ir a registro");
		ir_registro.setBackground(Color.decode("0x93CEEA"));
		ir_registro.setSize(200, 40);
		ir_registro.setLocation(700, 500);
		ir_registro.setLayout(null);
		ir_registro.setForeground(Color.BLACK);
		ir_registro.setVisible(true);
		ir_registro.setFont(fuente);
		mipanel.add(ir_registro);

		ir_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Registro");

			}

		});

		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana

	}

	public JPanel recuperar() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JButton btnNewButton_1 = new JButton("Inicio");
		btnNewButton_1.setActionCommand("");
		btnNewButton_1.setBackground(new Color(255, 255, 128));
		panel.add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");

			}
		});

		JLabel lblNewLabel_1 = new JLabel("Recuperar contraseña");
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JTextField textField = new JTextField();
		textField.setBounds(257, 258, 240, 20);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(192, 71, 49, 14);
		panel_1.add(lblNewLabel);

		JTextArea txtrConfirmaTuDireccin = new JTextArea();
		txtrConfirmaTuDireccin.setOpaque(false);
		txtrConfirmaTuDireccin.setText(
				"Confirma tu dirección de correo electrónico.\nEnviaremos un correo de confirmación, \npor favor escribe el código para \nverificar que eres tú");
		txtrConfirmaTuDireccin.setBounds(257, 164, 240, 70);
		panel_1.add(txtrConfirmaTuDireccin);

		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(80, 173, 78));
		btnNewButton.setBounds(320, 311, 117, 23);
		panel_1.add(btnNewButton);

		JButton boton = new JButton();

		return (JPanel) frame.getContentPane();
	}

	public JPanel registro() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion

		Font fuente = new Font("Nunito", Font.BOLD, 16);
		JPanel mipanel = new JPanel();
		ButtonGroup grupo;
		JComboBox<String> combo, combo1, combo2;
		JRadioButton a, b;

		mipanel.setBackground(Color.decode("0xDFDFD3"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(1000, 700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);

		JLabel etiqueta1 = new JLabel("¡BIENVENIDO!");
		etiqueta1.setSize(150, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(350, 30);
		// etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);

		JLabel etiqueta5 = new JLabel("Nombre(s)");
		etiqueta5.setSize(200, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta5.setLocation(40, 75);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta5.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(etiqueta5);

		JTextField name = new JTextField();
		name.setSize(200, 30);
		name.setLocation(40, 110);
		name.setFont(new Font("Nunito", Font.PLAIN, 14));
		name.setFont(fuente);
		mipanel.add(name);

		JLabel etiqueta6 = new JLabel("Primer apellido");
		etiqueta6.setSize(200, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta6.setLocation(280, 75);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta6.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(etiqueta6);

		JTextField last_name = new JTextField();
		last_name.setSize(200, 30);
		last_name.setLocation(280, 110);
		last_name.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(last_name);

		JLabel etiqueta7 = new JLabel("Segundo apellido");
		etiqueta7.setSize(200, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta7.setLocation(520, 75);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta7.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(etiqueta7);

		JTextField last_second_name = new JTextField();
		last_second_name.setSize(200, 30);
		last_second_name.setLocation(520, 110);
		last_second_name.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(last_second_name);

		JLabel etiqueta8 = new JLabel("Nombre de usuario");
		etiqueta8.setSize(200, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta8.setLocation(40, 170);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta8.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(etiqueta8);

		JTextField user = new JTextField();
		user.setSize(200, 30);
		user.setLocation(40, 200);
		user.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(user);

		JLabel bio = new JLabel("Acerca de mí");
		bio.setSize(300, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		bio.setLocation(330, 170);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		bio.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(bio);

		JLabel preferences = new JLabel("Selecciona el tema para la interfaz");
		preferences.setSize(300, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		preferences.setLocation(40, 300);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		preferences.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(preferences);

		JTextField about_me = new JTextField();
		about_me.setSize(350, 80);
		about_me.setLocation(330, 200);
		about_me.setFont(new Font("Nunito", Font.BOLD, 14));
		mipanel.add(about_me);

		JCheckBox miCheck = new JCheckBox();
		miCheck.setOpaque(true);
		miCheck.setText("Tema claro");
		miCheck.setVisible(true);
		miCheck.setBackground(Color.decode("0xDFDFD3"));
		miCheck.setFont(new Font("Nunito", Font.PLAIN, 10));
		miCheck.setBounds(40, 340, 100, 30);

		JCheckBox miCheck2 = new JCheckBox();
		miCheck2.setOpaque(true);
		miCheck2.setText("Tema oscuro");
		miCheck2.setVisible(true);
		miCheck2.setBackground(Color.decode("0xDFDFD3"));
		miCheck2.setFont(new Font("Nunito", Font.PLAIN, 10));
		miCheck2.setBounds(40, 360, 100, 30);

		add(miCheck);
		add(miCheck2);

		grupo = new ButtonGroup();
		grupo.add(miCheck);
		grupo.add(miCheck2);

		a = new JRadioButton("", true);

		a.setOpaque(true);
		a.setText("Estoy de acuerdo");
		a.setVisible(true);
		a.setBackground(Color.decode("0xDFDFD3"));
		a.setFont(new Font("Nunito", Font.PLAIN, 14));
		a.setBounds(310, 485, 150, 30);

		b = new JRadioButton();
		// h
		b.setOpaque(true);
		b.setText("No estoy de acuerdo");
		b.setVisible(true);
		b.setBackground(Color.decode("0xDFDFD3"));
		b.setFont(new Font("Nunito", Font.PLAIN, 14));
		b.setBounds(310, 510, 200, 30);

		add(a);
		add(b);

		grupo.add(a);
		grupo.add(b);

		combo = new JComboBox<String>();// DIA
		combo.setBounds(350, 355, 45, 30);
		combo.setFont(new Font("Nunito", Font.PLAIN, 14));
		combo.setModel(new DefaultComboBoxModel<>(
				new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
						"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
		add(combo);

		combo1 = new JComboBox<String>();// MES
		combo1.setBounds(400, 355, 100, 30);
		combo1.setFont(new Font("Nunito", Font.PLAIN, 14));
		combo1.setModel(new DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
		add(combo1);

		combo2 = new JComboBox<String>();// MES
		combo2.setBounds(505, 355, 60, 30);
		combo2.setFont(new Font("Nunito", Font.PLAIN, 14));
		combo2.setModel(new DefaultComboBoxModel<>(new String[] { "1998", "1997", "1996", "1995" }));
		add(combo2);

		JLabel date = new JLabel("Fecha de nacimiento");
		date.setSize(600, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		date.setLocation(400, 300);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		date.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(date);

		JLabel day = new JLabel("Día");
		day.setSize(70, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		day.setLocation(360, 325);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		day.setFont(new Font("Nunito", Font.PLAIN, 10));
		mipanel.add(day);

		JLabel month = new JLabel("Mes");
		month.setSize(70, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		month.setLocation(440, 325);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		month.setFont(new Font("Nunito", Font.PLAIN, 10));
		mipanel.add(month);

		JLabel year = new JLabel("Año");
		year.setSize(480, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		year.setLocation(525, 325);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		year.setFont(new Font("Nunito", Font.PLAIN, 10));
		mipanel.add(year);

		JLabel privacy = new JLabel(
				"Confirmo que he leído y acepto los términos y condiciones y la política de privacidad");
		privacy.setSize(600, 40);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		privacy.setLocation(150, 450);
		// etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		privacy.setFont(new Font("Nunito", Font.PLAIN, 14));
		mipanel.add(privacy);

		JButton boton4 = new JButton("REGÍSTRATE");
		boton4.setBackground(Color.decode("0x83AD9A"));
		boton4.setSize(200, 40);
		boton4.setLocation(300, 570);
		boton4.setLayout(null);
		boton4.setVisible(true);
		mipanel.add(boton4);

		boton4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (name.getText().equals("") || last_second_name.getText().equals("") || last_name.getText().equals("")
						|| user.getText().equals("") || bio.getText().equals("") || about_me.getText().equals("")) {
					name.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					last_second_name.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					last_name.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					user.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					bio.setBorder(BorderFactory.createLineBorder(Color.red, 5));
					about_me.setBorder(BorderFactory.createLineBorder(Color.red, 5));

				} else {
					name.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					last_second_name.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					last_name.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					user.setBorder(BorderFactory.createLineBorder(Color.green, 5));
					// bio.setBorder(BorderFactory.createLineBorder(Color.green,5));
					about_me.setBorder(BorderFactory.createLineBorder(Color.green, 5));
				}

			}
		});

		JButton ir_login = new JButton("Login");
		ir_login.setBackground(Color.decode("0x93CEEA"));
		ir_login.setSize(200, 40);
		ir_login.setLocation(700, 500);
		ir_login.setLayout(null);
		ir_login.setForeground(Color.BLACK);
		ir_login.setVisible(true);
		ir_login.setFont(fuente);
		mipanel.add(ir_login);

		ir_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");

			}

		});
		//
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
	}

	public JPanel users() {
		Font fuente = new Font("Nunito", Font.BOLD, 16);
		JPanel mipanel = new JPanel();
		ButtonGroup grupo;
		JComboBox<String> combo, combo1, combo2;
		JRadioButton a, b;

		mipanel.setBackground(Color.decode("0xDFDFD3"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el
								// background
		mipanel.setSize(1000, 700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Tabla de usuarios");
		etiqueta1.setSize(200, 30);
		// etiqueta1.setOpaque(true);
		// etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(400, 30);
		// etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		// etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);

		String title[] = { "Usuario", "Fecha de ingreso", "Sexo", "Edad" };
		String data[][] = { { "userA", "2023-05-14", "M", "25" }, { "userB", "2022-11-22", "F", "30" },
				{ "userC", "2021-08-10", "M", "27" }, { "userD", "2020-02-05", "F", "22" },
				{ "userE", "2023-09-30", "M", "35" }, { "userF", "2019-06-18", "F", "29" },
				{ "userG", "2018-12-01", "M", "31" }, { "userH", "2024-01-25", "F", "26" },
				{ "userI", "2020-07-17", "M", "28" }, { "userJ", "2017-04-09", "F", "33" },
				{ "userK", "2021-10-11", "M", "24" }, { "userL", "2022-03-15", "F", "27" },
				{ "userM", "2023-12-05", "M", "32" }, { "userN", "2016-09-07", "F", "34" },
				{ "userO", "2015-11-30", "M", "40" }, { "userP", "2024-02-10", "F", "21" },
				{ "userQ", "2018-05-22", "M", "29" }, { "userR", "2019-07-11", "F", "26" },
				{ "userS", "2020-03-14", "M", "31" }, { "userT", "2023-08-19", "F", "24" },
				{ "userU", "2022-12-30", "M", "35" }, { "userV", "2021-06-25", "F", "27" },
				{ "userW", "2017-09-10", "M", "33" }, { "userX", "2020-11-05", "F", "28" },
				{ "userY", "2016-02-12", "M", "37" }, { "userZ", "2019-04-20", "F", "30" },
				{ "userAA", "2023-01-18", "M", "22" }, { "userBB", "2015-10-15", "F", "41" },
				{ "userCC", "2018-07-07", "M", "36" }, { "userDD", "2021-09-09", "F", "25" },
				{ "userEE", "2017-03-21", "M", "32" }, { "userFF", "2024-02-01", "F", "23" } };

		JTable tabla = new JTable(data, title);
		JScrollPane scroll_pane = new JScrollPane(tabla);
		scroll_pane.setSize(850, 300);
		scroll_pane.setLocation(60, 120);
		mipanel.add(scroll_pane);

		JButton guardar = new JButton("Guardar");
		guardar.setBackground(Color.decode("0x83AD9A"));
		guardar.setSize(75, 35);
		guardar.setLocation(750, 70);
		guardar.setLayout(null);
		guardar.setFont(new Font("Nunito", Font.BOLD, 12));
		guardar.setVisible(true);
		mipanel.add(guardar);

		JButton editar = new JButton("Editar");
		editar.setBackground(Color.decode("0x83AD9A"));
		editar.setSize(75, 35);
		editar.setLocation(830, 70);
		editar.setFont(new Font("Nunito", Font.BOLD, 12));

		editar.setLayout(null);
		editar.setVisible(true);
		mipanel.add(editar);
		JButton boton=new JButton("Inicio");
		boton.setBounds(300,20,80,30);
		boton.setBackground(Color.yellow);
		mipanel.add(boton);
		boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");
			}
		});
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		// return users();

	}

}
