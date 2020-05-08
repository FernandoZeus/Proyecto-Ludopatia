package AM0422Tarea3;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;


public class Ejercicio5
{
    public static void main(final String[] args) {

    	final JFrame ventanaPrincipal = new JFrame("Ventana Ejercicio 5");
        ventanaPrincipal.setSize(400, 300);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
        final JLabel texto1 = new JLabel("No has pulsado el botón, prueba a pulsarlo.");
        final JButton botonPulsar = new JButton("¡¡Púlsame!!");
        
        botonPulsar.addActionListener(new ActionListener() {
            int contador = 0;

            @Override
            public void actionPerformed(final ActionEvent algo) {
            	
                contador++;
                
                if(contador == 1) {
                	texto1.setText("Has pulsado " + contador + " vez.");
                }else {
                	texto1.setText("Has pulsado " + contador + " veces.");
                }
            }
        });
        
        final JPanel panelVentana = new JPanel();
        
        panelVentana.add(texto1);
        panelVentana.add(botonPulsar);
        
        ventanaPrincipal.setContentPane(panelVentana);
        ventanaPrincipal.setVisible(true);
    }
}