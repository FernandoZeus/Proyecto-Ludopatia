package AM0422Tarea3;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Point;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Ejercicio4
{
    public static void main(final String[] args) {
    	
        final JFrame ventanaPrincipal = new JFrame("Ventana Ejercicio 4");
        ventanaPrincipal.setSize(400, 300);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        final JLabel texto1 = new JLabel("¿Dónde se encuentra el ratón?");
        
        texto1.setBorder(BorderFactory.createLineBorder(Color.green));
        texto1.setForeground(Color.blue);
        
        final JLabel texto2 = new JLabel("Entra en la ventana para saber la posición del ratón");
        texto2.setBorder(BorderFactory.createLineBorder(Color.blue));
        texto2.setForeground(Color.green);
        
        final JLabel texto3 = new JLabel("Se ha pulsado la tecla con el siguiente código: XXXXX");
        texto3.setBorder(BorderFactory.createLineBorder(Color.darkGray));
        texto3.setForeground(Color.green);
        
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
			       
        ventanaPrincipal.addMouseMotionListener(new MouseMotionListener() {
        	
        @Override
		public void mouseMoved(final MouseEvent raton) {
        	
			final Point localizacion = raton.getLocationOnScreen();
			
			texto2.setText("Posición de x: " + localizacion.x + " Posición de y: " + localizacion.y);
		}
			
		@Override
		public void mouseDragged(final MouseEvent raton) {
		}
		
		});

        ventanaPrincipal.addKeyListener(new KeyListener() {
		@Override
		public void keyTyped(final KeyEvent teclaEscrita) {
		}
						
		@Override
		public void keyReleased(final KeyEvent teclaLiberada) {
		}
						
		@Override
		public void keyPressed(final KeyEvent teclaPresionada) {
			texto3.setText(String.format("Se ha pulsado la tecla con código: %d", teclaPresionada.getKeyCode()));
		}
		});
        
        final JPanel panelVentana = new JPanel();
        
        panelVentana.add(texto1);
        panelVentana.add(texto2);
        panelVentana.add(texto3);
        
        ventanaPrincipal.setContentPane(panelVentana);
        ventanaPrincipal.setVisible(true);
    }
}