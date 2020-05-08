package AM0422Tarea3;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Ejercicio3
{
    public static void main(final String[] args) {
    	
    	final JFrame ventanaPrincipal = new JFrame("Ventana Ejercicio 3");
        
	    ventanaPrincipal.setSize(400, 300);
	    ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JLabel texto1 = new JLabel("Se ha pulsado la tecla con el siguiente código: XXXXX");
        texto1.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        texto1.setForeground(Color.green);
        
        ventanaPrincipal.addKeyListener(new KeyListener() {
    		@Override
    		public void keyTyped(final KeyEvent teclaPulsada) {
    		}
    						
    		@Override
    		public void keyReleased(final KeyEvent teclaPulsada) {
    		}
    						
    		@Override
    		public void keyPressed(final KeyEvent teclaPulsada) {
    			
    			texto1.setText("Se ha pulsado la tecla con el código: " + teclaPulsada.getExtendedKeyCode());
    		}
    		});
        
        final JPanel contenidoPantalla = new JPanel();
        
        contenidoPantalla.add(texto1);
        
        ventanaPrincipal.setContentPane(contenidoPantalla);
        ventanaPrincipal.setVisible(true);
    }
}