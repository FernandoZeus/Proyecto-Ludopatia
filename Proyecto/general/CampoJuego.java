package general;


import java.awt.Color;

import javax.print.DocFlavor.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;


public class CampoJuego extends JPanel {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creación de ventana
		JFrame ventana = new JFrame("Juego");
		ventana.setSize(1024,1024 );
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		
		
		//creación de Jlabel que contenga la imagen
		JLabel imagenDeFondo = new JLabel(new ImageIcon(CampoJuego.class.getResource("/recursos/bety2.gif")));
		//imagenDeFondo.setBorder(BorderFactory.createLineBorder(Color.RED,5));
	
	
		//Contenedor que tenga todo
		JPanel panelDeContenido = new JPanel();
		panelDeContenido.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
		panelDeContenido.add(imagenDeFondo);
		ventana.setContentPane(panelDeContenido);
		panelDeContenido.setBackground(Color.ORANGE);
		
		// panelDeContenido.setBorder(BorderFactory.createLineBorder(Color.black));
	      // Border loweredbevel = BorderFactory.createLoweredBevelBorder();
	       // panelDeContenido.setBorder(loweredbevel);
	        Border border = BorderFactory.createLineBorder(Color.DARK_GRAY, 30);
	        panelDeContenido.setBorder(border);
	
	}

}
