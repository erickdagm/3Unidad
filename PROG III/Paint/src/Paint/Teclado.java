package Paint;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.Border;

public class Teclado {

    private JFrame frame;
    private ArrayList<JLabel> keyLabels;
    private String keys = "QWERTYUIOPASDFGHJKLZXCVBNM";
    private JTextField textField;
    private JLabel palabraLabel;
    private JLabel timerLabel;
    private Timer swingTimer;

    private ArrayList<String> listaPalabras;
    private String palabraActual;
    private long tiempoInicio;
    private boolean contadorIniciado = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Teclado window = new Teclado();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Teclado() {
        // mostramos instrucciones al arrancar
        JOptionPane.showMessageDialog(null,
            "escribe la palabra que ves en pantalla tal como aparece.\n" +
            "respetá mayúsculas y minúsculas.\n" +
            "presiona ENTER para validar.",
            "instrucciones", JOptionPane.INFORMATION_MESSAGE);
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 808, 602);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

        // inicializa el swing timer (no empieza hasta que lo comience a escribir)
        swingTimer = new Timer(100, e -> {
            if (contadorIniciado) {
                long ahora = System.currentTimeMillis();
                double segundos = (ahora - tiempoInicio) / 1000.0;
                timerLabel.setText(String.format("Tiempo: %.1fs", segundos));
            }
        });
        
        // lista de teclas
        keyLabels = new ArrayList<>();
        JPanel panelTeclas = new JPanel();
        panelTeclas.setBackground(new Color(0, 128, 128));
        panelTeclas.setLayout(new GridLayout(3, 10, 5, 5));
        frame.getContentPane().add(panelTeclas, BorderLayout.CENTER);

        for (int i = 0; i < keys.length(); i++) {
            JLabel keyLabel = new JLabel(String.valueOf(keys.charAt(i)), SwingConstants.CENTER);
            keyLabel.setOpaque(true);
            keyLabel.setBackground(Color.WHITE);
            keyLabel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
            keyLabels.add(keyLabel);
            panelTeclas.add(keyLabel);
        }

        // panel superior para el campo de texto y palabra a escribir
        JPanel panelSuperior = new JPanel(new BorderLayout());
        frame.getContentPane().add(panelSuperior, BorderLayout.NORTH);

        palabraLabel = new JLabel("Palabra:", SwingConstants.CENTER);
        palabraLabel.setFont(new Font("Arial", Font.BOLD, 24));
        panelSuperior.add(palabraLabel, BorderLayout.CENTER);

        textField = new JTextField(15);
        textField.setFont(new Font("Arial", Font.PLAIN, 20));
        panelSuperior.add(textField, BorderLayout.SOUTH);

        // panel para el timer
        JPanel panelTimer = new JPanel();
        timerLabel = new JLabel("Tiempo: 0.0s");
        panelTimer.add(timerLabel);
        panelSuperior.add(panelTimer, BorderLayout.EAST);

        // lista de palabras (ya hay más de 100)
        listaPalabras = new ArrayList<>(Arrays.asList(
            "Computadora", "Telefono", "Mochila", "Estructura", "Espirulina", "Infeccion", "Oxidacion",
            "Camioneta", "Ventilador", "Escritorio", "Mermelada", "Cuchillo", "Ventana", "Martillo",
            "Calculadora", "Planeta", "Astronauta", "Almohada", "Sandalia", "Espejo", "Cabello",
            "Cartuchera", "Libreta", "Canguro", "Enciclopedia", "Lámpara", "Tornillo", "Zanahoria",
            "Refrigerador", "Cámara", "Microscopio", "Cascada", "Montaña", "Agua", "Silla", "Mesa",
            "Tetera", "Naranja", "Cereza", "Zapato", "Pizarra", "Escalera", "Tijera", "Cuaderno",
            "Pelota", "Cuerda", "Paraguas", "Reloj", "Sombrero", "Guante", "Llave", "Cuadro",
            "Anillo", "Cartera", "Bolso", "Maleta", "Estufa", "Cafetera", "Cuchara", "Tenedor",
            "Cinta", "Pegamento", "Cepillo", "Esponja", "Estante", "Puerta", "Botella", "Papel",
            "Cámara", "Carpeta", "Toalla", "Sábana", "Colchón", "Corbata", "Pantalón", "Camisa",
            "Chaleco", "Vestido", "Calcetín", "Botín", "Chancla", "Balón", "Gorra", "Bandera",
            "Aguacate", "Melón", "Piña", "Mandarina", "Fresa", "Pera", "Manzana", "Uva", "Kiwi",
            "Lenteja", "Frijol", "Maíz", "Trigo", "Arroz", "Harina", "Manteca", "Aceite", "Sal"
        ));

        // cuando se presiona enter
        textField.addActionListener(e -> validarPalabra());
        textField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                iniciarContadorSiEsNecesario();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {}
            public void changedUpdate(javax.swing.event.DocumentEvent e) {}

            private void iniciarContadorSiEsNecesario() {
            	if (!contadorIniciado && !textField.getText().isEmpty()) {
            	    tiempoInicio = System.currentTimeMillis();
            	    contadorIniciado = true;
            	    swingTimer.start(); // 🔥 ahora sí empieza a actualizar el label
            	}
            }
        });


        // key listener para las teclas
        frame.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char key = Character.toUpperCase(e.getKeyChar());
                if (keys.indexOf(key) != -1) {
                    for (JLabel label : keyLabels) {
                        if (label.getText().equals(String.valueOf(key))) {
                            label.setBackground(Color.YELLOW);
                        }
                    }
                }
            }

            public void keyReleased(KeyEvent e) {
                char key = Character.toUpperCase(e.getKeyChar());
                for (JLabel label : keyLabels) {
                    if (label.getText().equals(String.valueOf(key))) {
                        label.setBackground(Color.WHITE);
                    }
                }
            }
        });

        frame.setFocusable(true);
        frame.requestFocusInWindow();

        nuevaPalabra();
        swingTimer.stop(); // 🛑 detenemos el contador
        timerLabel.setText("Tiempo: 0.0s");
        contadorIniciado = false;

        SwingUtilities.invokeLater(() -> textField.requestFocusInWindow());
    }

    private void nuevaPalabra() {
        Random rand = new Random();
        palabraActual = listaPalabras.get(rand.nextInt(listaPalabras.size()));
        palabraLabel.setText("Palabra: " + palabraActual);
        textField.setText("");
        textField.requestFocus();
        timerLabel.setText("Tiempo: 0.0s");
        contadorIniciado = false; // reinicia el flag
    }

    private void validarPalabra() {
        String escrita = textField.getText();
        if (escrita.equals(palabraActual)) {
            long fin = System.currentTimeMillis();
            double segundos = (fin - tiempoInicio) / 1000.0;
            JOptionPane.showMessageDialog(frame,
                "¡correcto! lo hiciste en " + segundos + " segundos.",
                "bien hecho", JOptionPane.INFORMATION_MESSAGE);
            nuevaPalabra();
        } else {
            JOptionPane.showMessageDialog(frame,
                "esa no es la palabra correcta, intenta otra vez.",
                "ups", JOptionPane.ERROR_MESSAGE);
            textField.setText("");
        }
    }
}
