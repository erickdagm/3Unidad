
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Ventana extends JFrame{
    
    private JLabel etiqueta;//no es necesario inicializar las etiquetas, tambien se le indica el modificador de acceso, todos los JLabel deben ser privados, le indicamos que esta clase en este momento solo tendra acceso a este JLabel
    private JLabel etiqueta1;
    
    public Ventana(){ //constructor de la clase ventana
        JButton boton=new JButton("Da click");//cramos instancias de la clase JButton, primero ponemos el nombre de la clase, despues le ponemos un nombre al boton y despues del = invocamos al metodo constructore metodo le indicamos al programa que harems uso de coordenadas, para poder ubicarlos donde nosotros queremos, el null es para indicarle que no hara nada hasta que nosotros le demos una instruccion
        //ahora le daremos un tamano a la ventana, debemos establecerlo nosotros
        etiqueta=new JLabel("Interfaz Grafica");
        etiqueta.setBounds(10, 20, 300, 30);// Le colocamos 10 pixeles de separacion a la derecha, 20 pixeles de separacion hacia abajo, y un ancho de 300 pixeles y un alto de 30 pixeles
        add(etiqueta);//sin este metodo, no va a mostrar la etiqueta
        
        etiqueta1=new JLabel("Version 1.0");
        etiqueta1.setBounds(10, 50, 1000, 30);// Le colocamos 10 pixeles de separacion a la derecha, 20 pixeles de separacion hacia abajo, y un ancho de 300 pixeles y un alto de 30 pixeles
        add(etiqueta1);//sin este metodo, no va a mostrar la etiqueta
        this.setSize(500, 500);// no es necesario ponerle el this
        setTitle("Ventana");
        setLocationRelativeTo(null);//establecemos la ventana en el centro
        setResizable(false);//establecemos si queremos que la ventana cambie de tamano o no
        setMinimumSize(new Dimension(200,200));//establecemos el tamano minimo
        this.getContentPane().setBackground(Color.BLACK);//establece el color de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
        boton.setBounds(70, 80, 60, 60);
        add(boton);
        boton.setSize(100,50);
        boton.setLayout(null);
        boton.setVisible(true);
        setLayout(null);// con est
    }
    
    private void iniciarComponentes(){ //crearmos este metodo private para que nadie externo o alguna clase acceda al metodo para modificarlo
        JPanel panel = new JPanel(); // objeto nombre = instanciarlo, aqui ya esta creado, pero hace falt aponerlo sobre la ventana
        panel.setBackground(Color.GREEN);
        this.getContentPane().add(panel);// cuando pongo this me refiero a la ventana al JFrame dirctamente, con getContentPane obtenemos el contenido de la ventana,   con add(panel) agregamos el panel a la ventana
    }
    
    
    
    
}
