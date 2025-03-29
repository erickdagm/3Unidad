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
    private int tamañoPincel = 3;
    private Color colorPincel = Color.BLACK;
    private List<Trazo> trazos = new ArrayList<>();
    private Trazo trazoActual;
    private List<Figura> figuras = new ArrayList<>();
    
    private static final int PINCEL = 1;
    private static final int CUADRADO = 2;
    private static final int TRIANGULO = 3;
    private static final int RECTANGULO = 4;
    private int herramientaActual = PINCEL;

    private static final int TAMANO_CUADRADO = 100;
    private static final int ANCHO_RECTANGULO = 150;
    private static final int ALTO_RECTANGULO = 100;
    private static final int TAMANO_TRIANGULO = 100;

    private class Trazo {
        List<Point> puntos;
        int tamaño;
        Color color;

        public Trazo(int tamaño, Color color) {
            this.puntos = new ArrayList<>();
            this.tamaño = tamaño;
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
        ventana.getContentPane().setBackground(new Color(192, 192, 192));
        ventana.getContentPane().setLayout(new BorderLayout(0, 0));
        ventana.setBounds(100, 100, 1000, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(69, 69, 69));
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        ventana.getContentPane().add(panelPrincipal, BorderLayout.CENTER);
        panelPrincipal.setLayout(null);

        panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                for (Trazo trazo : trazos) {
                    g2d.setStroke(new BasicStroke(trazo.tamaño));
                    g2d.setColor(trazo.color);
                    for (int i = 1; i < trazo.puntos.size(); i++) {
                        Point p1 = trazo.puntos.get(i - 1);
                        Point p2 = trazo.puntos.get(i);
                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
                    }
                }
                
                // Dibujar trazo actual
                if (trazoActual != null && trazoActual.puntos.size() > 1) {
                    g2d.setStroke(new BasicStroke(trazoActual.tamaño));
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

        JPanel panelControles = new JPanel();
        panelControles.setBackground(new Color(128, 128, 128));
        panelControles.setBounds(10, 10, 297, 543);
        panelPrincipal.add(panelControles);
        panelControles.setLayout(null);
        
        JButton btnColor1 = new JButton("");
        btnColor1.setBackground(new Color(128, 0, 255));
        btnColor1.setBounds(106, 41, 85, 21);
        panelControles.add(btnColor1);
        
        JButton btnColor2 = new JButton("");
        btnColor2.setBackground(new Color(0, 255, 0));
        btnColor2.setBounds(106, 133, 85, 21);
        panelControles.add(btnColor2);
        
        JButton btnColor3 = new JButton("");
        btnColor3.setBackground(new Color(255, 0, 128));
        btnColor3.setBounds(10, 41, 85, 21);
        panelControles.add(btnColor3);
        
        JButton btnColor4 = new JButton("");
        btnColor4.setBackground(new Color(64, 0, 64));
        btnColor4.setBounds(201, 41, 85, 21);
        panelControles.add(btnColor4);
        
        JButton btnColor5 = new JButton("");
        btnColor5.setBackground(new Color(0, 128, 255));
        btnColor5.setBounds(201, 102, 85, 21);
        panelControles.add(btnColor5);
        
        JButton btnColor6 = new JButton("");
        btnColor6.setBackground(new Color(255, 128, 0));
        btnColor6.setBounds(10, 72, 85, 21);
        panelControles.add(btnColor6);
        
        JButton btnColor7 = new JButton("");
        btnColor7.setBackground(new Color(0, 0, 0));
        btnColor7.setBounds(10, 102, 85, 21);
        panelControles.add(btnColor7);
        
        JButton btnColor8 = new JButton("");
        btnColor8.setBackground(new Color(255, 255, 0));
        btnColor8.setBounds(106, 72, 85, 21);
        panelControles.add(btnColor8);
        
        JButton btnColor9 = new JButton("");
        btnColor9.setBackground(new Color(255, 255, 255));
        btnColor9.setBounds(106, 102, 85, 21);
        panelControles.add(btnColor9);
        
        JButton btnColor10 = new JButton("");
        btnColor10.setBackground(new Color(128, 255, 0));
        btnColor10.setBounds(201, 72, 85, 21);
        panelControles.add(btnColor10);
        
        JButton btnColor11 = new JButton("");
        btnColor11.setBackground(new Color(255, 0, 0));
        btnColor11.setBounds(10, 133, 85, 21);
        panelControles.add(btnColor11);
        
        JButton btnColor12 = new JButton("");
        btnColor12.setBackground(new Color(192, 192, 192));
        btnColor12.setBounds(201, 133, 85, 21);
        btnColor12.addActionListener(e -> {
            Color color = JColorChooser.showDialog(ventana, "Seleccione un color", colorPincel);
            if (color != null) {
                colorPincel = color;
            }
        });
        panelControles.add(btnColor12);
        
        JLabel lblColores = new JLabel("Colores");
        lblColores.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblColores.setBounds(10, 10, 181, 25);
        panelControles.add(lblColores);
        
        JLabel lblTamaño = new JLabel("Tamaño:");
        lblTamaño.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblTamaño.setBounds(10, 345, 67, 25);
        panelControles.add(lblTamaño);
        
        JButton btnPincel = new JButton("PINCEL");
        btnPincel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        btnPincel.setBounds(10, 418, 85, 21);
        btnPincel.addActionListener(e -> herramientaActual = PINCEL);
        panelControles.add(btnPincel);
        
        JButton btnBorrador = new JButton("BORRAR");
        btnBorrador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        btnBorrador.setBounds(201, 418, 85, 21);
        btnBorrador.addActionListener(e -> {
           ;
            herramientaActual = PINCEL;
        });
        panelControles.add(btnBorrador);
        
        JButton btnLimpiar = new JButton("LIMPIAR LIENZO");
        btnLimpiar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        btnLimpiar.setBounds(10, 461, 276, 21);
        btnLimpiar.addActionListener(e -> {
            trazos.clear();
            figuras.clear();
            panelDibujo.repaint();
        });
        panelControles.add(btnLimpiar);
        
        JButton btnGuardar = new JButton("GUARDAR");
        btnGuardar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        btnGuardar.setBounds(10, 500, 276, 21);
        panelControles.add(btnGuardar);
        
        JLabel lblFondo = new JLabel("Color de fondo:");
        lblFondo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblFondo.setBounds(10, 310, 162, 25);
        panelControles.add(lblFondo);
        
        JButton btnColorFondo = new JButton("");
        btnColorFondo.setFont(new Font("Tahoma", Font.BOLD, 10));
        btnColorFondo.setBounds(182, 310, 79, 32);
        btnColorFondo.addActionListener(e -> {
            Color colorSeleccionado = JColorChooser.showDialog(ventana, 
                "Selecciona un color", panelDibujo.getBackground());
            if (colorSeleccionado != null) {
                panelDibujo.setBackground(colorSeleccionado);
            }
        });
        panelControles.add(btnColorFondo);

        deslizador = new JSlider(1, 20, tamañoPincel);
        deslizador.setBounds(10, 380, 276, 26);
        deslizador.addChangeListener(e -> tamañoPincel = deslizador.getValue());
        panelControles.add(deslizador);
        
        JLabel lblNewLabel = new JLabel("Figuras");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(10, 174, 98, 32);
        panelControles.add(lblNewLabel);
        
        JButton triangulo = new JButton("");
        triangulo.setBackground(new Color(255, 255, 255));
        triangulo.setIcon(new ImageIcon("C:\\Users\\erick\\OneDrive\\Escritorio\\Sprites\\variante-de-contorno-de-triangulo.png"));
        triangulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        triangulo.setBounds(10, 210, 85, 32);
        triangulo.addActionListener(e -> herramientaActual = TRIANGULO);
        panelControles.add(triangulo);
        
        JButton cuaadrado = new JButton("CUADRADO");
        cuaadrado.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        cuaadrado.setBounds(106, 210, 85, 32);
        cuaadrado.addActionListener(e -> herramientaActual = CUADRADO);
        panelControles.add(cuaadrado);
        
        JButton circulo = new JButton("CÍRCULO");
        circulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        circulo.setBounds(201, 210, 85, 32);
        panelControles.add(circulo);
        
        JButton rectangulo = new JButton("RECTÁNGULO");
        rectangulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
        rectangulo.setBounds(10, 250, 85, 32);
        rectangulo.addActionListener(e -> herramientaActual = RECTANGULO);
        panelControles.add(rectangulo);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (herramientaActual == PINCEL) {
            trazoActual = new Trazo(tamañoPincel, colorPincel);
            trazos.add(trazoActual);
            trazoActual.puntos.add(e.getPoint());
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (herramientaActual == PINCEL) {
            if (trazoActual != null) {
                trazoActual.puntos.add(e.getPoint());
                panelDibujo.repaint();
            }
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (herramientaActual == PINCEL) {
            if (trazoActual != null) {
                trazoActual.puntos.add(e.getPoint());
                panelDibujo.repaint();
            }
        }
    }

    @Override 
    public void mouseClicked(MouseEvent e) {
        if (herramientaActual != PINCEL) {
            int x = e.getX();
            int y = e.getY();
            
            switch(herramientaActual) {
                case CUADRADO:
                    figuras.add(new Rectangulo(x, y, TAMANO_CUADRADO, TAMANO_CUADRADO, colorPincel, tamañoPincel));
                    break;
                case RECTANGULO:
                    figuras.add(new Rectangulo(x, y, ANCHO_RECTANGULO, ALTO_RECTANGULO, colorPincel, tamañoPincel));
                    break;
                case TRIANGULO:
                    figuras.add(new Triangulo(x, y, colorPincel, tamañoPincel));
                    break;
            }
            panelDibujo.repaint();
        }
    }
    
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
    @Override public void mouseMoved(MouseEvent e) {}
}