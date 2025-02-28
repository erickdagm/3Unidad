import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Ventana extends JFrame {


		public Ventana() {
		
		this.setTitle("Calculadora"); 
		this.setVisible(true);//
		this.setSize(300,500);//atributo para modificar el tamano, con este tamano iniciara cuando se ejecute el codigo
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true); //si quiero que sea redimensionable le coloco true
		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
		ImageIcon icon2 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\pinguino.png");//instancio un objeto de tipo imageicon, y especificamaos la ruta para cargar el archivo
		Image img2=icon2.getImage();//obtenemos la imagen
		Image imgScaled2=img2.getScaledInstance(15, 15, Image.SCALE_SMOOTH);//escalamos la imagen
		ImageIcon iconScaled2=new ImageIcon(imgScaled2);//creamos un ImageIcon con la imagen escalada, se hizo de esta forma porque no se puede modificar el tamano de la imagen dentro del JLAbel directamente
		
		this.setIconImage(imgScaled2);
		
		this.repaint();
		this.revalidate();
		
		this.add(this.Calculadora());
	
	}
	
		public JPanel Calculadora() {
			
			//creacion de borde para todos los componentes
			Border borde=BorderFactory.createLineBorder(Color.black, 1);
			Font fuente=new Font("Nunito",Font.BOLD,24);
			GridBagConstraints gbc=new GridBagConstraints();//OBJETO QUE ME AYUDA A AJUSTAR LA POSICION DE LA CELDA Y EL TAMANO DE LA CELDA
			//
			JPanel panel=new JPanel();
			panel.setLayout(new GridBagLayout());
			/* utilizo gridbaglayout para que los componentes
			 se ajusten dinamicamente al redimensionar la ventana,
			 por eso lo establezco en el contenedor principal,
			 porque este tipo de layout permite colocar los componentes
			 en una cuadricula flexible, donde cada celda puede tener
			 tamano diferente*/
					
			JPanel pantalla=new JPanel();//Este sera el panel para mostrar cuando ingresemos numeros
			pantalla.setForeground(Color.black);
			pantalla.setFont(fuente);
			pantalla.setOpaque(true);
			pantalla.setFont(fuente);
			pantalla.setBackground(Color.white);
			gbc.gridx=0;gbc.gridy=0;// primera columna, primera fila
			gbc.weightx=1;gbc.weighty=1;// weightx permite que el panel crezca horizontalmente, weighty le da poquito peso vertical para no afectar los demas elementos
			gbc.gridwidth=4;//hace que la pantalla use 4 columnas
			gbc.fill=GridBagConstraints.BOTH;
			panel.add(pantalla,gbc);
			
			
			/*esto solo sirve para que despues de la pantalla, todo tenga el mismo tamano*/
			gbc.gridwidth=1;//reestableci el ancho para que los botones no modifiquen el tamano de los demas
			gbc.weighty=1;//reestableci el vertical para los demas componentes
			
			JButton n1=new JButton("1");
			n1.setForeground(Color.black);
			n1.setFont(fuente);
			n1.setBorder(borde);
			gbc.gridx=0;gbc.gridy=4;// primera columna, primera fila
			//gbc.weightx=1.0;gbc.weighty=1.0;//se expande a los lados y despues a lo alto, ademas que permite que se redimensione cuando se ajuste la ventana
			gbc.fill=GridBagConstraints.BOTH;//hace que el boton ocupe toda la celda
			
			panel.add(n1,gbc);//aqui se anade el boton al panel de manera normal, pero el gbc le aplica las restricciones que definimos
			
			JButton n2=new JButton("2");
			n2.setForeground(Color.black);
			n2.setFont(fuente);
			n2.setBorder(borde);
			gbc.gridx=1;gbc.gridy=4;
			panel.add(n2,gbc);
			
			JButton n3=new JButton("3");
			n3.setForeground(Color.black);
			n3.setFont(fuente);
			n3.setBorder(borde);
			gbc.gridx=2 ;gbc.gridy=4;
			panel.add(n3,gbc);
			
			JButton n4=new JButton("4");
			n4.setForeground(Color.black);
			n4.setFont(fuente);
			n4.setBorder(borde);
			gbc.gridx=0 ;gbc.gridy=3;
			panel.add(n4,gbc);
			
			JButton n5=new JButton("5");
			n5.setForeground(Color.black);
			n5.setFont(fuente);
			n5.setBorder(borde);
			gbc.gridx=1 ;gbc.gridy=3;
			panel.add(n5,gbc);
			
			JButton n6=new JButton("6");
			n6.setForeground(Color.black);
			n6.setFont(fuente);
			n6.setBorder(borde);
			gbc.gridx=2 ;gbc.gridy=3;
			panel.add(n6,gbc);
			
			JButton n7=new JButton("7");
			n7.setForeground(Color.black);
			n7.setFont(fuente);
			n7.setBorder(borde);
			gbc.gridx=0 ;gbc.gridy=2;
			panel.add(n7,gbc);
			
			JButton n8=new JButton("8");
			n8.setForeground(Color.black);
			n8.setFont(fuente);
			n8.setBorder(borde);
			gbc.gridx=1 ;gbc.gridy=2;
			panel.add(n8,gbc);
			
			JButton n9=new JButton("9");
			n9.setForeground(Color.black);
			n9.setFont(fuente);
			n9.setBorder(borde);
			gbc.gridx=2 ;gbc.gridy=2;
			panel.add(n9,gbc);
			
			
			JButton n0=new JButton("0");
			n0.setForeground(Color.black);
			n0.setFont(fuente);
			n0.setBorder(borde);
			gbc.gridx=1 ;gbc.gridy=5;
			panel.add(n0,gbc);
			
			JButton suma=new JButton("+");
			suma.setForeground(Color.black);
			suma.setFont(fuente);
			suma.setBorder(borde);
			suma.setBackground(Color.decode("0xBAB194"));
			gbc.gridx=3 ;gbc.gridy=2;
			panel.add(suma,gbc);
			
			JButton resta=new JButton("-");
			resta.setForeground(Color.black);
			resta.setFont(fuente);
			resta.setBorder(borde);
			resta.setBackground(Color.decode("0xBAB194"));
			gbc.gridx=3 ;gbc.gridy=3;
			panel.add(resta,gbc);
			
			JButton div=new JButton("/");
			div.setForeground(Color.black);
			div.setFont(fuente);
			div.setBorder(borde);
			div.setBackground(Color.decode("0xBAB194"));
			gbc.gridx=3 ;gbc.gridy=4;
			panel.add(div,gbc);
			
			JButton mult=new JButton("*");
			mult.setForeground(Color.black);
			mult.setFont(fuente);
			mult.setBorder(borde);
			mult.setBackground(Color.decode("0xBAB194"));
			gbc.gridx=3 ;gbc.gridy=5;
			panel.add(mult,gbc);
			
			
			JButton igual=new JButton("=");
			igual.setForeground(Color.black);
			igual.setFont(fuente);
			igual.setBorder(borde);
			igual.setBackground(Color.decode("0xBAB194"));
			gbc.gridx=2 ;gbc.gridy=5;
			panel.add(igual,gbc);
			
			JButton clearAll=new JButton("CA");
			clearAll.setForeground(Color.black);
			clearAll.setFont(fuente);
			clearAll.setBorder(borde);
			clearAll.setBackground(Color.decode("0xCF6712"));
			gbc.gridx=0 ;gbc.gridy=1;
			gbc.weightx=2;gbc.weighty=1;
			gbc.gridwidth=2;
			panel.add(clearAll,gbc);
			
			JButton clear=new JButton("C");
			clear.setForeground(Color.black);
			clear.setFont(fuente);
			clear.setBorder(borde);
			clear.setBackground(Color.decode("0xD28B52"));
			gbc.gridx=2 ;gbc.gridy=1;
			gbc.weightx=2;gbc.weighty=1;
			gbc.gridwidth=2;
			panel.add(clear,gbc);
			
			JButton punto=new JButton(".");
			punto.setForeground(Color.black);
			punto.setFont(fuente);
			punto.setBorder(borde);
			gbc.gridx=0 ;gbc.gridy=5;
			gbc.weightx=1;gbc.weighty=1;
			gbc.gridwidth=1;
			panel.add(punto,gbc);
			
			
			
			
			
			
			return panel;
			
		}
		
//		public JPanel calculadora1(){
//			
//			JPanel panel2=new JPanel();
//			
//			
//			
//			
//			
//			return panel2;
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}