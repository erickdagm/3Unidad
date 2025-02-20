
package ventana;

/**
 *
 * @author erick
 */
public class Principal {
    public static void main(String[] args) {
        
        Ventana v1= new Ventana();
        v1.setBounds(0, 0, 500, 500);
        v1.setResizable(false);
        v1.setVisible(true);//hacemos visible la ventana
        v1.setLocationRelativeTo(null);
        
    }
}
