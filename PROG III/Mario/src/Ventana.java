import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
//		this.revalidate();=
		
	
	
	}
		@Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        Graphics2D g2d = (Graphics2D) g.create();

	        //FONDO
	        g2d.setColor(Color.decode("#ADD8E6")); // AZUL CLARO
	        g2d.fillRect(0, 0, 800, 600);
	        
	        
	        
	        //BLOQUES DE ITEMS
	        g2d.setColor(Color.black);
	        g2d.drawRect(200, 100, 50, 50);
	        g2d.drawRect(251, 100, 50, 50);
	        g2d.drawRect(550, 150, 50, 50);
	        g2d.setColor(Color.decode("#FF8C00")); // NARANJA
	        g2d.fillRect(200, 100, 50, 50);
	        g2d.fillRect(251, 100, 50, 50);
	        g2d.fillRect(550, 150, 50, 50);
	        
	        
	        
	        
	        
	        
	        g2d.setColor(Color.black); //SOMBRA DEL BLOQUE AZUL
	        g2d.fillRoundRect(270, 320, 150, 190, 20, 20);
	        
	     
	        g2d.setColor(Color.black);//BLOQUE AZUL
	        g2d.drawRoundRect(250, 300, 150, 200, 20, 20);
	        g2d.setColor(Color.decode("#87CEFA")); 
	        g2d.fillRoundRect(250, 300, 150, 200, 20, 20);
	        g2d.setColor(Color.decode("#2C718A"));
	        g2d.fillRect(390, 310, 10, 200);
	        g2d.fillRect(300, 490,100, 10);	        
	        
	         // BLOQUE ROSA
	        g2d.setColor(Color.black);
	        g2d.drawRoundRect(150, 350, 150, 150, 20, 20);
	        g2d.fillRoundRect(170, 370, 150, 150, 20, 20); 
	        g2d.setColor(Color.decode("#FFB6C1"));
	        g2d.fillRoundRect(150, 350, 150, 150, 20, 20); 
	        g2d.setColor(Color.decode("#BA7B7B"));
	        g2d.fillRect(290, 360, 10, 140);
	        g2d.fillRect(160, 490, 140, 10);
	        
	        
	        
	        // TUBERIA
	        g2d.setColor(Color.black);
	        g2d.drawRect(500, 370, 80, 130);
	        g2d.setColor(Color.decode("#008000")); // VERDE OSCURO
	        g2d.fillRect(500, 370, 80, 130);
	        g2d.setColor(Color.black); // VERDE CLARO
	        g2d.drawRoundRect(490, 350, 100, 40, 20, 20);
	        g2d.setColor(Color.decode("#22B14C"));
	        g2d.fillRoundRect(490, 350, 100, 40, 20, 20);
	        g2d.setColor(Color.decode("#004C10"));
	        g2d.fillRect(570, 390, 10, 120);
	        g2d.setColor(Color.decode("#156025"));
	        g2d.fillRect(560, 390, 10, 120);
	        g2d.setColor(Color.decode("#196E2B"));
	        g2d.fillRect(550, 390, 10, 120);

	        
	        
	        //MARIO
	        g2d.setColor(Color.decode("#FF0000")); // PARTE ROJA
	        g2d.fillRect(350, 450, 30, 40);
	        g2d.setColor(Color.decode("#000000")); // PARTE NEGRA
	        g2d.fillRect(355, 490, 10, 10);
	        g2d.fillRect(365, 490, 10, 10);
	        
	        
	        //CARA DE MARIO
	        g2d.setColor(Color.decode("#FFC0CB")); // ROSA 
	        g2d.fillOval(345, 410, 40, 50);
	        g2d.setColor(Color.red);
	        g2d.drawArc(345, 410, 40, 40, 2, 220);
	        g2d.fillArc(345, 410, 40, 40, 2, 220);
	        
	      
	        //PLANTA
	        g2d.setColor(Color.decode("#008000")); // VERDE OSCURO
	        g2d.fillRect(535, 300, 15, 50);
	        g2d.fillArc(550, 320, 15, 15, -1, -145);//hojas
	        g2d.fillArc(550, 300, 15, 15, -1, -145);//hojas
	        g2d.fillArc(520, 320, 15, 15, -1, -145);//hojas
	        g2d.fillArc(520, 300, 15, 15, -1, -145);//hojas
	        g2d.setColor(Color.red);
	        g2d.fillArc(515, 255, 50, 50,1,145);
	        g2d.fillArc(515, 255, 50, 50,1,-145);
	        g2d.setColor(Color.white);
	        g2d.setStroke(new BasicStroke(4));
	        g2d.drawLine(520, 265, 540, 280);
	        g2d.drawLine(520, 295, 540, 280);
	        
	        
	        
	        //DETALLES
	        g2d.setColor(Color.GRAY);
	        g2d.fillOval(155,355,15,15); g2d.fillOval(280,355,15,15);g2d.fillOval(155,480,15,15);g2d.fillOval(280,480,15,15);//DETALLES DE BLOQUE ROSA
	        g2d.fillOval(255,305,15,15);g2d.fillOval(380,305,15,15);g2d.fillOval(380,480,15,15);//DETALLES DEL BLOQUE AZUL
	        g2d.setColor(Color.white);
	        g2d.fillOval(535,265,5,5);g2d.fillOval(545,275,5,5);g2d.fillOval(545,260,5,5);g2d.fillOval(530,290,5,5);g2d.fillOval(545,290,5,5);//DETALLES DE LA PLANTA
	        g2d.fillOval(200,120,10,5);g2d.fillOval(290,120,10,5);g2d.fillOval(550,170,10,5);g2d.fillOval(590,170,10,5);
	        g2d.setColor(Color.decode("#E41D1D"));
	        g2d.fillOval(490,290,15,15);
	        g2d.setColor(Color.decode("#EEBABA"));
	        g2d.fillOval(495,290,10,10);

	        
	        // PISO
	        g2d.setColor(Color.decode("#CD853F")); // CAFE CLARO
	        g2d.fillRect(0, 500, 800, 100);
	        g2d.setColor(Color.decode("#8B4513")); // CAFE OSCURO
	        g2d.fillRect(0, 520, 800, 80);
	    }

		
}