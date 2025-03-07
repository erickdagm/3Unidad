package Casita;

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
			g2d.setColor(Color.decode("#B2F0FF"));//Toda la ventanaa
			g2d.drawRect(0, 0, 800, 600);
			g2d.fillRect(0, 0, 800, 600);
			
			
			
			
			g2d.setColor(Color.decode("#97D06E"));//El pasto
			g2d.drawRect(0, 450, 150, 600);
			g2d.fillRect(0, 450, 800, 150);
			
			
			for (int i = 0, x=0; i <=20; i++,x+=49) {
				
				g2d.setColor(Color.decode("#D1A774"));// cerco
				g2d.drawRect(x, 300, 40, 150);
				g2d.fillRect(x, 300, 40, 150);
			
			
			}
			g2d.setStroke(new BasicStroke(15));
			g2d.drawLine(0,340,800,340);
			
			
			g2d.setColor(Color.decode("#ECC5C5"));//la casita
			g2d.drawRect(200, 250, 400, 280);
			g2d.fillRect(200, 250, 400, 280);
			
			g2d.setColor(Color.decode("#532708"));
			int [] xs= {195,250,580};
			int []ys= {240,110,240};
			int nPoints=3;
			
			g2d.drawPolygon(xs,ys,nPoints);
			g2d.fillPolygon(xs,ys,nPoints);
			
			g2d.setColor(Color.decode("#856D1C"));//la puerta
			g2d.drawRect(230, 360, 90, 170);
			g2d.fillRect(230, 360, 90, 170);
			
			
			
			
			g2d.setColor(Color.decode("#D6F9FF"));//ventana
			g2d.drawRect(380, 360, 180, 100);
			g2d.fillRect(380, 360, 180, 100);
			
			g2d.drawArc(380, 300, 180, 110, 1, 180);//ventana
			g2d.fillArc(380, 300, 180, 110, 1, 180);
			
			
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.white);
			g2d.drawLine(375, 360, 565, 360);
			
			g2d.drawLine(375, 415, 565, 415);
			
			g2d.drawLine(470, 360, 470, 465);

			g2d.setColor(Color.yellow);
			g2d.drawOval(300, 430, 15,15);
			g2d.fillOval(300, 430, 15,15);

//			g2d.setColor(Color.magenta);
//			g2d.setStroke(new BasicStroke(5));
//			g2d.drawRect(100,100,80,80);
//			g2d.setFont(new Font("Nunito",Font.BOLD, 70));
//			g2d.fillRect(110, 110, 80, 80);
//			g2d.drawArc(200, 200, 200, 200, 1, 180);
//			
//			g2d.setColor(Color.green);
//			g2d.fillArc(200, 200, 200, 200, 1, 180);
//			
//			g2d.setColor(Color.green);
//			g2d.drawArc(400, 200, 200, 200, 1, -180);
//			
//			g2d.setColor(Color.orange);
//			g2d.fillArc(400, 200, 200, 200, 1, -180);
//			
//			g2d.setColor(Color.BLACK);
//			
//			g2d.drawString("Graphics", 350, 100);
			
			
		

			
			
		}
		
		
		
}