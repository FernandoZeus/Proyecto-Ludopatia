package CRS0422EjemplodeColecciones;

import javax.swing.JPanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class ventanas3 {
	public static void main(String[] args) {
       JFrame ventana = new JFrame("Titulo de la ventana");
        ventana.setSize(400, 250);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel etiqueta = new JLabel("Se ha pulsado la tecla con codigo: XXXXX");
        etiqueta.setBorder(BorderFactory.createLineBorder(Color.RED));
        etiqueta.setForeground(Color.BLUE);
        ventana.addKeyListener(new KeyListener() {
           
        	public void keyTyped( KeyEvent teclado) {
            }

         
            public void keyReleased( KeyEvent teclado) {
            }

           
            public void keyPressed( KeyEvent teclado) {
                etiqueta.setText("Se ha pulsado la tecla con codigo: "+ teclado.getKeyCode());
            }
        });
        JPanel Panel = new JPanel();
        Panel.add(etiqueta);
        ventana.setContentPane(Panel);
        ventana.setVisible(true);
	}

}
