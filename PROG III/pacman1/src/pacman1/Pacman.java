package pacman1;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Pacman {

    private JFrame frame;
    private PanelJuego panel;
    private JButton btnReiniciar;
    private ArrayList<Rectangle> paredes = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Pacman window = new Pacman();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Pacman() {
        panel = new PanelJuego(paredes);
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setBackground(new Color(0, 128, 128));
        frame.getContentPane().add(panelInferior, BorderLayout.SOUTH);

        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.addActionListener(e -> panel.resetearPacman());
        panelInferior.add(btnReiniciar);
    }

    public class PanelJuego extends JPanel implements KeyListener {

        private int pacmanX = 200;
        private int pacmanY = 130;
        private final int PACMAN_SIZE = 30;
        private final int MOVIMIENTO = 10;
        private ArrayList<Rectangle> paredes;
        private int direccionX = 0;
        private int direccionY = 0;
        private Timer timer;

        public PanelJuego(ArrayList<Rectangle> paredes) {
            this.paredes = paredes;
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(this);

            // BORDES EXTERIORES
            paredes.add(new Rectangle(0, 0, 435, 5));     // Arriba
            paredes.add(new Rectangle(0, 0, 5, 225));     // Izquierda
            paredes.add(new Rectangle(430, 0, 5, 225));   // Derecha
            paredes.add(new Rectangle(0, 220, 435, 5));   // Abajo

        

           
            paredes.add(new Rectangle(30, 30, 5, 160));
            paredes.add(new Rectangle(30, 30, 60, 5));
            paredes.add(new Rectangle(90, 30, 5, 60));
            paredes.add(new Rectangle(60, 85, 35, 5));
            paredes.add(new Rectangle(60, 85, 5, 60));
            paredes.add(new Rectangle(30, 145, 35, 5));

         

           
            paredes.add(new Rectangle(270, 30, 5, 160));
            paredes.add(new Rectangle(270, 30, 60, 5));
            paredes.add(new Rectangle(330, 30, 5, 60));
            paredes.add(new Rectangle(300, 85, 35, 5));
            paredes.add(new Rectangle(300, 85, 5, 60));
            paredes.add(new Rectangle(270, 145, 35, 5));

            
            paredes.add(new Rectangle(120, 60, 30, 5));  
            paredes.add(new Rectangle(240, 120, 30, 5));  
            paredes.add(new Rectangle(90, 180, 90, 5));   
            paredes.add(new Rectangle(210, 60, 30, 5));  

            
            paredes.add(new Rectangle(100, 30, 50, 5));  
            paredes.add(new Rectangle(100, 160, 50, 5));  
            paredes.add(new Rectangle(230, 30, 50, 5));   
            paredes.add(new Rectangle(230, 160, 50, 5));  

            paredes.add(new Rectangle(120, 100, 5, 20)); 

           
            pacmanX = 200;  
            pacmanY = 80; 

            // Iniciar el Timer
            timer = new Timer(100, e -> moverPacman());
            timer.start();
        }

        private void moverPacman() {
            int newX = pacmanX + direccionX * MOVIMIENTO;
            int newY = pacmanY + direccionY * MOVIMIENTO;

            Rectangle futuro = new Rectangle(newX, newY, PACMAN_SIZE, PACMAN_SIZE);
            boolean hayColision = false;

            for (Rectangle pared : paredes) {
                if (futuro.intersects(pared)) {
                    hayColision = true;
                    break;
                }
            }

            if (!hayColision) {
                pacmanX = newX;
                pacmanY = newY;
            }

            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.YELLOW);
            g2d.fillArc(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE, 45, 270);

            g2d.setColor(Color.BLUE);
            for (Rectangle pared : paredes) {
                g2d.fill(pared);
            }
        }

        public void resetearPacman() {
            pacmanX = 200;
            pacmanY = 130;
            direccionX = 0;
            direccionY = 0;
            repaint();
            requestFocusInWindow();
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_W) {
                direccionX = 0;
                direccionY = -1;
            } else if (key == KeyEvent.VK_S) {
                direccionX = 0;
                direccionY = 1;
            } else if (key == KeyEvent.VK_A) {
                direccionX = -1;
                direccionY = 0;
            } else if (key == KeyEvent.VK_D) {
                direccionX = 1;
                direccionY = 0;
            }
        }

        @Override public void keyReleased(KeyEvent e) {}
        @Override public void keyTyped(KeyEvent e) {}
    }

}
