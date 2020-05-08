package AM0422Tarea3;

import javax.swing.JPanel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Ejercicio2
{
    public static void main(final String[] args) {
    	
    	final JFrame ventanaPrincipal = new JFrame("Ventana Ejercicio 2");
	        
	    ventanaPrincipal.setSize(400, 300);
	    ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JLabel texto1 = new JLabel("Entra en la ventana para saber la posición del ratón");
        texto1.setBorder(BorderFactory.createLineBorder(Color.blue));
        texto1.setForeground(Color.green);
        
        ventanaPrincipal.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseMoved(final MouseEvent raton) {
                final Point localizacion = raton.getLocationOnScreen();
                texto1.setText("Posición de x: " + localizacion.x + " Posición de y: " + localizacion.y);
            }

            @Override
            public void mouseDragged(final MouseEvent raton) {
            }
        });
        
        final JPanel panelDeContenido = new JPanel();
        panelDeContenido.add(texto1);
        ventanaPrincipal.setContentPane(panelDeContenido);
        ventanaPrincipal.setVisible(true);
    }
}