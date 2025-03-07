package graphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ventana extends JFrame {


		public Ventana() {
		
		this.setTitle("Graphics"); 
		this.setVisible(true);//
		this.setBackground(Color.white);
		this.setSize(800,600);//atributo para modificar el tamano, con este tamano iniciara cuando se ejecute el codigo
		this.setLocationRelativeTo(null);//atributo para centrar, relative to sirve para colocar en una ubicacion especifica de otro objeto, pero como no hay objeto, pues lo centramos con null
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true); //si quiero que sea redimensionable le coloco true
		this.setMaximumSize(new Dimension (800,400));
		this.setMinimumSize(new Dimension(400,400));
		
		
		
		
		this.repaint();
		this.revalidate();
		
		//this.add(this.paint());
		//this.add(this.calculadora1());
//		ImageIcon icon2 = new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\pinguino.png");//instancio un objeto de tipo imageicon, y especificamaos la ruta para cargar el archivo
//		Image img2=icon2.getImage();//obtenemos la imagen
//		Image imgScaled2=img2.getScaledInstance(30, 30, Image.SCALE_SMOOTH);//escalamos la imagen
//		ImageIcon iconScaled2=new ImageIcon(imgScaled2);//creamos un ImageIcon con la imagen escalada, se hizo de esta forma porque no se puede modificar el tamano de la imagen dentro del JLAbel directamente
//		this.setIconImage(imgScaled2);
	
	}
		
		@Override
		public void paint(Graphics g) {
			
			super.paint(g);//investigar para que sirve esto
			
			
			Graphics2D g2d=(Graphics2D) g.create();
			g2d.setColor(Color.magenta);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawRect(100,100,80,80);
			g2d.setColor(Color.cyan);
			g2d.fillRect(110, 110, 80, 80);
			
			g2d.setStroke(new BasicStroke(10));
			g2d.setColor(Color.orange);

			g2d.drawArc(200, 200, 200, 200, 1, 180);
			
			g2d.setColor(Color.green);
			g2d.fillArc(200, 200, 200, 200, 1, 180);
			
			g2d.setColor(Color.green);
			g2d.drawArc(400, 200, 200, 200, 1, -180);
			
			g2d.setColor(Color.orange);
			g2d.fillArc(400, 200, 200, 200, 1, -180);
			
			g2d.setColor(Color.BLACK);
			g2d.setFont(new Font("Nunito",Font.BOLD, 70));
			g2d.drawString("Graphics", 350, 100);
			
			g2d.setStroke(new BasicStroke(12));
			g2d.setColor(Color.red);
			g2d.drawLine(20,80,20,190);
			
			g2d.setStroke(new BasicStroke(2));
			g2d.setColor(Color.blue);
			g2d.drawOval(80,80 , 120, 80);
			int [] xs= {470,270,70};
			int []ys= {450,250,50};
			
			g2d.drawRoundRect(500, 500, 40, 40, 20, 20);
			g2d.fillRoundRect(520, 520, 40, 40, 20, 20);
			g2d.drawPolygon(xs,xs,3);
			
			try {
				BufferedImage image = ImageIO.read(new File("src/90s.png"));
				g2d.drawImage(image, 0, 300, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

			
			
		}
		
		
		
}