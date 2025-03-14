
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
import javax.swing.JTextField;
import javax.swing.border.Border;
//

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);//
		this.setSize(1000,700);//atributo para modificar el tamano
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		
		this.setTitle("Inicio de sesion"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//this.setResizable(false); si quiero que sea redimensionable le coloco true

		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		//this.add(this.registro());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		//this.add(this.users());//add permite agregar todo lo que queremos dentrod e la ventana, entonces estamos pidiendo agregar el objeto login a Ventana
		//
		
		JMenuBar barra = new JMenuBar();
		
		JMenu archivo=new JMenu("Archivo");
		barra.add(archivo);
		
		JMenuItem abrir=new JMenuItem("Abrir nuevo");
		archivo.add(abrir);
		
		JMenuItem opc=new JMenuItem("Exportar");
		archivo.add(opc);
		
		JMenuItem opc1=new JMenuItem("Guardar como");
		archivo.add(opc1);
		
		JMenu enviar=new JMenu("Enviar vía");
		archivo.add(enviar);
		
		JMenuItem enviar1=new JMenuItem("Correo electrónico");
		enviar.add(enviar1);
		
		JMenuItem enviar2=new JMenuItem("Fax");
		enviar.add(enviar2);
		
		JMenu ventana=new JMenu("Ventana");
		barra.add(ventana);		
		
		JMenuItem herramientas=new JMenuItem("Herramientas");
		ventana.add(herramientas);
		
		JMenu preferencias=new JMenu("Preferencias");
		ventana.add(preferencias);
		
		JMenuItem interfaz=new JMenuItem("Tema oscuro");
		preferencias.add(interfaz);
		
		JMenuItem interfaz1=new JMenuItem("Tema claro");
		preferencias.add(interfaz1);
		
		JCheckBoxMenuItem opc2=new JCheckBoxMenuItem();
		opc2.setOpaque(false);
		interfaz.add(opc2);
	
	
		
		
		
		
		this.setJMenuBar(barra);
		
		
		this.repaint();
		this.revalidate();
	
	}
	
	public void router(String route) {
		this.getContentPane().removeAll();
		if(route.equals("Registro")) {
			this.add(this.registro());
			
		}
		if(route.equals("Login")) {
			this.add(this.login());
		}
		this.repaint();
		this.revalidate();
	}
	
	public JPanel login() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
		
		Font fuente=new Font("Nunito",Font.BOLD,16);
		
		JPanel loginCont=new JPanel();
		loginCont.setLayout(null);
		loginCont.setBackground(Color.decode("0xDDDBC0"));
		loginCont.setBounds(40,80,380,490);
		loginCont.setOpaque(true);
		loginCont.setVisible(true);
		loginCont.repaint();
		
	
		
		JPanel mipanel = new JPanel (); // ESTE BLOQUE MODIFICA LO RELACIONADO CON EL PANEL DE LOGIN
		mipanel.setBackground(Color.decode("0x415C95"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(1000,700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		mipanel.revalidate();
		mipanel.repaint();;
		//mipanel.setLayout(null);
		
		
		JLabel etiqueta1=new JLabel ("¡Bienvenido!");// ESTE BLOQUE ES LA ETIQUETE DEL HEADER
		etiqueta1.setSize(100,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(40,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		etiqueta1.setForeground(Color.BLACK);
		mipanel.add(etiqueta1);
		
		
		ImageIcon icon2 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\Logo.png");//instancio un objeto de tipo imageicon, y especificamaos la ruta para cargar el archivo
		Image img2=icon2.getImage();//obtenemos la imagen
		Image imgScaled2=img2.getScaledInstance(300, 300, Image.SCALE_SMOOTH);//escalamos la imagen
		ImageIcon iconScaled2=new ImageIcon(imgScaled2);//creamos un ImageIcon con la imagen escalada, se hizo de esta forma porque no se puede modificar el tamano de la imagen dentro del JLAbel directamente
		
		
		JLabel logo=new JLabel();
		logo.setBounds(540,180,300,300);
		logo.setVisible(true);
		logo.setIcon(iconScaled2);
		
		mipanel.add(logo);
		
		////////////////////////////////////////////////////USUARIO/////////////////////////////////////////////////////////////////////////////
		
		JLabel etiqueta2=new JLabel ("Ingresa tu correo");
		etiqueta2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta2.setLocation(40,115);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta2.setFont(fuente);
		etiqueta2.setForeground(Color.BLACK);
		mipanel.add(etiqueta2);
		
		
		
		JPanel userCont=new JPanel ();
		userCont.setLayout(null);
		Border borde=BorderFactory.createLineBorder(Color.black,2);
		userCont.setBorder(borde);
		userCont.setLocation(40,150);
		
		userCont.setSize(300,40);
		userCont.setBackground(Color.WHITE);
		//userCont.setPreferredSize(getPreferredSize());;
		userCont.setOpaque(true);
		userCont.setVisible(true);
		
		mipanel.add(userCont);
		
		
		ImageIcon icon = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\usuario.png");//instancio un objeto de tipo imageicon, y especificamaos la ruta para cargar el archivo
		Image img=icon.getImage();//obtenemos la imagen
		Image imgScaled=img.getScaledInstance(25, 30, Image.SCALE_SMOOTH);//escalamos la imagen
		ImageIcon iconScaled=new ImageIcon(imgScaled);//creamos un ImageIcon con la imagen escalada, se hizo de esta forma porque no se puede modificar el tamano de la imagen dentro del JLAbel directamente
		
		
		
		JLabel usuario=new JLabel();// se crea una etiqueta para insertar la imagen dentro
		usuario.setIcon(iconScaled);
		usuario.setLocation(0,6);
		usuario.setSize(30,30);
		usuario.setVisible(true);
		usuario.repaint();
		//usuario.setBounds(0, 5, 15, 15);
		
		
		
		JTextField email=new JTextField();
		email.setSize(272,36);
		email.setLocation(26,3);
		email.setColumns(20);
		email.setOpaque(false);
		email.setBackground(Color.white);
		email.setFont(new Font("Nunito",Font.BOLD,14));
		email.setVisible(true);
		//email.setBounds(40, 150, 300, 40);
		
		userCont.add(usuario);
		userCont.add(email);
		email.requestFocus();
		
		System.out.println("userCont bounds: "+userCont.getBounds());
		System.out.println("email bounds: "+email.getBounds());// esto lo imrpimi para saber en donde se estaba imrpimiendo el panel y el field de email
		
		//////////////////////////////////////////////////////////////////////CONTRASENA/////////////////////////////////////////////////////
		
		
		JLabel etiqueta3=new JLabel ("Ingresa tu contraseña");
		etiqueta3.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta3.setLocation(40,220);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta3.setFont(fuente);
		etiqueta3.setForeground(Color.BLACK);
		mipanel.add(etiqueta3);
		
		
		
		JPanel passCont=new JPanel ();
		passCont.setLayout(null);
		//Border borde=BorderFactory.createLineBorder(Color.red,2);
		passCont.setBorder(borde);
		passCont.setLocation(40,255);
		
		passCont.setSize(300,40);
		passCont.setBackground(Color.WHITE);
		//userCont.setPreferredSize(getPreferredSize());;
		passCont.setOpaque(true);
		passCont.setVisible(true);
		
		mipanel.add(passCont);
		
		
		ImageIcon icon1 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\contrasena.png");//instancio un objeto de tipo imageicon, y especificamaos la ruta para cargar el archivo
		Image img1=icon1.getImage();//obtenemos la imagen
		Image imgScaled1=img1.getScaledInstance(25, 30, Image.SCALE_SMOOTH);//escalamos la imagen
		ImageIcon iconScaled1=new ImageIcon(imgScaled1);//creamos un ImageIcon con la imagen escalada, se hizo de esta forma porque no se puede modificar el tamano de la imagen dentro del JLAbel directamente
		
		
		
		JLabel password=new JLabel();// se crea una etiqueta para insertar la imagen dentro
		password.setIcon(iconScaled1);
		password.setLocation(0,6);
		password.setSize(30,30);
		password.setVisible(true);
		password.repaint();
		//usuario.setBounds(0, 5, 15, 15);
		
		
		
		JPasswordField contrasena=new JPasswordField();
		contrasena.setSize(272,36);
		contrasena.setLocation(26,2);
		contrasena.setColumns(20);
		contrasena.setOpaque(false);
		contrasena.setBackground(Color.white);
		contrasena.setFont(new Font("Nunito",Font.BOLD,14));
		contrasena.setVisible(true);
		//email.setBounds(40, 150, 300, 40);
		
		passCont.add(password);
		passCont.add(contrasena);
		//email.requestFocus();
		
		System.out.println("userCont bounds: "+userCont.getBounds());
		System.out.println("email bounds: "+email.getBounds());// esto lo imrpimi para saber en donde se estaba imrpimiendo el panel y el field de email///////////////////////////////////////////////////////////////CONTRASENA////////////////////////////////////////////////////////////////
		
		///////////////////////////////////////////////////////////CONTRASENA//////////////////////////////////////////////////////////////////
		
		JCheckBox miCheck=new JCheckBox();
		miCheck.setOpaque(false);
		miCheck.setText("Recordar mis credenciales");
		miCheck.setVisible(true);
		miCheck.setForeground(Color.BLACK);
		miCheck.setBackground(Color.decode("0xDDDEBC"));
		miCheck.setFont(new Font("Nunito",Font.PLAIN,12));
		miCheck.setBounds(37,323,200,30);
		mipanel.add(miCheck);
		
		
		JLabel recordar2=new JLabel ("¿Olvidaste tu contraseña?");
		recordar2.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		recordar2.setLocation(215,282);
		recordar2.setForeground(Color.BLACK);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		recordar2.setFont(new Font("Nunito",Font.BOLD,10));
		mipanel.add(recordar2);
		
		
		JButton boton=new JButton("Iniciar sesión");
		boton.setBackground(Color.decode("0x93CEEA"));
		boton.setSize(200,40);
		boton.setLocation(40,400);
        boton.setLayout(null);
        boton.setForeground(Color.BLACK);
        boton.setVisible(true);
        boton.setFont(fuente);
        mipanel.add(boton);
        
        boton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Boolean flag1=false,flag2=false;
				// TODO Auto-generated method stub
				if(email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red,5));
				}
				else {
					email.setBorder(BorderFactory.createLineBorder(Color.green,5));
					flag1=true;
				}
				
				String passw=new String(contrasena.getPassword());
				if(passw.equals("")) {
					contrasena.setBorder(BorderFactory.createLineBorder(Color.red,5));

				}
				else
				{
					contrasena.setBorder(BorderFactory.createLineBorder(Color.green,5));
					flag2=true;
				}
				
				if(flag1&&flag2) {
					if(email.getText().equals("erickdagm")) 
						if(password.equals("contrasena1")){
							JOptionPane.showMessageDialog(null, "Bienvenido",".",JOptionPane.WARNING_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(null, "Verifique los datos de inicio de sesion",".",JOptionPane.ERROR_MESSAGE);

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
        
        

        
        
        JButton ir_registro=new JButton("Ir a registro");
        ir_registro.setBackground(Color.decode("0x93CEEA"));
        ir_registro.setSize(200,40);
        ir_registro.setLocation(700,500);
        ir_registro.setLayout(null);
        ir_registro.setForeground(Color.BLACK);
        ir_registro.setVisible(true);
        ir_registro.setFont(fuente);
        mipanel.add(ir_registro);
        
        ir_registro.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Registro");
				
			}

		});
        
        
        
        
        
        
        
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		
		
	}
	
	public JPanel registro() {// aqui le agregamos un panel a nuestra ventana, y login es una funcion 
		
		
			
			
		
		
		
		Font fuente=new Font("Nunito",Font.BOLD,16);
		JPanel mipanel = new JPanel ();
		ButtonGroup grupo;
		JComboBox<String> combo,combo1,combo2;
		JRadioButton a,b;
		
		
		
		
		
		
		mipanel.setBackground(Color.decode("0xDFDFD3"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(1000,700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		
		
		JLabel etiqueta1=new JLabel ("¡BIENVENIDO!");
		etiqueta1.setSize(150,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(350,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);
		
		JLabel etiqueta5=new JLabel ("Nombre(s)");
		etiqueta5.setSize(200,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta5.setLocation(40,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta2.setFont(new Font("Nunito",Font.BOLD,14));
		etiqueta5.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta5);
		
		JTextField name=new JTextField();
		name.setSize(200,30);
		name.setLocation(40,110);
		name.setFont(new Font("Nunito",Font.PLAIN,14));
		name.setFont(fuente);
		mipanel.add(name);
		
		JLabel etiqueta6=new JLabel ("Primer apellido");
		etiqueta6.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta6.setLocation(280,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta6.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta6);
		
		JTextField last_name=new JTextField();
		last_name.setSize(200,30);
		last_name.setLocation(280,110);
		last_name.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(last_name);
		
		JLabel etiqueta7=new JLabel ("Segundo apellido");
		etiqueta7.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta7.setLocation(520,75);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta7.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta7);
		
		JTextField last_second_name=new JTextField();
		last_second_name.setSize(200,30);
		last_second_name.setLocation(520,110);
		last_second_name.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(last_second_name);
		
		JLabel etiqueta8=new JLabel ("Nombre de usuario");
		etiqueta8.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta8.setLocation(40,170);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta8.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(etiqueta8);
		
		JTextField user=new JTextField();
		user.setSize(200,30);
		user.setLocation(40,200);
		user.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(user);
		
		
		JLabel bio=new JLabel ("Acerca de mí");
		bio.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		bio.setLocation(330,170);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		bio.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(bio);
		
		JLabel preferences=new JLabel ("Selecciona el tema para la interfaz");
		preferences.setSize(300,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		preferences.setLocation(40,300);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		preferences.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(preferences);
		
		
		JTextField about_me=new JTextField();
		about_me.setSize(350,80);
		about_me.setLocation(330,200);
		about_me.setFont(new Font("Nunito",Font.BOLD,14));
		mipanel.add(about_me);
		
		JCheckBox miCheck=new JCheckBox();
		miCheck.setOpaque(true);
		miCheck.setText("Tema claro");
		miCheck.setVisible(true);
		miCheck.setBackground(Color.decode("0xDFDFD3"));
		miCheck.setFont(new Font("Nunito",Font.PLAIN,10));
		miCheck.setBounds(40,340,100,30);
		
		
		JCheckBox miCheck2=new JCheckBox();
		miCheck2.setOpaque(true);
		miCheck2.setText("Tema oscuro");
		miCheck2.setVisible(true);
		miCheck2.setBackground(Color.decode("0xDFDFD3"));
		miCheck2.setFont(new Font("Nunito",Font.PLAIN,10));
		miCheck2.setBounds(40,360,100,30);
		
		add(miCheck);
		add(miCheck2);
		
		grupo=new ButtonGroup();
		grupo.add(miCheck);
		grupo.add(miCheck2);
		
		a=new JRadioButton("",true);
		
		a.setOpaque(true);
		a.setText("Estoy de acuerdo");
		a.setVisible(true);
		a.setBackground(Color.decode("0xDFDFD3"));
		a.setFont(new Font("Nunito",Font.PLAIN,14));
		a.setBounds(310,485,150,30);
		
		b=new JRadioButton();
		//h
		b.setOpaque(true);
		b.setText("No estoy de acuerdo");
		b.setVisible(true);
		b.setBackground(Color.decode("0xDFDFD3"));
		b.setFont(new Font("Nunito",Font.PLAIN,14));
		b.setBounds(310,510,200,30);
		
		add(a);
		add(b);
		
		grupo.add(a);
		grupo.add(b);
		
		combo=new JComboBox<String>();//DIA
		combo.setBounds(350,355,45,30);
		combo.setFont(new Font("Nunito",Font.PLAIN,14));
		combo.setModel(new DefaultComboBoxModel<>(new String[] {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"}));
		add(combo);
		
		combo1=new JComboBox<String>();//MES
		combo1.setBounds(400,355,100,30);
		combo1.setFont(new Font("Nunito",Font.PLAIN,14));
		combo1.setModel(new DefaultComboBoxModel<>(new String[] {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}));
		add(combo1);
		
		combo2=new JComboBox<String>();//MES
		combo2.setBounds(505,355,60,30);
		combo2.setFont(new Font("Nunito",Font.PLAIN,14));
		combo2.setModel(new DefaultComboBoxModel<>(new String[] {"1998","1997","1996","1995"}));
		add(combo2);
		
		JLabel date=new JLabel ("Fecha de nacimiento");
		date.setSize(600,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		date.setLocation(400,300);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		date.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(date);
		
		JLabel day=new JLabel ("Día");
		day.setSize(70,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		day.setLocation(360,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		day.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(day);
		
		JLabel month=new JLabel ("Mes");
		month.setSize(70,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		month.setLocation(440,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		month.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(month);
		
		JLabel year=new JLabel ("Año");
		year.setSize(480,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		year.setLocation(525,325);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		year.setFont(new Font("Nunito",Font.PLAIN,10));
		mipanel.add(year);
		
		
		
		JLabel privacy=new JLabel ("Confirmo que he leído y acepto los términos y condiciones y la política de privacidad");
		privacy.setSize(600,40);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		privacy.setLocation(150,450);
		//etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		privacy.setFont(new Font("Nunito",Font.PLAIN,14));
		mipanel.add(privacy);
		
		
		JButton boton4=new JButton("REGÍSTRATE");
		boton4.setBackground(Color.decode("0x83AD9A"));
		boton4.setSize(200,40);
		boton4.setLocation(300,570);
		boton4.setLayout(null);
		boton4.setVisible(true);
        mipanel.add(boton4);
		
		
		
		boton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
							if(name.getText().equals("") ||last_second_name.getText().equals("")||last_name.getText().equals("") ||user.getText().equals("")||bio.getText().equals("")||about_me.getText().equals("")){
								name.setBorder(BorderFactory.createLineBorder(Color.red,5));
								last_second_name.setBorder(BorderFactory.createLineBorder(Color.red,5));
								last_name.setBorder(BorderFactory.createLineBorder(Color.red,5));
								user.setBorder(BorderFactory.createLineBorder(Color.red,5));
								bio.setBorder(BorderFactory.createLineBorder(Color.red,5));
								about_me.setBorder(BorderFactory.createLineBorder(Color.red,5));

							}
							else {
								name.setBorder(BorderFactory.createLineBorder(Color.green,5));
								last_second_name.setBorder(BorderFactory.createLineBorder(Color.green,5));
								last_name.setBorder(BorderFactory.createLineBorder(Color.green,5));
								user.setBorder(BorderFactory.createLineBorder(Color.green,5));
								//bio.setBorder(BorderFactory.createLineBorder(Color.green,5));
								about_me.setBorder(BorderFactory.createLineBorder(Color.green,5));
							}
								
			}
		});
		
		JButton ir_login=new JButton("Ir a registro");
		ir_login.setBackground(Color.decode("0x93CEEA"));
		ir_login.setSize(200,40);
		ir_login.setLocation(700,500);
		ir_login.setLayout(null);
		ir_login.setForeground(Color.BLACK);
		ir_login.setVisible(true);
		ir_login.setFont(fuente);
        mipanel.add(ir_login);
        
        ir_login.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("Login");
				
			}

		});
		//
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
	}

	public JPanel users()
	{
		Font fuente=new Font("Nunito",Font.BOLD,16);
		JPanel mipanel = new JPanel ();
		ButtonGroup grupo;
		JComboBox<String> combo,combo1,combo2;
		JRadioButton a,b;
		
		
		
		mipanel.setBackground(Color.decode("0xDFDFD3"));
		mipanel.setOpaque(true);// si queremos ponerle un color, usamos esta funcion para habilitar el background 
		mipanel.setSize(1000,700);// comom panel es un objeto, tiene algunas caractetisticas como la ventana 
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		JLabel etiqueta1=new JLabel ("Tabla de usuarios");
		etiqueta1.setSize(200,30);
		//etiqueta1.setOpaque(true);
		//etiqueta1.setBackground(Color.BLACK);
		etiqueta1.setLocation(400,30);
		//etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		//etiqueta1.setFont(new Font("Nunito",Font.BOLD,16));
		etiqueta1.setFont(fuente);
		mipanel.add(etiqueta1);
		
		
		
		String title[]= {"Usuario","Fecha de ingreso","Sexo","Edad"};
		String data[][] = {
			    {"userA", "2023-05-14", "M", "25"},
			    {"userB", "2022-11-22", "F", "30"},
			    {"userC", "2021-08-10", "M", "27"},
			    {"userD", "2020-02-05", "F", "22"},
			    {"userE", "2023-09-30", "M", "35"},
			    {"userF", "2019-06-18", "F", "29"},
			    {"userG", "2018-12-01", "M", "31"},
			    {"userH", "2024-01-25", "F", "26"},
			    {"userI", "2020-07-17", "M", "28"},
			    {"userJ", "2017-04-09", "F", "33"},
			    {"userK", "2021-10-11", "M", "24"},
			    {"userL", "2022-03-15", "F", "27"},
			    {"userM", "2023-12-05", "M", "32"},
			    {"userN", "2016-09-07", "F", "34"},
			    {"userO", "2015-11-30", "M", "40"},
			    {"userP", "2024-02-10", "F", "21"},
			    {"userQ", "2018-05-22", "M", "29"},
			    {"userR", "2019-07-11", "F", "26"},
			    {"userS", "2020-03-14", "M", "31"},
			    {"userT", "2023-08-19", "F", "24"},
			    {"userU", "2022-12-30", "M", "35"},
			    {"userV", "2021-06-25", "F", "27"},
			    {"userW", "2017-09-10", "M", "33"},
			    {"userX", "2020-11-05", "F", "28"},
			    {"userY", "2016-02-12", "M", "37"},
			    {"userZ", "2019-04-20", "F", "30"},
			    {"userAA", "2023-01-18", "M", "22"},
			    {"userBB", "2015-10-15", "F", "41"},
			    {"userCC", "2018-07-07", "M", "36"},
			    {"userDD", "2021-09-09", "F", "25"},
			    {"userEE", "2017-03-21", "M", "32"},
			    {"userFF", "2024-02-01", "F", "23"}
			};

		JTable tabla=new JTable(data,title);
		JScrollPane scroll_pane=new JScrollPane(tabla);
		scroll_pane.setSize(850,300);
		scroll_pane.setLocation(60,120);
		mipanel.add(scroll_pane);
		

		
		JButton guardar=new JButton("Guardar");
		guardar.setBackground(Color.decode("0x83AD9A"));
		guardar.setSize(75,35);
		guardar.setLocation(750,70);
		guardar.setLayout(null);
		guardar.setFont(new Font("Nunito",Font.BOLD,12));
		guardar.setVisible(true);
        mipanel.add(guardar);
        
        JButton editar=new JButton("Editar");
        editar.setBackground(Color.decode("0x83AD9A"));
        editar.setSize(75,35);
        editar.setLocation(830,70);
		editar.setFont(new Font("Nunito",Font.BOLD,12));

        editar.setLayout(null);
        editar.setVisible(true);
        mipanel.add(editar);
		return mipanel;// aqui retornamos un panel que se va a mostrar en la ventana
		//return users();
		
	}

}
