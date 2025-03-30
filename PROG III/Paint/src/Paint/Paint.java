package Paint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Paint implements MouseListener, MouseMotionListener {

    private JFrame ventana;
    private JPanel panelDibujo;
    private JSlider deslizador;
    private int tamanoPincel = 3;
    private Color colorPincel = Color.BLACK;
    private List<Trazo> trazos = new ArrayList<>();
    private Trazo trazoActual;
    private List<Figura> figuras = new ArrayList<>();

    private static final int PINCEL = 1;
    private static final int CUADRADO = 2;
    private static final int TRIANGULO = 3;
    private static final int RECTANGULO = 4;
    private static final int BORRADOR = 5; // Herramienta para borrar
    private int herramientaActual = PINCEL;

    private static final int TAMANO_CUADRADO = 100;
    private static final int ANCHO_RECTANGULO = 150;
    private static final int ALTO_RECTANGULO = 100;
    private static final int TAMANO_TRIANGULO = 100;

    private class Trazo {
        List<Point> puntos;
        int tamano;
        Color color;

        public Trazo(int tamano, Color color) {
            this.puntos = new ArrayList<>();
            this.tamano = tamano;
            this.color = color;
        }
    }

    private abstract class Figura {
        protected Color color;
        protected int grosor;

        public Figura(Color color, int grosor) {
            this.color = color;
            this.grosor = grosor;
        }

        public abstract void dibujar(Graphics2D g);
    }

    private class Rectangulo extends Figura {
        private int x, y, ancho, alto;

        public Rectangulo(int x, int y, int ancho, int alto, Color color, int grosor) {
            super(color, grosor);
            this.x = x;
            this.y = y;
            this.ancho = ancho;
            this.alto = alto;
        }

        @Override
        public void dibujar(Graphics2D g) {
            g.setColor(color);
            g.setStroke(new BasicStroke(grosor));
            g.drawRect(x, y, ancho, alto);
        }
    }

    private class Triangulo extends Figura {
        private int[] xPoints = new int[3];
        private int[] yPoints = new int[3];

        public Triangulo(int x, int y, Color color, int grosor) {
            super(color, grosor);
            xPoints[0] = x;
            yPoints[0] = y + TAMANO_TRIANGULO;
            xPoints[1] = x + TAMANO_TRIANGULO;
            yPoints[1] = y + TAMANO_TRIANGULO;
            xPoints[2] = x + TAMANO_TRIANGULO / 2;
            yPoints[2] = y;
        }

        @Override
        public void dibujar(Graphics2D g) {
            g.setColor(color);
            g.setStroke(new BasicStroke(grosor));
            g.drawPolygon(xPoints, yPoints, 3);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Paint aplicacion = new Paint();
                aplicacion.ventana.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Paint() {
        inicializar();
    }

    private void inicializar() {
        ventana = new JFrame("Paint");
        ventana.setBounds(100, 100, 1000, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.getContentPane().setLayout(new BorderLayout());

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null);
        ventana.getContentPane().add(panelPrincipal, BorderLayout.CENTER);

        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                for (Trazo trazo : trazos) {
                    g2d.setStroke(new BasicStroke(trazo.tamano));
                    g2d.setColor(trazo.color);
                    for (int i = 1; i < trazo.puntos.size(); i++) {
                        Point p1 = trazo.puntos.get(i - 1);
                        Point p2 = trazo.puntos.get(i);
                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }

                if (trazoActual != null && trazoActual.puntos.size() > 1) {
                    g2d.setStroke(new BasicStroke(trazoActual.tamano));
                    g2d.setColor(trazoActual.color);
                    for (int i = 1; i < trazoActual.puntos.size(); i++) {
                        Point p1 = trazoActual.puntos.get(i - 1);
                        Point p2 = trazoActual.puntos.get(i);
                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }

                for (Figura figura : figuras) {
                    figura.dibujar(g2d);
                }
            }
        };

        panelDibujo.setBounds(333, 10, 643, 543);
        panelDibujo.setBackground(Color.WHITE);
        panelPrincipal.add(panelDibujo);
        panelDibujo.addMouseListener(this);
        panelDibujo.addMouseMotionListener(this);

        JButton btnColor12 = new JButton("Color Pincel");
        btnColor12.setBounds(10, 10, 130, 25);
        btnColor12.addActionListener(e -> {
            Color color = JColorChooser.showDialog(ventana, "Seleccione un color", colorPincel);
            if (color != null) {
                colorPincel = color;
            }
        });
        panelPrincipal.add(btnColor12);

        JButton btnBorrador = new JButton("Borrador");

        btnBorrador.setBounds(10, 210, 130, 25);
        btnBorrador.addActionListener(e -> {
            herramientaActual = BORRADOR;
        });
        panelPrincipal.add(btnBorrador);

        deslizador = new JSlider(1, 20, tamanoPincel);
        deslizador.setBounds(10, 50, 300, 25);
        deslizador.addChangeListener(e -> tamanoPincel = deslizador.getValue());
        panelPrincipal.add(deslizador);

        JButton btnRectangulo = new JButton("Rectangulo");
        btnRectangulo.setBounds(10, 90, 130, 25);
        btnRectangulo.addActionListener(e -> herramientaActual = RECTANGULO);
        panelPrincipal.add(btnRectangulo);

        JButton btnTriangulo = new JButton("Triangulo");
        btnTriangulo.setBounds(10, 130, 130, 25);
        btnTriangulo.addActionListener(e -> herramientaActual = TRIANGULO);
        panelPrincipal.add(btnTriangulo);

        JButton btnPincel = new JButton("Pincel");
     
        btnPincel.setBounds(10, 170, 130, 25);
        btnPincel.addActionListener(e -> herramientaActual = PINCEL);
        panelPrincipal.add(btnPincel);
    }
    
   

    @Override
    public void mousePressed(MouseEvent e) {
        if (herramientaActual == PINCEL || herramientaActual == BORRADOR) {
            Color colorActual = (herramientaActual == BORRADOR) ? panelDibujo.getBackground() : colorPincel;
            trazoActual = new Trazo(tamanoPincel, colorActual);
            trazos.add(trazoActual);
            trazoActual.puntos.add(e.getPoint());
        }
    }


    @Override
    public void mouseReleased(MouseEvent e) {
        if (herramientaActual == PINCEL && trazoActual != null) {
            trazoActual.puntos.add(e.getPoint());
            panelDibujo.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (herramientaActual == PINCEL || herramientaActual == BORRADOR) {
            if (trazoActual != null) {
                if (herramientaActual == BORRADOR) {
                    trazoActual.color = panelDibujo.getBackground(); // Borra con el color del fondo
                }
                trazoActual.puntos.add(e.getPoint());
                panelDibujo.repaint();
            }
        }
    }

    

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        switch (herramientaActual) {
            case RECTANGULO:
                figuras.add(new Rectangulo(x, y, ANCHO_RECTANGULO, ALTO_RECTANGULO, colorPincel, tamanoPincel));
                break;
            case TRIANGULO:
                figuras.add(new Triangulo(x, y, colorPincel, tamanoPincel));
                break;
        }
        panelDibujo.repaint();
    }

    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
} 
