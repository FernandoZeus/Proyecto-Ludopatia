package AM0422Tarea3;

import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Ejercicio1 {
	    public static void main(final String[] args) {
	    	
	        final JFrame ventanaPrincipal = new JFrame("Ventana Ejercicio 1");
	        
	        ventanaPrincipal.setSize(400, 300);
	        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        final JLabel texto1 = new JLabel("¿Dónde se encuentra el ratón?");
	        
	        texto1.setBorder(BorderFactory.createLineBorder(Color.green));
	        texto1.setForeground(Color.blue);
	        
	        
	        ventanaPrincipal.addMouseListener(new MouseListener() {
	            @Override
	            public void mouseReleased(final MouseEvent raton) {
	            }

	            @Override
	            public void mousePressed(final MouseEvent raton) {
	            }

	            @Override
	            public void mouseExited(final MouseEvent raton) {
	            	texto1.setText("Has salido de la ventana, ¡¡vuelve!! ~~");
	            }

	            @Override
	            public void mouseEntered(final MouseEvent raton) {
	            	texto1.setText("¡¡HAS VUELTOOOOO!!");
	            }

	            @Override
	            public void mouseClicked(final MouseEvent raton) {
	            }
	        });
	        
	        final JPanel panelDeContenido = new JPanel();
	        panelDeContenido.add(texto1);
	        ventanaPrincipal.setContentPane(panelDeContenido);
	        ventanaPrincipal.setVisible(true);
	    }
}
