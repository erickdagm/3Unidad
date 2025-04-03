package Paint;

import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Teclado {

    private JFrame frame;
    private ArrayList<JLabel> keyLabels; // Lista para guardar las teclas
    private String keys = "QWERTYUIOPASDFGHJKLZXCVBNM"; // Letras de las teclas

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Teclado window = new Teclado();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Teclado() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 808, 602);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        frame.setFocusable(true);
        frame.requestFocusInWindow();

        // Inicialización de la lista de teclas
        keyLabels = new ArrayList<>();

        // Crear un panel donde agregar las teclas
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(0, 128, 128));
        frame.getContentPane().add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(new GridLayout(3, 10, 5, 5));

        // Agregar las etiquetas de las teclas a la interfaz
        for (int i = 0; i < keys.length(); i++) {
            JLabel keyLabel = new JLabel(String.valueOf(keys.charAt(i)));
            keyLabel.setHorizontalAlignment(JLabel.CENTER);
            keyLabel.setBorder(BorderFactory.createLineBorder(Color.magenta));
            keyLabel.setOpaque(true);  // Establecer la opacidad para que el fondo sea visible
            keyLabel.setBackground(Color.WHITE);  // Establecer un color de fondo inicial
            keyLabels.add(keyLabel);
            panel_1.add(keyLabel);
        }

        // Agregar un KeyListener al frame
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Este método no es necesario, ya que no lo usaremos para cambiar el color
            }

            @Override
            public void keyReleased(KeyEvent e) {
                char key = e.getKeyChar();
                // Convertir a mayúsculas para que no haya diferencias con las letras minúsculas
                key = Character.toUpperCase(key);
                
                // Usamos el ciclo for para recorrer las teclas
                for (int i = 0; i < keyLabels.size(); i++) {
                    if (key == keyLabels.get(i).getText().charAt(0)) {
                        keyLabels.get(i).setBackground(Color.WHITE); // Regresa al color original
                        keyLabels.get(i).revalidate();
                        keyLabels.get(i).repaint();
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();
                // Convertir a mayúsculas para que no haya diferencias con las letras minúsculas
                key = Character.toUpperCase(key);
                
                // Verificar si la tecla es una de las teclas de la lista
                if (keys.indexOf(key) != -1) {
                    // Usamos el ciclo for para recorrer las teclas
                    for (int i = 0; i < keyLabels.size(); i++) {
                        // Compara la tecla presionada con el texto de las etiquetas
                        if (key == keyLabels.get(i).getText().charAt(0)) {
                            keyLabels.get(i).setBackground(Color.YELLOW); // Cambia el color cuando la tecla es presionada
                            keyLabels.get(i).revalidate();
                            keyLabels.get(i).repaint();
                        }
                    }
                }
            }
        });

        // Asegura que las teclas puedan ser procesadas al presionar o soltar una tecla
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
}
