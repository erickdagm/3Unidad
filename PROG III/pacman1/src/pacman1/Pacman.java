package pacman1;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;
import java.util.Random;

public class Pacman {

    private JFrame frame;
    private PanelJuego panel;
    private JButton btnReiniciar;
    private JLabel lblTiempo; 
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
        btnReiniciar.addActionListener(e -> panel.resetearJuego());
        panelInferior.add(btnReiniciar);

        lblTiempo = new JLabel("Tiempo: 0s"); 
        lblTiempo.setForeground(Color.WHITE);
        panelInferior.add(lblTiempo);

        panel.setLabelTiempo(lblTiempo); // Pasar referencia al panel de juego
    }

    public class PanelJuego extends JPanel implements KeyListener {

        private int pacmanX = 200;
        private int pacmanY = 130;
        private final int PACMAN_SIZE = 30;
        private final int MOVIMIENTO = 10;
        private ArrayList<Rectangle> paredes;
        private ArrayList<Punto> puntos = new ArrayList<>();
        private ArrayList<Fantasma> fantasmas = new ArrayList<>();
        private int direccionX = 0;
        private int direccionY = 0;
        private Timer timer;
        private Timer timerJuego; // Temporizador 
        private int segundos = 0; // Xontador 
        private JLabel lblTiempo; //
        private boolean juegoTerminado = false;

        public PanelJuego(ArrayList<Rectangle> paredes) {
            this.paredes = paredes;
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(this);

            // Bordes
            paredes.add(new Rectangle(0, 0, 435, 5));     // Arriba
            paredes.add(new Rectangle(0, 0, 5, 225));     // Izquierda
            paredes.add(new Rectangle(430, 0, 5, 225));   // Derecha
            paredes.add(new Rectangle(0, 220, 435, 5));   // Abajo

            // laberinto interior
            paredes.add(new Rectangle(40, 40, 120, 5));
            paredes.add(new Rectangle(190, 40, 130, 5));
            paredes.add(new Rectangle(40, 40, 5, 145));
            paredes.add(new Rectangle(80, 80, 80, 5));
            paredes.add(new Rectangle(155, 85, 5, 95));
            paredes.add(new Rectangle(190, 80, 5, 70));
            paredes.add(new Rectangle(80, 180, 80, 5));
            paredes.add(new Rectangle(190, 180, 60, 5));
            paredes.add(new Rectangle(280, 180, 80, 5));
            paredes.add(new Rectangle(355, 40, 5, 145));
            paredes.add(new Rectangle(230, 80, 90, 5));
            paredes.add(new Rectangle(80, 120, 40, 30));
            paredes.add(new Rectangle(230, 120, 35, 30));
            paredes.add(new Rectangle(300, 120, 20, 30));
            paredes.add(new Rectangle(395, 40, 5, 145));

            pacmanX = 200;
            pacmanY = 80;

            inicializarPuntos();
            inicializarFantasmas();

            timer = new Timer(100, e -> mover());
            timer.start();

            timerJuego = new Timer(1000, e -> {
                if (!juegoTerminado) {
                    segundos++;
                    if (lblTiempo != null) {
                        lblTiempo.setText("Tiempo: " + segundos + "s");
                    }
                }
            });
            timerJuego.start();
        }

        public void setLabelTiempo(JLabel lblTiempo) {
            this.lblTiempo = lblTiempo;
        }

        private void inicializarPuntos() {
            puntos.clear();
            for (int i = 20; i < 400; i += 20) {
                for (int j = 20; j < 200; j += 20) {
                    Rectangle posible = new Rectangle(i, j, 6, 6);
                    boolean tocaPared = false;
                    for (Rectangle pared : paredes) {
                        if (pared.intersects(posible)) {
                            tocaPared = true;
                            break;
                        }
                    }
                    if (!tocaPared) {
                        puntos.add(new Punto(i, j));
                    }
                }
            }
        }

        private void inicializarFantasmas() {
            fantasmas.clear();
            fantasmas.add(new Fantasma(60, 60));
            fantasmas.add(new Fantasma(300, 60));
            fantasmas.add(new Fantasma(180, 150));
        }

        private void mover() {
            if (juegoTerminado) return;

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

            Rectangle pacmanRect = new Rectangle(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE);
            Iterator<Punto> it = puntos.iterator();
            while (it.hasNext()) {
                Punto punto = it.next();
                if (pacmanRect.intersects(punto.getBounds())) {
                    it.remove();
                }
            }

            for (Fantasma f : fantasmas) {
                f.mover(paredes);
                if (pacmanRect.intersects(f.getBounds())) {
                    terminarJuego(false);
                }
            }

            if (puntos.isEmpty()) {
                terminarJuego(true);
            }

            repaint();
        }

        private void terminarJuego(boolean victoria) {
            juegoTerminado = true;
            timer.stop();
            timerJuego.stop();
            String mensaje = victoria ? "Ganaste!!" : "Has perdido :(";
            JOptionPane.showMessageDialog(this, mensaje);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.YELLOW);
            g2d.fillArc(pacmanX, pacmanY, PACMAN_SIZE, PACMAN_SIZE, 45, 360);

            g2d.setColor(Color.decode("#2FACFF"));
            for (Rectangle pared : paredes) {
                g2d.fill(pared);
            }

            for (Punto p : puntos) {
                p.dibujar(g);
            }

            for (Fantasma f : fantasmas) {
                f.dibujar(g);
            }
        }

        public void resetearJuego() {
            pacmanX = 200;
            pacmanY = 130;
            direccionX = 0;
            direccionY = 0;
            juegoTerminado = false;
            inicializarPuntos();
            inicializarFantasmas();
            segundos = 0;
            if (lblTiempo != null) {
                lblTiempo.setText("Tiempo: 0s");
            }
            timer.start();
            timerJuego.start();
            repaint();
            requestFocusInWindow();
        }

        @Override public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_UP) {
                direccionX = 0;
                direccionY = -1;
            } else if (key == KeyEvent.VK_DOWN) {
                direccionX = 0;
                direccionY = 1;
            } else if (key == KeyEvent.VK_LEFT) {
                direccionX = -1;
                direccionY = 0;
            } else if (key == KeyEvent.VK_RIGHT) {
                direccionX = 1;
                direccionY = 0;
            }
        }

        @Override public void keyReleased(KeyEvent e) {}
        @Override public void keyTyped(KeyEvent e) {}
    }

    class Punto {
        int x, y, tamaño = 6;
        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public Rectangle getBounds() {
            return new Rectangle(x, y, tamaño, tamaño);
        }
        public void dibujar(Graphics g) {
            g.setColor(Color.WHITE);
            g.fillOval(x, y, tamaño, tamaño);
        }
    }

    class Fantasma {
        int x, y, tamaño = 25;
        int dx = 10, dy = 0;
        Random rand = new Random();

        public Fantasma(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void mover(ArrayList<Rectangle> paredes) {
            int newX = x + dx;
            int newY = y + dy;
            Rectangle futuro = new Rectangle(newX, newY, tamaño, tamaño);
            boolean hayColision = false;
            for (Rectangle pared : paredes) {
                if (futuro.intersects(pared)) {
                    hayColision = true;
                    break;
                }
            }

            if (!hayColision) {
                x = newX;
                y = newY;
            } else {
                int dir = rand.nextInt(4);
                switch (dir) {
                    case 0: dx = 10; dy = 0; break;
                    case 1: dx = -10; dy = 0; break;
                    case 2: dx = 0; dy = 10; break;
                    case 3: dx = 0; dy = -10; break;
                }
            }
        }

        public Rectangle getBounds() {
            return new Rectangle(x, y, tamaño, tamaño);
        }

        public void dibujar(Graphics g) {
            g.setColor(Color.PINK);
            g.fillOval(x, y, tamaño, tamaño);
        }
    }
}
