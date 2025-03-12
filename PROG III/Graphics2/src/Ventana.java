import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

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
	        
	        //MONTANAS
	        g2d.setColor(Color.decode("#DFB2CD"));//ROSA OSCURO
	        g2d.fillRect(80, 260, 140, 240);
	        g2d.fillArc(80, 225, 140, 80, 1, 180);
	        g2d.setColor(Color.decode("#FFCAFC"));//ROSA CLARO
	        g2d.fillRect(0,340, 100, 160);
	        g2d.fillArc(0, 310, 100, 60, 1, 180);
	        g2d.setColor(Color.decode("#A58DB8"));//MORADO
	        g2d.fillRect(360, 240, 160, 260);
	        g2d.fillArc(360, 202, 160, 80, 1, 180);
	        g2d.setColor(Color.decode("#D364FF"));//MORADO OSCURO
	        g2d.fillRect(340, 400, 100, 100);
	        g2d.fillArc(340, 370, 100, 70, 1, 180);
	        g2d.setColor(Color.decode("#E6A7FF"));//MORADO CLARO
	        g2d.fillRect(440,320,120,180);
	        g2d.fillArc(440, 290, 120, 70, 1, 180);
	        
	        
	        //BLOQUES
	        g2d.setColor(Color.decode("#D9D366"));
	        g2d.fillRect(580, 460, 40, 40);
	        g2d.fillRect(580,418, 40, 40);
	        g2d.fillRect(580, 376, 40, 40);
	        g2d.fillRect(622, 376, 40, 40);
	        g2d.fillRect(664, 376, 40, 40);
	        g2d.fillRect(706, 376, 40, 40);
	        g2d.fillRect(706, 418, 40, 40);
	        g2d.fillRect(706, 460, 40, 40);


	        
	       //NUBES
	        g2d.setColor(Color.white);
	        g2d.fillOval(50,150,80,20);
	        g2d.fillOval(80,250,90,30);
	        g2d.fillOval(100,160,60,20);
	        g2d.fillOval(200,120,80,20);
	        g2d.fillOval(240,110,60,30);
	        g2d.fillOval(250,180,70,30);
	        g2d.fillOval(260,175,50,20);
	        g2d.fillOval(350,150,80,30);
	        g2d.fillOval(350,80,70,20);
	        g2d.fillOval(400,300,70,20);
	        g2d.fillOval(450,290,70,20);
	        g2d.fillOval(450,290,90,30);
	        g2d.fillOval(550,200,90,40);
	        g2d.fillOval(600,200,70,30);




	        
	        
	    
	        
	        
	        
	        //TUBERIA
	        g2d.setColor(Color.decode("#0BE221"));
	        g2d.fillRect(180, 400, 120, 20);
	        g2d.fillRect(200, 420, 80, 80);
	        
	        // PISO
	        g2d.setColor(Color.decode("#68DA56")); // CAFE CLARO
	        g2d.fillRect(0, 500, 800, 100);
	        g2d.setColor(Color.decode("#6EC061")); // CAFE OSCURO
	        g2d.fillRect(0, 520, 800, 80);
	    }

		
}